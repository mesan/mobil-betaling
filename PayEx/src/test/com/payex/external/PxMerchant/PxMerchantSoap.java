/**
 * PxMerchantSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxMerchant;

public interface PxMerchantSoap extends java.rmi.Remote {
    public java.lang.String generateHash(java.lang.String plainText, java.lang.String encryptionKey) throws java.rmi.RemoteException;
    public java.lang.String transferToClient(long accountNumber, int userType, java.lang.String userRef, int amount, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String transferToMerchant(long accountNumber, long toAccountNumber, int amount, java.lang.String description, java.lang.String orderId, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String transferToBankAccount(long accountNumber, int amount, java.lang.String description, java.lang.String orderId, java.lang.String bankAccountNumber, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String withdrawalToBankAccount(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String bankAccountNumber, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String withdrawalToIBAN(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String ibanNumber, java.lang.String bic, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String withdrawalToBankPayout(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String address1, java.lang.String address2, java.lang.String postNumber, java.lang.String city, java.lang.String hash) throws java.rmi.RemoteException;
}
