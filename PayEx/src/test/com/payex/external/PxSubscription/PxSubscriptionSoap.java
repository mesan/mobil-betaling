/**
 * PxSubscriptionSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxSubscription;

public interface PxSubscriptionSoap extends java.rmi.Remote {
    public java.lang.String check2(long accountNumber, java.lang.String productNumber, java.lang.String externalId, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String add(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String productNumber, java.lang.String externalId, int period, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException;
}
