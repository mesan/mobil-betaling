/**
 * PxAgreementSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.external.PxAgreement;

public interface PxAgreementSoap extends java.rmi.Remote {
    public java.lang.String alert(long accountNumber, java.lang.String agreementRef, int price, java.lang.String billingDate, java.lang.String lateWarningDate, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String autoPay(long accountNumber, java.lang.String agreementRef, int price, java.lang.String productNumber, java.lang.String description, java.lang.String orderId, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String createAgreement(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String merchantRef, java.lang.String description, long paymentMethod, int maxAmount, java.lang.String notifyUrl, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String createAgreement2(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String merchantRef, java.lang.String description, long paymentMethod, int maxAmount, java.lang.String notifyUrl, java.lang.String startDate, java.lang.String stopDate, int maxLimitPeriod, int maxPeriod, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String deleteAgreement(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException;
}
