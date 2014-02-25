/**
 * PxAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public interface PxAccount extends javax.xml.rpc.Service {
    public java.lang.String getPxAccountSoapAddress();

    public test.com.payex.external.PxClient.PxAccountSoap getPxAccountSoap() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxClient.PxAccountSoap getPxAccountSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxAccountSoap12Address();

    public test.com.payex.external.PxClient.PxAccountSoap getPxAccountSoap12() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxClient.PxAccountSoap getPxAccountSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
