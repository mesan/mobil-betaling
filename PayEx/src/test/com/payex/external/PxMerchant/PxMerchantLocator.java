/**
 * PxMerchantLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxMerchant;

public class PxMerchantLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxMerchant.PxMerchant {

    public PxMerchantLocator() {
    }


    public PxMerchantLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxMerchantLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxMerchantSoap
    private java.lang.String PxMerchantSoap_address = "https://test-external.payex.com/pxmerchant/pxmerchant.asmx";

    public java.lang.String getPxMerchantSoapAddress() {
        return PxMerchantSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxMerchantSoapWSDDServiceName = "PxMerchantSoap";

    public java.lang.String getPxMerchantSoapWSDDServiceName() {
        return PxMerchantSoapWSDDServiceName;
    }

    public void setPxMerchantSoapWSDDServiceName(java.lang.String name) {
        PxMerchantSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxMerchantSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxMerchantSoap(endpoint);
    }

    public test.com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxMerchant.PxMerchantSoapStub _stub = new test.com.payex.external.PxMerchant.PxMerchantSoapStub(portAddress, this);
            _stub.setPortName(getPxMerchantSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxMerchantSoapEndpointAddress(java.lang.String address) {
        PxMerchantSoap_address = address;
    }


    // Use to get a proxy class for PxMerchantSoap12
    private java.lang.String PxMerchantSoap12_address = "https://test-external.payex.com/pxmerchant/pxmerchant.asmx";

    public java.lang.String getPxMerchantSoap12Address() {
        return PxMerchantSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxMerchantSoap12WSDDServiceName = "PxMerchantSoap12";

    public java.lang.String getPxMerchantSoap12WSDDServiceName() {
        return PxMerchantSoap12WSDDServiceName;
    }

    public void setPxMerchantSoap12WSDDServiceName(java.lang.String name) {
        PxMerchantSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxMerchantSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxMerchantSoap12(endpoint);
    }

    public test.com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxMerchant.PxMerchantSoap12Stub _stub = new test.com.payex.external.PxMerchant.PxMerchantSoap12Stub(portAddress, this);
            _stub.setPortName(getPxMerchantSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxMerchantSoap12EndpointAddress(java.lang.String address) {
        PxMerchantSoap12_address = address;
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
            if (test.com.payex.external.PxMerchant.PxMerchantSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxMerchant.PxMerchantSoapStub _stub = new test.com.payex.external.PxMerchant.PxMerchantSoapStub(new java.net.URL(PxMerchantSoap_address), this);
                _stub.setPortName(getPxMerchantSoapWSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxMerchant.PxMerchantSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxMerchant.PxMerchantSoap12Stub _stub = new test.com.payex.external.PxMerchant.PxMerchantSoap12Stub(new java.net.URL(PxMerchantSoap12_address), this);
                _stub.setPortName(getPxMerchantSoap12WSDDServiceName());
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
        if ("PxMerchantSoap".equals(inputPortName)) {
            return getPxMerchantSoap();
        }
        else if ("PxMerchantSoap12".equals(inputPortName)) {
            return getPxMerchantSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxMerchant/", "PxMerchant");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxMerchant/", "PxMerchantSoap"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxMerchant/", "PxMerchantSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxMerchantSoap".equals(portName)) {
            setPxMerchantSoapEndpointAddress(address);
        }
        else 
if ("PxMerchantSoap12".equals(portName)) {
            setPxMerchantSoap12EndpointAddress(address);
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
