/**
 * GSTCPolicyDownLoadServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package download;

public class GSTCPolicyDownLoadServiceLocator extends org.apache.axis.client.Service implements download.GSTCPolicyDownLoadService {

    public GSTCPolicyDownLoadServiceLocator() {
    }


    public GSTCPolicyDownLoadServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GSTCPolicyDownLoadServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GSTCPolicyDownLoadServiceHttpSoap11Endpoint
    private java.lang.String GSTCPolicyDownLoadServiceHttpSoap11Endpoint_address = "http://9.23.22.148:7001//webServiceCenter/services/GSTCPolicyDownLoadService.GSTCPolicyDownLoadServiceHttpSoap11Endpoint/";

    public java.lang.String getGSTCPolicyDownLoadServiceHttpSoap11EndpointAddress() {
        return GSTCPolicyDownLoadServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName = "GSTCPolicyDownLoadServiceHttpSoap11Endpoint";

    public java.lang.String getGSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName() {
        return GSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setGSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        GSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public download.GSTCPolicyDownLoadServicePortType getGSTCPolicyDownLoadServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GSTCPolicyDownLoadServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGSTCPolicyDownLoadServiceHttpSoap11Endpoint(endpoint);
    }

    public download.GSTCPolicyDownLoadServicePortType getGSTCPolicyDownLoadServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            download.GSTCPolicyDownLoadServiceSoap11BindingStub _stub = new download.GSTCPolicyDownLoadServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getGSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGSTCPolicyDownLoadServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        GSTCPolicyDownLoadServiceHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for GSTCPolicyDownLoadServiceHttpSoap12Endpoint
    private java.lang.String GSTCPolicyDownLoadServiceHttpSoap12Endpoint_address = "http://9.23.22.148:7001//webServiceCenter/services/GSTCPolicyDownLoadService.GSTCPolicyDownLoadServiceHttpSoap12Endpoint/";

    public java.lang.String getGSTCPolicyDownLoadServiceHttpSoap12EndpointAddress() {
        return GSTCPolicyDownLoadServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName = "GSTCPolicyDownLoadServiceHttpSoap12Endpoint";

    public java.lang.String getGSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName() {
        return GSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setGSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        GSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public download.GSTCPolicyDownLoadServicePortType getGSTCPolicyDownLoadServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GSTCPolicyDownLoadServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGSTCPolicyDownLoadServiceHttpSoap12Endpoint(endpoint);
    }

    public download.GSTCPolicyDownLoadServicePortType getGSTCPolicyDownLoadServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            download.GSTCPolicyDownLoadServiceSoap12BindingStub _stub = new download.GSTCPolicyDownLoadServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getGSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGSTCPolicyDownLoadServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        GSTCPolicyDownLoadServiceHttpSoap12Endpoint_address = address;
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
            if (download.GSTCPolicyDownLoadServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                download.GSTCPolicyDownLoadServiceSoap11BindingStub _stub = new download.GSTCPolicyDownLoadServiceSoap11BindingStub(new java.net.URL(GSTCPolicyDownLoadServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getGSTCPolicyDownLoadServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (download.GSTCPolicyDownLoadServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                download.GSTCPolicyDownLoadServiceSoap12BindingStub _stub = new download.GSTCPolicyDownLoadServiceSoap12BindingStub(new java.net.URL(GSTCPolicyDownLoadServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getGSTCPolicyDownLoadServiceHttpSoap12EndpointWSDDServiceName());
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
        if ("GSTCPolicyDownLoadServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getGSTCPolicyDownLoadServiceHttpSoap11Endpoint();
        }
        else if ("GSTCPolicyDownLoadServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getGSTCPolicyDownLoadServiceHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com", "GSTCPolicyDownLoadService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com", "GSTCPolicyDownLoadServiceHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://service.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com", "GSTCPolicyDownLoadServiceHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GSTCPolicyDownLoadServiceHttpSoap11Endpoint".equals(portName)) {
            setGSTCPolicyDownLoadServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("GSTCPolicyDownLoadServiceHttpSoap12Endpoint".equals(portName)) {
            setGSTCPolicyDownLoadServiceHttpSoap12EndpointEndpointAddress(address);
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
