//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 06:38:32 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ebayopensource.turmeric.common.config package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GlobalServiceConfig_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "global-service-config");
    private final static QName _Service_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "service");
    private final static QName _GlobalIdList_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "global-id-list");
    private final static QName _ClientConfigList_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "client-config-list");
    private final static QName _GlobalClientConfig_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "global-client-config");
    private final static QName _ServiceConfig_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "service-config");
    private final static QName _SecurityPolicy_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "security-policy");
    private final static QName _ServiceCachePolicy_QNAME = new QName("http://www.ebayopensource.org/turmeric/common/config", "serviceCachePolicy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ebayopensource.turmeric.common.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataBindingConfig }
     * 
     */
    public DataBindingConfig createDataBindingConfig() {
        return new DataBindingConfig();
    }

    /**
     * Create an instance of {@link ClientConfigGroups }
     * 
     */
    public ClientConfigGroups createClientConfigGroups() {
        return new ClientConfigGroups();
    }

    /**
     * Create an instance of {@link GlobalIdConfig }
     * 
     */
    public GlobalIdConfig createGlobalIdConfig() {
        return new GlobalIdConfig();
    }

    /**
     * Create an instance of {@link TransportConfig }
     * 
     */
    public TransportConfig createTransportConfig() {
        return new TransportConfig();
    }

    /**
     * Create an instance of {@link ChainConfig }
     * 
     */
    public ChainConfig createChainConfig() {
        return new ChainConfig();
    }

    /**
     * Create an instance of {@link ServiceConfigGroups }
     * 
     */
    public ServiceConfigGroups createServiceConfigGroups() {
        return new ServiceConfigGroups();
    }

    /**
     * Create an instance of {@link CustomSerializerConfigList }
     * 
     */
    public CustomSerializerConfigList createCustomSerializerConfigList() {
        return new CustomSerializerConfigList();
    }

    /**
     * Create an instance of {@link MessageHeaderConfig }
     * 
     */
    public MessageHeaderConfig createMessageHeaderConfig() {
        return new MessageHeaderConfig();
    }

    /**
     * Create an instance of {@link JavaTypeListConfig }
     * 
     */
    public JavaTypeListConfig createJavaTypeListConfig() {
        return new JavaTypeListConfig();
    }

    /**
     * Create an instance of {@link ServerG11NOptions }
     * 
     */
    public ServerG11NOptions createServerG11NOptions() {
        return new ServerG11NOptions();
    }

    /**
     * Create an instance of {@link ServiceConfigGroup }
     * 
     */
    public ServiceConfigGroup createServiceConfigGroup() {
        return new ServiceConfigGroup();
    }

    /**
     * Create an instance of {@link CachePolicyConfig }
     * 
     */
    public CachePolicyConfig createCachePolicyConfig() {
        return new CachePolicyConfig();
    }

    /**
     * Create an instance of {@link ProviderOptions }
     * 
     */
    public ProviderOptions createProviderOptions() {
        return new ProviderOptions();
    }

    /**
     * Create an instance of {@link LocaleInfoConfig }
     * 
     */
    public LocaleInfoConfig createLocaleInfoConfig() {
        return new LocaleInfoConfig();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link ClientConfigGroup }
     * 
     */
    public ClientConfigGroup createClientConfigGroup() {
        return new ClientConfigGroup();
    }

    /**
     * Create an instance of {@link OperationRequestParamMapping }
     * 
     */
    public OperationRequestParamMapping createOperationRequestParamMapping() {
        return new OperationRequestParamMapping();
    }

    /**
     * Create an instance of {@link SerializerConfig }
     * 
     */
    public SerializerConfig createSerializerConfig() {
        return new SerializerConfig();
    }

    /**
     * Create an instance of {@link ClientConfig }
     * 
     */
    public ClientConfig createClientConfig() {
        return new ClientConfig();
    }

    /**
     * Create an instance of {@link RetryOptions }
     * 
     */
    public RetryOptions createRetryOptions() {
        return new RetryOptions();
    }

    /**
     * Create an instance of {@link HandlerConfig }
     * 
     */
    public HandlerConfig createHandlerConfig() {
        return new HandlerConfig();
    }

    /**
     * Create an instance of {@link PipelineClassConfig }
     * 
     */
    public PipelineClassConfig createPipelineClassConfig() {
        return new PipelineClassConfig();
    }

    /**
     * Create an instance of {@link AuthorizationConfig }
     * 
     */
    public AuthorizationConfig createAuthorizationConfig() {
        return new AuthorizationConfig();
    }

    /**
     * Create an instance of {@link GlobalIdListConfig }
     * 
     */
    public GlobalIdListConfig createGlobalIdListConfig() {
        return new GlobalIdListConfig();
    }

    /**
     * Create an instance of {@link StorageProviderConfig }
     * 
     */
    public StorageProviderConfig createStorageProviderConfig() {
        return new StorageProviderConfig();
    }

    /**
     * Create an instance of {@link ErrorStatusOptions }
     * 
     */
    public ErrorStatusOptions createErrorStatusOptions() {
        return new ErrorStatusOptions();
    }

    /**
     * Create an instance of {@link ServiceTypeMappingConfig }
     * 
     */
    public ServiceTypeMappingConfig createServiceTypeMappingConfig() {
        return new ServiceTypeMappingConfig();
    }

    /**
     * Create an instance of {@link MarkdownOptions }
     * 
     */
    public MarkdownOptions createMarkdownOptions() {
        return new MarkdownOptions();
    }

    /**
     * Create an instance of {@link CustomSerializerConfig }
     * 
     */
    public CustomSerializerConfig createCustomSerializerConfig() {
        return new CustomSerializerConfig();
    }

    /**
     * Create an instance of {@link OperationConfig }
     * 
     */
    public OperationConfig createOperationConfig() {
        return new OperationConfig();
    }

    /**
     * Create an instance of {@link TypeConverterConfig }
     * 
     */
    public TypeConverterConfig createTypeConverterConfig() {
        return new TypeConverterConfig();
    }

    /**
     * Create an instance of {@link MessageTypeConfig }
     * 
     */
    public MessageTypeConfig createMessageTypeConfig() {
        return new MessageTypeConfig();
    }

    /**
     * Create an instance of {@link RequestParam }
     * 
     */
    public RequestParam createRequestParam() {
        return new RequestParam();
    }

    /**
     * Create an instance of {@link RequestParamMapping }
     * 
     */
    public RequestParamMapping createRequestParamMapping() {
        return new RequestParamMapping();
    }

    /**
     * Create an instance of {@link TransportOptionConfig }
     * 
     */
    public TransportOptionConfig createTransportOptionConfig() {
        return new TransportOptionConfig();
    }

    /**
     * Create an instance of {@link ServiceLayerNames }
     * 
     */
    public ServiceLayerNames createServiceLayerNames() {
        return new ServiceLayerNames();
    }

    /**
     * Create an instance of {@link ServiceCachePolicyType }
     * 
     */
    public ServiceCachePolicyType createServiceCachePolicyType() {
        return new ServiceCachePolicyType();
    }

    /**
     * Create an instance of {@link ClientGroupConfig }
     * 
     */
    public ClientGroupConfig createClientGroupConfig() {
        return new ClientGroupConfig();
    }

    /**
     * Create an instance of {@link ThreadPoolConfig }
     * 
     */
    public ThreadPoolConfig createThreadPoolConfig() {
        return new ThreadPoolConfig();
    }

    /**
     * Create an instance of {@link FeatureIndicatorConfig }
     * 
     */
    public FeatureIndicatorConfig createFeatureIndicatorConfig() {
        return new FeatureIndicatorConfig();
    }

    /**
     * Create an instance of {@link PackageMapConfig }
     * 
     */
    public PackageMapConfig createPackageMapConfig() {
        return new PackageMapConfig();
    }

    /**
     * Create an instance of {@link OptionList }
     * 
     */
    public OptionList createOptionList() {
        return new OptionList();
    }

    /**
     * Create an instance of {@link MonitorConfig }
     * 
     */
    public MonitorConfig createMonitorConfig() {
        return new MonitorConfig();
    }

    /**
     * Create an instance of {@link PackageConfig }
     * 
     */
    public PackageConfig createPackageConfig() {
        return new PackageConfig();
    }

    /**
     * Create an instance of {@link KeyExpressionSetType }
     * 
     */
    public KeyExpressionSetType createKeyExpressionSetType() {
        return new KeyExpressionSetType();
    }

    /**
     * Create an instance of {@link ClientG11NOptionConfig }
     * 
     */
    public ClientG11NOptionConfig createClientG11NOptionConfig() {
        return new ClientG11NOptionConfig();
    }

    /**
     * Create an instance of {@link ServiceLocationMapping }
     * 
     */
    public ServiceLocationMapping createServiceLocationMapping() {
        return new ServiceLocationMapping();
    }

    /**
     * Create an instance of {@link ServiceLocationMappingList }
     * 
     */
    public ServiceLocationMappingList createServiceLocationMappingList() {
        return new ServiceLocationMappingList();
    }

    /**
     * Create an instance of {@link RestOptionType }
     * 
     */
    public RestOptionType createRestOptionType() {
        return new RestOptionType();
    }

    /**
     * Create an instance of {@link AuthenticationConfig }
     * 
     */
    public AuthenticationConfig createAuthenticationConfig() {
        return new AuthenticationConfig();
    }

    /**
     * Create an instance of {@link OperationListConfig }
     * 
     */
    public OperationListConfig createOperationListConfig() {
        return new OperationListConfig();
    }

    /**
     * Create an instance of {@link OperationSecurityConfig }
     * 
     */
    public OperationSecurityConfig createOperationSecurityConfig() {
        return new OperationSecurityConfig();
    }

    /**
     * Create an instance of {@link PipelineConfig }
     * 
     */
    public PipelineConfig createPipelineConfig() {
        return new PipelineConfig();
    }

    /**
     * Create an instance of {@link OperationCachePolicyType }
     * 
     */
    public OperationCachePolicyType createOperationCachePolicyType() {
        return new OperationCachePolicyType();
    }

    /**
     * Create an instance of {@link ProtocolProcessorConfig }
     * 
     */
    public ProtocolProcessorConfig createProtocolProcessorConfig() {
        return new ProtocolProcessorConfig();
    }

    /**
     * Create an instance of {@link GlobalServiceConfig }
     * 
     */
    public GlobalServiceConfig createGlobalServiceConfig() {
        return new GlobalServiceConfig();
    }

    /**
     * Create an instance of {@link ClientConfigList }
     * 
     */
    public ClientConfigList createClientConfigList() {
        return new ClientConfigList();
    }

    /**
     * Create an instance of {@link FrameworkHandlerConfig }
     * 
     */
    public FrameworkHandlerConfig createFrameworkHandlerConfig() {
        return new FrameworkHandlerConfig();
    }

    /**
     * Create an instance of {@link ServiceSecurityConfig }
     * 
     */
    public ServiceSecurityConfig createServiceSecurityConfig() {
        return new ServiceSecurityConfig();
    }

    /**
     * Create an instance of {@link InvocationOptionConfig }
     * 
     */
    public InvocationOptionConfig createInvocationOptionConfig() {
        return new InvocationOptionConfig();
    }

    /**
     * Create an instance of {@link ServiceConfig }
     * 
     */
    public ServiceConfig createServiceConfig() {
        return new ServiceConfig();
    }

    /**
     * Create an instance of {@link ServiceGroupConfig }
     * 
     */
    public ServiceGroupConfig createServiceGroupConfig() {
        return new ServiceGroupConfig();
    }

    /**
     * Create an instance of {@link GlobalClientConfig }
     * 
     */
    public GlobalClientConfig createGlobalClientConfig() {
        return new GlobalClientConfig();
    }

    /**
     * Create an instance of {@link PipelineTreeConfig }
     * 
     */
    public PipelineTreeConfig createPipelineTreeConfig() {
        return new PipelineTreeConfig();
    }

    /**
     * Create an instance of {@link PreferredTransportConfig }
     * 
     */
    public PreferredTransportConfig createPreferredTransportConfig() {
        return new PreferredTransportConfig();
    }

    /**
     * Create an instance of {@link RequestParamOptionList }
     * 
     */
    public RequestParamOptionList createRequestParamOptionList() {
        return new RequestParamOptionList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalServiceConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "global-service-config")
    public JAXBElement<GlobalServiceConfig> createGlobalServiceConfig(GlobalServiceConfig value) {
        return new JAXBElement<GlobalServiceConfig>(_GlobalServiceConfig_QNAME, GlobalServiceConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTypeMappingConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "service")
    public JAXBElement<ServiceTypeMappingConfig> createService(ServiceTypeMappingConfig value) {
        return new JAXBElement<ServiceTypeMappingConfig>(_Service_QNAME, ServiceTypeMappingConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalIdListConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "global-id-list")
    public JAXBElement<GlobalIdListConfig> createGlobalIdList(GlobalIdListConfig value) {
        return new JAXBElement<GlobalIdListConfig>(_GlobalIdList_QNAME, GlobalIdListConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientConfigList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "client-config-list")
    public JAXBElement<ClientConfigList> createClientConfigList(ClientConfigList value) {
        return new JAXBElement<ClientConfigList>(_ClientConfigList_QNAME, ClientConfigList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalClientConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "global-client-config")
    public JAXBElement<GlobalClientConfig> createGlobalClientConfig(GlobalClientConfig value) {
        return new JAXBElement<GlobalClientConfig>(_GlobalClientConfig_QNAME, GlobalClientConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "service-config")
    public JAXBElement<ServiceConfig> createServiceConfig(ServiceConfig value) {
        return new JAXBElement<ServiceConfig>(_ServiceConfig_QNAME, ServiceConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceSecurityConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "security-policy")
    public JAXBElement<ServiceSecurityConfig> createSecurityPolicy(ServiceSecurityConfig value) {
        return new JAXBElement<ServiceSecurityConfig>(_SecurityPolicy_QNAME, ServiceSecurityConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCachePolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebayopensource.org/turmeric/common/config", name = "serviceCachePolicy")
    public JAXBElement<ServiceCachePolicyType> createServiceCachePolicy(ServiceCachePolicyType value) {
        return new JAXBElement<ServiceCachePolicyType>(_ServiceCachePolicy_QNAME, ServiceCachePolicyType.class, null, value);
    }

}