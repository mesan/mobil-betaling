/**
 * PxOrderLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.confined.PxOrder;

public class PxOrderLocator extends org.apache.axis.client.Service implements com.payex.confined.PxOrder.PxOrder {

    public PxOrderLocator() {
    }


    public PxOrderLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxOrderLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxOrderSoap
    private java.lang.String PxOrderSoap_address = "http://confined.payex.com/pxconfined/pxorder.asmx";

    public java.lang.String getPxOrderSoapAddress() {
        return PxOrderSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxOrderSoapWSDDServiceName = "PxOrderSoap";

    public java.lang.String getPxOrderSoapWSDDServiceName() {
        return PxOrderSoapWSDDServiceName;
    }

    public void setPxOrderSoapWSDDServiceName(java.lang.String name) {
        PxOrderSoapWSDDServiceName = name;
    }

    public com.payex.confined.PxOrder.PxOrderSoap getPxOrderSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxOrderSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxOrderSoap(endpoint);
    }

    public com.payex.confined.PxOrder.PxOrderSoap getPxOrderSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.payex.confined.PxOrder.PxOrderSoapStub _stub = new com.payex.confined.PxOrder.PxOrderSoapStub(portAddress, this);
            _stub.setPortName(getPxOrderSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxOrderSoapEndpointAddress(java.lang.String address) {
        PxOrderSoap_address = address;
    }


    // Use to get a proxy class for PxOrderSoap12
    private java.lang.String PxOrderSoap12_address = "http://confined.payex.com/pxconfined/pxorder.asmx";

    public java.lang.String getPxOrderSoap12Address() {
        return PxOrderSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxOrderSoap12WSDDServiceName = "PxOrderSoap12";

    public java.lang.String getPxOrderSoap12WSDDServiceName() {
        return PxOrderSoap12WSDDServiceName;
    }

    public void setPxOrderSoap12WSDDServiceName(java.lang.String name) {
        PxOrderSoap12WSDDServiceName = name;
    }

    public com.payex.confined.PxOrder.PxOrderSoap getPxOrderSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxOrderSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxOrderSoap12(endpoint);
    }

    public com.payex.confined.PxOrder.PxOrderSoap getPxOrderSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.payex.confined.PxOrder.PxOrderSoap12Stub _stub = new com.payex.confined.PxOrder.PxOrderSoap12Stub(portAddress, this);
            _stub.setPortName(getPxOrderSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxOrderSoap12EndpointAddress(java.lang.String address) {
        PxOrderSoap12_address = address;
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
            if (com.payex.confined.PxOrder.PxOrderSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.payex.confined.PxOrder.PxOrderSoapStub _stub = new com.payex.confined.PxOrder.PxOrderSoapStub(new java.net.URL(PxOrderSoap_address), this);
                _stub.setPortName(getPxOrderSoapWSDDServiceName());
                return _stub;
            }
            if (com.payex.confined.PxOrder.PxOrderSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.payex.confined.PxOrder.PxOrderSoap12Stub _stub = new com.payex.confined.PxOrder.PxOrderSoap12Stub(new java.net.URL(PxOrderSoap12_address), this);
                _stub.setPortName(getPxOrderSoap12WSDDServiceName());
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
        if ("PxOrderSoap".equals(inputPortName)) {
            return getPxOrderSoap();
        }
        else if ("PxOrderSoap12".equals(inputPortName)) {
            return getPxOrderSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://confined.payex.com/PxOrder/", "PxOrder");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://confined.payex.com/PxOrder/", "PxOrderSoap"));
            ports.add(new javax.xml.namespace.QName("http://confined.payex.com/PxOrder/", "PxOrderSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxOrderSoap".equals(portName)) {
            setPxOrderSoapEndpointAddress(address);
        }
        else 
if ("PxOrderSoap12".equals(portName)) {
            setPxOrderSoap12EndpointAddress(address);
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
