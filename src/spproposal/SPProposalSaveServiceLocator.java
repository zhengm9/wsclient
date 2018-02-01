/**
 * SPProposalSaveServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class SPProposalSaveServiceLocator extends org.apache.axis.client.Service implements spproposal.SPProposalSaveService {

    public SPProposalSaveServiceLocator() {
    }


    public SPProposalSaveServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SPProposalSaveServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SPProposalSaveServiceHttpSoap11Endpoint
    private java.lang.String SPProposalSaveServiceHttpSoap11Endpoint_address = "http://9.23.22.166:7001/webServiceCenter/services/SPProposalSaveService.SPProposalSaveServiceHttpSoap11Endpoint/";

    public java.lang.String getSPProposalSaveServiceHttpSoap11EndpointAddress() {
        return SPProposalSaveServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SPProposalSaveServiceHttpSoap11EndpointWSDDServiceName = "SPProposalSaveServiceHttpSoap11Endpoint";

    public java.lang.String getSPProposalSaveServiceHttpSoap11EndpointWSDDServiceName() {
        return SPProposalSaveServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setSPProposalSaveServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        SPProposalSaveServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public spproposal.SPProposalSaveServicePortType getSPProposalSaveServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SPProposalSaveServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSPProposalSaveServiceHttpSoap11Endpoint(endpoint);
    }

    public spproposal.SPProposalSaveServicePortType getSPProposalSaveServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            spproposal.SPProposalSaveServiceSoap11BindingStub _stub = new spproposal.SPProposalSaveServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getSPProposalSaveServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSPProposalSaveServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        SPProposalSaveServiceHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for SPProposalSaveServiceHttpSoap12Endpoint
    private java.lang.String SPProposalSaveServiceHttpSoap12Endpoint_address = "http://9.23.22.166:7001/webServiceCenter/services/SPProposalSaveService.SPProposalSaveServiceHttpSoap12Endpoint/";

    public java.lang.String getSPProposalSaveServiceHttpSoap12EndpointAddress() {
        return SPProposalSaveServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SPProposalSaveServiceHttpSoap12EndpointWSDDServiceName = "SPProposalSaveServiceHttpSoap12Endpoint";

    public java.lang.String getSPProposalSaveServiceHttpSoap12EndpointWSDDServiceName() {
        return SPProposalSaveServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setSPProposalSaveServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        SPProposalSaveServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public spproposal.SPProposalSaveServicePortType getSPProposalSaveServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SPProposalSaveServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSPProposalSaveServiceHttpSoap12Endpoint(endpoint);
    }

    public spproposal.SPProposalSaveServicePortType getSPProposalSaveServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            spproposal.SPProposalSaveServiceSoap12BindingStub _stub = new spproposal.SPProposalSaveServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getSPProposalSaveServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSPProposalSaveServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        SPProposalSaveServiceHttpSoap12Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (spproposal.SPProposalSaveServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                spproposal.SPProposalSaveServiceSoap11BindingStub _stub = new spproposal.SPProposalSaveServiceSoap11BindingStub(new java.net.URL(SPProposalSaveServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getSPProposalSaveServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (spproposal.SPProposalSaveServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                spproposal.SPProposalSaveServiceSoap12BindingStub _stub = new spproposal.SPProposalSaveServiceSoap12BindingStub(new java.net.URL(SPProposalSaveServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getSPProposalSaveServiceHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SPProposalSaveServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getSPProposalSaveServiceHttpSoap11Endpoint();
        }
        else if ("SPProposalSaveServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getSPProposalSaveServiceHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.proposalSave.brokenScreen.webServiceCenter.sinosoft.com", "SPProposalSaveService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.proposalSave.brokenScreen.webServiceCenter.sinosoft.com", "SPProposalSaveServiceHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://service.proposalSave.brokenScreen.webServiceCenter.sinosoft.com", "SPProposalSaveServiceHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SPProposalSaveServiceHttpSoap11Endpoint".equals(portName)) {
            setSPProposalSaveServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("SPProposalSaveServiceHttpSoap12Endpoint".equals(portName)) {
            setSPProposalSaveServiceHttpSoap12EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
