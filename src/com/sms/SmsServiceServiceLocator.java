/**
 * SmsServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public class SmsServiceServiceLocator extends org.apache.axis.client.Service implements com.sms.SmsServiceService {

    public SmsServiceServiceLocator() {
    }


    public SmsServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SmsServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SmsService
    private java.lang.String SmsService_address = "http://9.23.33.50:7001/wschinalife/services/SmsService";

    public java.lang.String getSmsServiceAddress() {
        return SmsService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SmsServiceWSDDServiceName = "SmsService";

    public java.lang.String getSmsServiceWSDDServiceName() {
        return SmsServiceWSDDServiceName;
    }

    public void setSmsServiceWSDDServiceName(java.lang.String name) {
        SmsServiceWSDDServiceName = name;
    }

    public com.sms.SmsService_PortType getSmsService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SmsService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSmsService(endpoint);
    }

    public com.sms.SmsService_PortType getSmsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sms.SmsServiceSoapBindingStub _stub = new com.sms.SmsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSmsServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSmsServiceEndpointAddress(java.lang.String address) {
        SmsService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sms.SmsService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sms.SmsServiceSoapBindingStub _stub = new com.sms.SmsServiceSoapBindingStub(new java.net.URL(SmsService_address), this);
                _stub.setPortName(getSmsServiceWSDDServiceName());
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
        if ("SmsService".equals(inputPortName)) {
            return getSmsService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://http.net.sms.wisdom.com", "SmsServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://http.net.sms.wisdom.com", "SmsService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SmsService".equals(portName)) {
            setSmsServiceEndpointAddress(address);
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
