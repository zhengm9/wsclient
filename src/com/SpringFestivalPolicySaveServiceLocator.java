/**
 * SpringFestivalPolicySaveServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class SpringFestivalPolicySaveServiceLocator extends org.apache.axis.client.Service implements com.SpringFestivalPolicySaveService {

    public SpringFestivalPolicySaveServiceLocator() {
    }


    public SpringFestivalPolicySaveServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SpringFestivalPolicySaveServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SpringFestivalPolicySaveServiceHttpSoap11Endpoint
    private java.lang.String SpringFestivalPolicySaveServiceHttpSoap11Endpoint_address = "http://172.2.0.39:7001//webServiceCenter/services/SpringFestivalPolicySaveService.SpringFestivalPolicySaveServiceHttpSoap11Endpoint/";

    public java.lang.String getSpringFestivalPolicySaveServiceHttpSoap11EndpointAddress() {
        return SpringFestivalPolicySaveServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName = "SpringFestivalPolicySaveServiceHttpSoap11Endpoint";

    public java.lang.String getSpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName() {
        return SpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setSpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        SpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.SpringFestivalPolicySaveServicePortType getSpringFestivalPolicySaveServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SpringFestivalPolicySaveServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSpringFestivalPolicySaveServiceHttpSoap11Endpoint(endpoint);
    }

    public com.SpringFestivalPolicySaveServicePortType getSpringFestivalPolicySaveServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.SpringFestivalPolicySaveServiceSoap11BindingStub _stub = new com.SpringFestivalPolicySaveServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getSpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSpringFestivalPolicySaveServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        SpringFestivalPolicySaveServiceHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for SpringFestivalPolicySaveServiceHttpSoap12Endpoint
    private java.lang.String SpringFestivalPolicySaveServiceHttpSoap12Endpoint_address = "http://172.2.0.39:7001//webServiceCenter/services/SpringFestivalPolicySaveService.SpringFestivalPolicySaveServiceHttpSoap12Endpoint/";

    public java.lang.String getSpringFestivalPolicySaveServiceHttpSoap12EndpointAddress() {
        return SpringFestivalPolicySaveServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName = "SpringFestivalPolicySaveServiceHttpSoap12Endpoint";

    public java.lang.String getSpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName() {
        return SpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setSpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        SpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.SpringFestivalPolicySaveServicePortType getSpringFestivalPolicySaveServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SpringFestivalPolicySaveServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSpringFestivalPolicySaveServiceHttpSoap12Endpoint(endpoint);
    }

    public com.SpringFestivalPolicySaveServicePortType getSpringFestivalPolicySaveServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.SpringFestivalPolicySaveServiceSoap12BindingStub _stub = new com.SpringFestivalPolicySaveServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getSpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSpringFestivalPolicySaveServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        SpringFestivalPolicySaveServiceHttpSoap12Endpoint_address = address;
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
            if (com.SpringFestivalPolicySaveServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.SpringFestivalPolicySaveServiceSoap11BindingStub _stub = new com.SpringFestivalPolicySaveServiceSoap11BindingStub(new java.net.URL(SpringFestivalPolicySaveServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getSpringFestivalPolicySaveServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (com.SpringFestivalPolicySaveServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.SpringFestivalPolicySaveServiceSoap12BindingStub _stub = new com.SpringFestivalPolicySaveServiceSoap12BindingStub(new java.net.URL(SpringFestivalPolicySaveServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getSpringFestivalPolicySaveServiceHttpSoap12EndpointWSDDServiceName());
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
        if ("SpringFestivalPolicySaveServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getSpringFestivalPolicySaveServiceHttpSoap11Endpoint();
        }
        else if ("SpringFestivalPolicySaveServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getSpringFestivalPolicySaveServiceHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com", "SpringFestivalPolicySaveService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com", "SpringFestivalPolicySaveServiceHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://service.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com", "SpringFestivalPolicySaveServiceHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SpringFestivalPolicySaveServiceHttpSoap11Endpoint".equals(portName)) {
            setSpringFestivalPolicySaveServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("SpringFestivalPolicySaveServiceHttpSoap12Endpoint".equals(portName)) {
            setSpringFestivalPolicySaveServiceHttpSoap12EndpointEndpointAddress(address);
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
