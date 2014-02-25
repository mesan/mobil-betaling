/**
 * PxOrderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.confined.PxOrder;

public interface PxOrderSoap extends java.rmi.Remote {
    public java.lang.String saleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleCC3(long accountNumber, java.lang.String orderRef, int transactionType, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeCC3(long accountNumber, java.lang.String orderRef, int transactionType, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareAuthorizeCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareSaleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareSaleCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareAuthorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException;
}
