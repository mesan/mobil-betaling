/**
 * PxDepositLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public class PxDepositLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxClient.PxDeposit {

    public PxDepositLocator() {
    }


    public PxDepositLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxDepositLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxDepositSoap
    private java.lang.String PxDepositSoap_address = "https://test-external.payex.com/pxclient/pxdeposit.asmx";

    public java.lang.String getPxDepositSoapAddress() {
        return PxDepositSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxDepositSoapWSDDServiceName = "PxDepositSoap";

    public java.lang.String getPxDepositSoapWSDDServiceName() {
        return PxDepositSoapWSDDServiceName;
    }

    public void setPxDepositSoapWSDDServiceName(java.lang.String name) {
        PxDepositSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxClient.PxDepositSoap getPxDepositSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxDepositSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxDepositSoap(endpoint);
    }

    public test.com.payex.external.PxClient.PxDepositSoap getPxDepositSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxClient.PxDepositSoapStub _stub = new test.com.payex.external.PxClient.PxDepositSoapStub(portAddress, this);
            _stub.setPortName(getPxDepositSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxDepositSoapEndpointAddress(java.lang.String address) {
        PxDepositSoap_address = address;
    }


    // Use to get a proxy class for PxDepositSoap12
    private java.lang.String PxDepositSoap12_address = "https://test-external.payex.com/pxclient/pxdeposit.asmx";

    public java.lang.String getPxDepositSoap12Address() {
        return PxDepositSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxDepositSoap12WSDDServiceName = "PxDepositSoap12";

    public java.lang.String getPxDepositSoap12WSDDServiceName() {
        return PxDepositSoap12WSDDServiceName;
    }

    public void setPxDepositSoap12WSDDServiceName(java.lang.String name) {
        PxDepositSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxClient.PxDepositSoap getPxDepositSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxDepositSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxDepositSoap12(endpoint);
    }

    public test.com.payex.external.PxClient.PxDepositSoap getPxDepositSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxClient.PxDepositSoap12Stub _stub = new test.com.payex.external.PxClient.PxDepositSoap12Stub(portAddress, this);
            _stub.setPortName(getPxDepositSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxDepositSoap12EndpointAddress(java.lang.String address) {
        PxDepositSoap12_address = address;
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
            if (test.com.payex.external.PxClient.PxDepositSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxClient.PxDepositSoapStub _stub = new test.com.payex.external.PxClient.PxDepositSoapStub(new java.net.URL(PxDepositSoap_address), this);
                _stub.setPortName(getPxDepositSoapWSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxClient.PxDepositSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxClient.PxDepositSoap12Stub _stub = new test.com.payex.external.PxClient.PxDepositSoap12Stub(new java.net.URL(PxDepositSoap12_address), this);
                _stub.setPortName(getPxDepositSoap12WSDDServiceName());
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
        if ("PxDepositSoap".equals(inputPortName)) {
            return getPxDepositSoap();
        }
        else if ("PxDepositSoap12".equals(inputPortName)) {
            return getPxDepositSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxDeposit");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxDepositSoap"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxClient/", "PxDepositSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxDepositSoap".equals(portName)) {
            setPxDepositSoapEndpointAddress(address);
        }
        else 
if ("PxDepositSoap12".equals(portName)) {
            setPxDepositSoap12EndpointAddress(address);
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
