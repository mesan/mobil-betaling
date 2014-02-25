/**
 * PxAgreementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxAgreement;

public class PxAgreementLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxAgreement.PxAgreement {

    public PxAgreementLocator() {
    }


    public PxAgreementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxAgreementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxAgreementSoap12
    private java.lang.String PxAgreementSoap12_address = "https://test-external.payex.com/pxagreement/pxagreement.asmx";

    public java.lang.String getPxAgreementSoap12Address() {
        return PxAgreementSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxAgreementSoap12WSDDServiceName = "PxAgreementSoap12";

    public java.lang.String getPxAgreementSoap12WSDDServiceName() {
        return PxAgreementSoap12WSDDServiceName;
    }

    public void setPxAgreementSoap12WSDDServiceName(java.lang.String name) {
        PxAgreementSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxAgreementSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxAgreementSoap12(endpoint);
    }

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxAgreement.PxAgreementSoap12Stub _stub = new test.com.payex.external.PxAgreement.PxAgreementSoap12Stub(portAddress, this);
            _stub.setPortName(getPxAgreementSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxAgreementSoap12EndpointAddress(java.lang.String address) {
        PxAgreementSoap12_address = address;
    }


    // Use to get a proxy class for PxAgreementSoap
    private java.lang.String PxAgreementSoap_address = "https://test-external.payex.com/pxagreement/pxagreement.asmx";

    public java.lang.String getPxAgreementSoapAddress() {
        return PxAgreementSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxAgreementSoapWSDDServiceName = "PxAgreementSoap";

    public java.lang.String getPxAgreementSoapWSDDServiceName() {
        return PxAgreementSoapWSDDServiceName;
    }

    public void setPxAgreementSoapWSDDServiceName(java.lang.String name) {
        PxAgreementSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxAgreementSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxAgreementSoap(endpoint);
    }

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxAgreement.PxAgreementSoapStub _stub = new test.com.payex.external.PxAgreement.PxAgreementSoapStub(portAddress, this);
            _stub.setPortName(getPxAgreementSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxAgreementSoapEndpointAddress(java.lang.String address) {
        PxAgreementSoap_address = address;
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
            if (test.com.payex.external.PxAgreement.PxAgreementSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxAgreement.PxAgreementSoap12Stub _stub = new test.com.payex.external.PxAgreement.PxAgreementSoap12Stub(new java.net.URL(PxAgreementSoap12_address), this);
                _stub.setPortName(getPxAgreementSoap12WSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxAgreement.PxAgreementSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxAgreement.PxAgreementSoapStub _stub = new test.com.payex.external.PxAgreement.PxAgreementSoapStub(new java.net.URL(PxAgreementSoap_address), this);
                _stub.setPortName(getPxAgreementSoapWSDDServiceName());
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
        if ("PxAgreementSoap12".equals(inputPortName)) {
            return getPxAgreementSoap12();
        }
        else if ("PxAgreementSoap".equals(inputPortName)) {
            return getPxAgreementSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxAgreement/", "PxAgreement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxAgreement/", "PxAgreementSoap12"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxAgreement/", "PxAgreementSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxAgreementSoap12".equals(portName)) {
            setPxAgreementSoap12EndpointAddress(address);
        }
        else 
if ("PxAgreementSoap".equals(portName)) {
            setPxAgreementSoapEndpointAddress(address);
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
