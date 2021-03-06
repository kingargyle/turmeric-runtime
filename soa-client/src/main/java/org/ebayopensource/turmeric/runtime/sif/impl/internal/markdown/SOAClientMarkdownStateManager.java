/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.sif.impl.internal.markdown;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.ebayopensource.turmeric.runtime.common.impl.internal.markdown.SOABaseMarkdownStateManager;
import org.ebayopensource.turmeric.runtime.common.impl.internal.service.ServiceDesc;
import org.ebayopensource.turmeric.runtime.common.types.ServiceAddress;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.ClientServiceDesc;
import org.ebayopensource.turmeric.runtime.sif.pipeline.AutoMarkdownState;
import org.ebayopensource.turmeric.runtime.sif.pipeline.AutoMarkdownStateFactory;
import org.ebayopensource.turmeric.runtime.sif.pipeline.ClientMessageContext;

import com.ebay.kernel.markdown.IMarkdownStateManagerInitCtx;
import com.ebay.kernel.markdown.MarkdownStateManagerFactory;
import com.ebay.kernel.markdown.MarkdownStateSnapshot;

/**
 * @author ichernyshev
 */
public final class SOAClientMarkdownStateManager
	extends SOABaseMarkdownStateManager<SOAClientMarkdownStateId,SOAClientMarkdownState>
{
	private static SOAClientMarkdownStateManager s_instance;

	public static synchronized SOAClientMarkdownStateManager getInstance() {
		if (s_instance == null) {
			SOAClientMarkdownStateManager mgr = new SOAClientMarkdownStateManager();
			MarkdownStateManagerFactory.registerManager(mgr, "turmeric_client");
			s_instance = mgr;
		}

		return s_instance;
	}

	private SOAClientMarkdownStateManager() {
		// only local instances
	}

	@Override
	public void init(IMarkdownStateManagerInitCtx<SOAClientMarkdownStateId> ctx) {
		super.init(ctx);
		ctx.setDisplayName("SOA Client-Side Services");
	}

	public MarkdownStateSnapshot<SOAClientMarkdownStateId> getStateSnapshot(
		ClientServiceDesc svcDesc, String operation)
	{
		SOAClientMarkdownStateId id = new SOAClientMarkdownStateId(svcDesc.getAdminName(),
			operation, svcDesc.getClientName());

		return getStateSnapshot(id);
	}

	public MarkdownStateSnapshot<SOAClientMarkdownStateId> getMarkdownState(
		ClientServiceDesc svcDesc, String operation, ServiceAddress serviceAddress,
		boolean recordMissedCall)
	{
		SOAClientMarkdownStateId id = new SOAClientMarkdownStateId(svcDesc.getAdminName(),
			operation, svcDesc.getClientName());

		return checkMarkdownState(id, recordMissedCall);
	}

	@Override
	protected void postCreateStates(ServiceDesc svcDesc, Collection<SOAClientMarkdownStateId> ids) {
		super.postCreateStates(svcDesc, ids);

		ClientServiceDesc clientSvcDesc = (ClientServiceDesc)svcDesc;
		AutoMarkdownStateFactory factory = clientSvcDesc.getAutoMarkdownStateFactory();
		if (factory != null) {

			// we now have a location factor in place as well.
			// so, duplictae the list of ids for each location defined in the cc.xml as well
			if(clientSvcDesc.getServiceLocations()!=null && !clientSvcDesc.getServiceLocations().isEmpty()){ 
				List<SOAClientMarkdownStateId> locIds = new ArrayList<SOAClientMarkdownStateId>();
				
				for (SOAClientMarkdownStateId id: ids) {
					for(URL location:clientSvcDesc.getServiceLocations()){
						locIds.add(createSoaStateId(id.getAdminName(), id.getOperationName(), id.getSubname(), location.toString()));
					}
				}
				ids.addAll(locIds);
			}

			for (SOAClientMarkdownStateId id: ids) {

				SOAClientMarkdownState state;
				try {
					state = getState(id);
				} catch (Throwable e) {
					// this has already been logged by the createStates call
					continue;
				}

				setAutoMarkdownState(factory, id, state);
			}
		}
	}

	public AutoMarkdownState setAutoMarkdownState(
			AutoMarkdownStateFactory factory,
			SOAClientMarkdownStateId id, SOAClientMarkdownState state) {
		AutoMarkdownState autoState = null;
		if (!factory.isSvcLevelAutoMarkdown() || (id.getOperationName() == null && id.getClientName() == null))
		{
			autoState = factory.createAutoMarkdownState(
				id.getAdminName(), id.getOperationName(), id.getClientName());
		}

		state.setAutoMarkdownState(autoState, factory.isSvcLevelAutoMarkdown());
		return autoState;
	}


	@Override
	protected Collection<SOAClientMarkdownStateId> getParentIds(SOAClientMarkdownState primaryState) {
		if (primaryState.isSvcLevelAutoMarkdown()) {
			// add top level if we're not at the top level
			SOAClientMarkdownStateId id = primaryState.getId();
			if (id.getOperationName() == null && id.getClientName() == null) {
				// already at the top level
				return null;
			}

			Collection<SOAClientMarkdownStateId> result = new ArrayList<SOAClientMarkdownStateId>();
			result.add(createSoaStateId(id.getAdminName(), null, null, primaryState.getId().getLocation()));
			return result;
		}

		return super.getParentIds(primaryState);
	}

	@Override
	protected SOAClientMarkdownState createDefaultState(SOAClientMarkdownStateId id) {
		return new SOAClientMarkdownState(this, id);
	}

	@Override
	protected SOAClientMarkdownState createState(SOAClientMarkdownStateId id,
		MarkdownStateSnapshot<SOAClientMarkdownStateId> modelState)
	{
		return new SOAClientMarkdownState(this, id, modelState);
	}

	@Override
	protected boolean doesStateIdInclude(SOAClientMarkdownStateId outer, SOAClientMarkdownStateId inner) {
		if (!super.doesStateIdInclude(outer, inner)) {
			return false;
		}

		String outerClientName = outer.getClientName();
		if (outerClientName != null) {
			String innerClientName = inner.getClientName();
			if (innerClientName == null || !innerClientName.equals(outerClientName)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean isValidId(String idStr) {
		SOAClientMarkdownStateId id = SOAClientMarkdownStateId.parseIdSafe(idStr);
		if (id == null) {
			return false;
		}

		return true;
	}

	@Override
	public SOAClientMarkdownStateId parseId(String idStr) {
		return SOAClientMarkdownStateId.parseId(idStr);
	}


	@Override
	public SOAClientMarkdownStateId createSoaStateId(String adminName, String opName, String subname, String location) {
		return new SOAClientMarkdownStateId(adminName, opName, subname, location);
	}

	
	private SOAClientMarkdownStateId createId(ClientMessageContext ctx, URL location) {
		if(location!=null)
			return new SOAClientMarkdownStateId(ctx.getAdminName(), ctx.getOperationName(), ctx.getServiceId().getServiceSubname(), location.toString());
		return new SOAClientMarkdownStateId(ctx.getAdminName(), ctx.getOperationName(), ctx.getServiceId().getServiceSubname());
	}

	public void countError(ClientMessageContext ctx, Throwable e) {
		countError(ctx, e, null);
	}
	
	public void countError(ClientMessageContext ctx, Throwable e, URL location) {
		SOAClientMarkdownStateId id = createId(ctx, location);
		countError(id, ctx, e);
	}

	public void countSuccess(ClientMessageContext ctx) {
		countSuccess(ctx, null);
	}
	
	public void countSuccess(ClientMessageContext ctx, URL location) {
		SOAClientMarkdownStateId id = createId(ctx, location);
		countSuccess(id, ctx);
	}

}
