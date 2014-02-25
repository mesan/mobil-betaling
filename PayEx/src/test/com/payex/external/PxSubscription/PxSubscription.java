/**
 * PxSubscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxSubscription;

public interface PxSubscription extends javax.xml.rpc.Service {
    public java.lang.String getPxSubscriptionSoap12Address();

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap12() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxSubscriptionSoapAddress();

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
