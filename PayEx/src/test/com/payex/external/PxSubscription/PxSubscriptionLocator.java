/**
 * PxSubscriptionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxSubscription;

public class PxSubscriptionLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxSubscription.PxSubscription {

    public PxSubscriptionLocator() {
    }


    public PxSubscriptionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxSubscriptionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxSubscriptionSoap12
    private java.lang.String PxSubscriptionSoap12_address = "https://test-external.payex.com/pxsubscription/pxsubscription.asmx";

    public java.lang.String getPxSubscriptionSoap12Address() {
        return PxSubscriptionSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxSubscriptionSoap12WSDDServiceName = "PxSubscriptionSoap12";

    public java.lang.String getPxSubscriptionSoap12WSDDServiceName() {
        return PxSubscriptionSoap12WSDDServiceName;
    }

    public void setPxSubscriptionSoap12WSDDServiceName(java.lang.String name) {
        PxSubscriptionSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxSubscriptionSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxSubscriptionSoap12(endpoint);
    }

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxSubscription.PxSubscriptionSoap12Stub _stub = new test.com.payex.external.PxSubscription.PxSubscriptionSoap12Stub(portAddress, this);
            _stub.setPortName(getPxSubscriptionSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxSubscriptionSoap12EndpointAddress(java.lang.String address) {
        PxSubscriptionSoap12_address = address;
    }


    // Use to get a proxy class for PxSubscriptionSoap
    private java.lang.String PxSubscriptionSoap_address = "https://test-external.payex.com/pxsubscription/pxsubscription.asmx";

    public java.lang.String getPxSubscriptionSoapAddress() {
        return PxSubscriptionSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxSubscriptionSoapWSDDServiceName = "PxSubscriptionSoap";

    public java.lang.String getPxSubscriptionSoapWSDDServiceName() {
        return PxSubscriptionSoapWSDDServiceName;
    }

    public void setPxSubscriptionSoapWSDDServiceName(java.lang.String name) {
        PxSubscriptionSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxSubscriptionSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxSubscriptionSoap(endpoint);
    }

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxSubscription.PxSubscriptionSoapStub _stub = new test.com.payex.external.PxSubscription.PxSubscriptionSoapStub(portAddress, this);
            _stub.setPortName(getPxSubscriptionSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxSubscriptionSoapEndpointAddress(java.lang.String address) {
        PxSubscriptionSoap_address = address;
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
            if (test.com.payex.external.PxSubscription.PxSubscriptionSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxSubscription.PxSubscriptionSoap12Stub _stub = new test.com.payex.external.PxSubscription.PxSubscriptionSoap12Stub(new java.net.URL(PxSubscriptionSoap12_address), this);
                _stub.setPortName(getPxSubscriptionSoap12WSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxSubscription.PxSubscriptionSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxSubscription.PxSubscriptionSoapStub _stub = new test.com.payex.external.PxSubscription.PxSubscriptionSoapStub(new java.net.URL(PxSubscriptionSoap_address), this);
                _stub.setPortName(getPxSubscriptionSoapWSDDServiceName());
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
        if ("PxSubscriptionSoap12".equals(inputPortName)) {
            return getPxSubscriptionSoap12();
        }
        else if ("PxSubscriptionSoap".equals(inputPortName)) {
            return getPxSubscriptionSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxSubscription/", "PxSubscription");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxSubscription/", "PxSubscriptionSoap12"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxSubscription/", "PxSubscriptionSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxSubscriptionSoap12".equals(portName)) {
            setPxSubscriptionSoap12EndpointAddress(address);
        }
        else 
if ("PxSubscriptionSoap".equals(portName)) {
            setPxSubscriptionSoapEndpointAddress(address);
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
