/**
 * PxClient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public interface PxClient extends javax.xml.rpc.Service {
    public java.lang.String getPxClientSoap12Address();

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap12() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxClientSoapAddress();

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
