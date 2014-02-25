/**
 * PxMerchant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.external.PxMerchant;

public interface PxMerchant extends javax.xml.rpc.Service {
    public java.lang.String getPxMerchantSoapAddress();

    public com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap() throws javax.xml.rpc.ServiceException;

    public com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxMerchantSoap12Address();

    public com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap12() throws javax.xml.rpc.ServiceException;

    public com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
