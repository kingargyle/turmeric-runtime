/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *******************************************************************************/
package org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.soaqetestimplfactoryservice.impl;

import org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.GetVersionRequest;
import org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.GetVersionResponse;
import org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.TestImplFactoryRequest;
import org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.TestImplFactoryResponse;
import org.ebayopensource.turmeric.qe.soaqetestimplfactoryservice.soaqetestimplfactoryservice.SOAQETestImplFactoryServiceV1;

public class QETestImpl2
    implements SOAQETestImplFactoryServiceV1
{
    public GetVersionResponse getVersion(GetVersionRequest param0) {
        return null;
    }


	@Override
	 public TestImplFactoryResponse testImplFactory(TestImplFactoryRequest param0) {
		TestImplFactoryResponse response = new TestImplFactoryResponse();
    	response.setOutput("2.Impl2");
        return response;
	}
}