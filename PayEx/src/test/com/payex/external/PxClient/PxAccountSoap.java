/**
 * PxAccountSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxClient;

public interface PxAccountSoap extends java.rmi.Remote {
    public java.lang.String listTransactions(long accountNumber, int clientType, java.lang.String clientRef, int maxRowCount, long filterByTransactionNumber, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String createAccount(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String name, int type, java.lang.String currency, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String listInvoiceCA(long accountNumber, long clientAccountNumber, java.lang.String fromDate, java.lang.String toDate, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String listInvoiceTransactionCA(long accountNumber, long clientAccountNumber, long invoiceNumber, java.lang.String hash) throws java.rmi.RemoteException;
}
