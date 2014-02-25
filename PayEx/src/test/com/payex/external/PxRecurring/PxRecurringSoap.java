/**
 * PxRecurringSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxRecurring;

public interface PxRecurringSoap extends java.rmi.Remote {
    public java.lang.String start(long accountNumber, java.lang.String agreementRef, java.lang.String startDate, int periodType, long period, int alertPeriod, int price, java.lang.String productNumber, java.lang.String orderID, java.lang.String description, java.lang.String notifyUrl, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String stop(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String check(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException;
}
