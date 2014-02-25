/**
 * PxRecurringLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxRecurring;

public class PxRecurringLocator extends org.apache.axis.client.Service implements test.com.payex.external.PxRecurring.PxRecurring {

    public PxRecurringLocator() {
    }


    public PxRecurringLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PxRecurringLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PxRecurringSoap
    private java.lang.String PxRecurringSoap_address = "https://test-external.payex.com/pxagreement/pxrecurring.asmx";

    public java.lang.String getPxRecurringSoapAddress() {
        return PxRecurringSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxRecurringSoapWSDDServiceName = "PxRecurringSoap";

    public java.lang.String getPxRecurringSoapWSDDServiceName() {
        return PxRecurringSoapWSDDServiceName;
    }

    public void setPxRecurringSoapWSDDServiceName(java.lang.String name) {
        PxRecurringSoapWSDDServiceName = name;
    }

    public test.com.payex.external.PxRecurring.PxRecurringSoap getPxRecurringSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxRecurringSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxRecurringSoap(endpoint);
    }

    public test.com.payex.external.PxRecurring.PxRecurringSoap getPxRecurringSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxRecurring.PxRecurringSoapStub _stub = new test.com.payex.external.PxRecurring.PxRecurringSoapStub(portAddress, this);
            _stub.setPortName(getPxRecurringSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxRecurringSoapEndpointAddress(java.lang.String address) {
        PxRecurringSoap_address = address;
    }


    // Use to get a proxy class for PxRecurringSoap12
    private java.lang.String PxRecurringSoap12_address = "https://test-external.payex.com/pxagreement/pxrecurring.asmx";

    public java.lang.String getPxRecurringSoap12Address() {
        return PxRecurringSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PxRecurringSoap12WSDDServiceName = "PxRecurringSoap12";

    public java.lang.String getPxRecurringSoap12WSDDServiceName() {
        return PxRecurringSoap12WSDDServiceName;
    }

    public void setPxRecurringSoap12WSDDServiceName(java.lang.String name) {
        PxRecurringSoap12WSDDServiceName = name;
    }

    public test.com.payex.external.PxRecurring.PxRecurringSoap getPxRecurringSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PxRecurringSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPxRecurringSoap12(endpoint);
    }

    public test.com.payex.external.PxRecurring.PxRecurringSoap getPxRecurringSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.com.payex.external.PxRecurring.PxRecurringSoap12Stub _stub = new test.com.payex.external.PxRecurring.PxRecurringSoap12Stub(portAddress, this);
            _stub.setPortName(getPxRecurringSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPxRecurringSoap12EndpointAddress(java.lang.String address) {
        PxRecurringSoap12_address = address;
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
            if (test.com.payex.external.PxRecurring.PxRecurringSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxRecurring.PxRecurringSoapStub _stub = new test.com.payex.external.PxRecurring.PxRecurringSoapStub(new java.net.URL(PxRecurringSoap_address), this);
                _stub.setPortName(getPxRecurringSoapWSDDServiceName());
                return _stub;
            }
            if (test.com.payex.external.PxRecurring.PxRecurringSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.com.payex.external.PxRecurring.PxRecurringSoap12Stub _stub = new test.com.payex.external.PxRecurring.PxRecurringSoap12Stub(new java.net.URL(PxRecurringSoap12_address), this);
                _stub.setPortName(getPxRecurringSoap12WSDDServiceName());
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
        if ("PxRecurringSoap".equals(inputPortName)) {
            return getPxRecurringSoap();
        }
        else if ("PxRecurringSoap12".equals(inputPortName)) {
            return getPxRecurringSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://external.payex.com/PxRecurring/", "PxRecurring");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxRecurring/", "PxRecurringSoap"));
            ports.add(new javax.xml.namespace.QName("http://external.payex.com/PxRecurring/", "PxRecurringSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PxRecurringSoap".equals(portName)) {
            setPxRecurringSoapEndpointAddress(address);
        }
        else 
if ("PxRecurringSoap12".equals(portName)) {
            setPxRecurringSoap12EndpointAddress(address);
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
