/**
 * PxClientSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public interface PxClientSoap extends java.rmi.Remote {
    public java.lang.String addExternalIdLink(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, java.lang.String externalId, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String createClient(long accountNumber, boolean verified, java.lang.String email, java.lang.String gsm, java.lang.String socialSecurityNumber, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String currency, java.lang.String language, java.lang.String externalId, java.lang.String ip, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String createClient3(long accountNumber, boolean verified, java.lang.String email, java.lang.String gsm, java.lang.String socialSecurityNumber, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String currency, java.lang.String language, java.lang.String externalId, java.lang.String ip, boolean generatePxAccount, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String updateExternalUserID(long accountNumber, java.lang.String externalUserIdOld, java.lang.String externalUserIdNew, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String updateExternalIdLink(long accountNumber, java.lang.String externalIdOld, java.lang.String externalIdNew, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String getClientInfo(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, boolean validate, int clientInfo, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String getClientInfo3(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, boolean validate, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String clientToClientTransfer(long accountNumber, long senderAccountNumber, int userType, java.lang.String userRef, int amount, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String setSocialSecurityNumberVerified(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String socialSecurityNumber, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String addGsmNumber(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String gsmNumber, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String generateTemporaryPassword(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String hash) throws java.rmi.RemoteException;
}
