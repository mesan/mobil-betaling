/**
 * PxOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxOrder;

public interface PxOrder extends javax.xml.rpc.Service {
    public java.lang.String getPxOrderSoapAddress();

    public test.com.payex.external.PxOrder.PxOrderSoap getPxOrderSoap() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxOrder.PxOrderSoap getPxOrderSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPxOrderSoap12Address();

    public test.com.payex.external.PxOrder.PxOrderSoap getPxOrderSoap12() throws javax.xml.rpc.ServiceException;

    public test.com.payex.external.PxOrder.PxOrderSoap getPxOrderSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
