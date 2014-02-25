/**
 * PxClientLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public class PxClientLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxClient.PxClient {

    public PxClientLocator() {
    }


    public PxClientLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxClientLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxClientSoap12
    private java.lang.String PxClientSoap12_address = "https://test-external.payex.com/pxclient/pxclient.asmx";

    public java.lang.String getPxClientSoap12Address() {
        return PxClientSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxClientSoap12WSDDServiceName = "PxClientSoap12";

    public java.lang.String getPxClientSoap12WSDDServiceName() {
        return PxClientSoap12WSDDServiceName;
    }

    public void setPxClientSoap12WSDDServiceName(java.lang.String name) {
        PxClientSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxClientSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxClientSoap12(endpoint);
    }

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxClient.PxClientSoap12Stub _stub = new test.com.payex.external.PxClient.PxClientSoap12Stub(portAddress, this);
            _stub.setPortName(getPxClientSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxClientSoap12EndpointAddress(java.lang.String address) {
        PxClientSoap12_address = address;
    }


    // Use to get a proxy class for PxClientSoap
    private java.lang.String PxClientSoap_address = "https://test-external.payex.com/pxclient/pxclient.asmx";

    public java.lang.String getPxClientSoapAddress() {
        return PxClientSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxClientSoapWSDDServiceName = "PxClientSoap";

    public java.lang.String getPxClientSoapWSDDServiceName() {
        return PxClientSoapWSDDServiceName;
    }

    public void setPxClientSoapWSDDServiceName(java.lang.String name) {
        PxClientSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxClientSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxClientSoap(endpoint);
    }

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxClient.PxClientSoapStub _stub = new test.com.payex.external.PxClient.PxClientSoapStub(portAddress, this);
            _stub.setPortName(getPxClientSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxClientSoapEndpointAddress(java.lang.String address) {
        PxClientSoap_address = address;
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
            if (test.com.payex.external.PxClient.PxClientSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxClient.PxClientSoap12Stub _stub = new test.com.payex.external.PxClient.PxClientSoap12Stub(new java.net.URL(PxClientSoap12_address), this);
                _stub.setPortName(getPxClientSoap12WSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxClient.PxClientSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxClient.PxClientSoapStub _stub = new test.com.payex.external.PxClient.PxClientSoapStub(new java.net.URL(PxClientSoap_address), this);
                _stub.setPortName(getPxClientSoapWSDDServiceName());
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
        if ("PxClientSoap12".equals(inputPortName)) {
            return getPxClientSoap12();
        }
        else if ("PxClientSoap".equals(inputPortName)) {
            return getPxClientSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxClient");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxClientSoap12"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxClientSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxClientSoap12".equals(portName)) {
            setPxClientSoap12EndpointAddress(address);
        }
        else 
if ("PxClientSoap".equals(portName)) {
            setPxClientSoapEndpointAddress(address);
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
