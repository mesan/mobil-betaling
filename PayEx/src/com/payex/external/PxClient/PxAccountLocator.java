/**
 * PxAccountLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.external.PxClient;

public class PxAccountLocator extends org.apache.axis.client.Service implements com.payex.external.PxClient.PxAccount {

    public PxAccountLocator() {
    }


    public PxAccountLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxAccountLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxAccountSoap
    private java.lang.String PxAccountSoap_address = "https://external.payex.com/pxclient/pxaccount.asmx";

    public java.lang.String getPxAccountSoapAddress() {
        return PxAccountSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxAccountSoapWSDDServiceName = "PxAccountSoap";

    public java.lang.String getPxAccountSoapWSDDServiceName() {
        return PxAccountSoapWSDDServiceName;
    }

    public void setPxAccountSoapWSDDServiceName(java.lang.String name) {
        PxAccountSoapWSDDServiceName = name;
    }

    public com.payex.external.PxClient.PxAccountSoap getPxAccountSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxAccountSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxAccountSoap(endpoint);
    }

    public com.payex.external.PxClient.PxAccountSoap getPxAccountSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.payex.external.PxClient.PxAccountSoapStub _stub = new com.payex.external.PxClient.PxAccountSoapStub(portAddress, this);
            _stub.setPortName(getPxAccountSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxAccountSoapEndpointAddress(java.lang.String address) {
        PxAccountSoap_address = address;
    }


    // Use to get a proxy class for PxAccountSoap12
    private java.lang.String PxAccountSoap12_address = "https://external.payex.com/pxclient/pxaccount.asmx";

    public java.lang.String getPxAccountSoap12Address() {
        return PxAccountSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxAccountSoap12WSDDServiceName = "PxAccountSoap12";

    public java.lang.String getPxAccountSoap12WSDDServiceName() {
        return PxAccountSoap12WSDDServiceName;
    }

    public void setPxAccountSoap12WSDDServiceName(java.lang.String name) {
        PxAccountSoap12WSDDServiceName = name;
    }

    public com.payex.external.PxClient.PxAccountSoap getPxAccountSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxAccountSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxAccountSoap12(endpoint);
    }

    public com.payex.external.PxClient.PxAccountSoap getPxAccountSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.payex.external.PxClient.PxAccountSoap12Stub _stub = new com.payex.external.PxClient.PxAccountSoap12Stub(portAddress, this);
            _stub.setPortName(getPxAccountSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxAccountSoap12EndpointAddress(java.lang.String address) {
        PxAccountSoap12_address = address;
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
            if (com.payex.external.PxClient.PxAccountSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.payex.external.PxClient.PxAccountSoapStub _stub = new com.payex.external.PxClient.PxAccountSoapStub(new java.net.URL(PxAccountSoap_address), this);
                _stub.setPortName(getPxAccountSoapWSDDServiceName());
                return _stub;
            }
            if (com.payex.external.PxClient.PxAccountSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.payex.external.PxClient.PxAccountSoap12Stub _stub = new com.payex.external.PxClient.PxAccountSoap12Stub(new java.net.URL(PxAccountSoap12_address), this);
                _stub.setPortName(getPxAccountSoap12WSDDServiceName());
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
        if ("PxAccountSoap".equals(inputPortName)) {
            return getPxAccountSoap();
        }
        else if ("PxAccountSoap12".equals(inputPortName)) {
            return getPxAccountSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxAccount");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxAccountSoap"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxAccountSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxAccountSoap".equals(portName)) {
            setPxAccountSoapEndpointAddress(address);
        }
        else 
if ("PxAccountSoap12".equals(portName)) {
            setPxAccountSoap12EndpointAddress(address);
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
