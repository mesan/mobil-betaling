/**
 * PxAgreement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxAgreement;

public interface PxAgreement extends javax.xml.rpc.Service {
    public java.lang.String getPxAgreementSoap12Address();

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap12() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxAgreementSoapAddress();

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
