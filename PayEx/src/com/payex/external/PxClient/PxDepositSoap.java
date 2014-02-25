/**
 * PxDepositSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.payex.external.PxClient;

public interface PxDepositSoap extends java.rmi.Remote {
    public java.lang.String depositEVC(long accountNumber, java.lang.String description, int clientType, java.lang.String clientRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String clientIdentifier1, java.lang.String clientIdentifier2, java.lang.String hash) throws java.rmi.RemoteException;
}
