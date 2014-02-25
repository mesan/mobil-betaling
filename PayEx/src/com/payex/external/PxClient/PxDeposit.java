/**
 * PxDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.external.PxClient;

public interface PxDeposit extends javax.xml.rpc.Service {
    public java.lang.String getPxDepositSoapAddress();

    public com.payex.external.PxClient.PxDepositSoap getPxDepositSoap() throws javax.xml.rpc.ServiceException;

    public com.payex.external.PxClient.PxDepositSoap getPxDepositSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxDepositSoap12Address();

    public com.payex.external.PxClient.PxDepositSoap getPxDepositSoap12() throws javax.xml.rpc.ServiceException;

    public com.payex.external.PxClient.PxDepositSoap getPxDepositSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
