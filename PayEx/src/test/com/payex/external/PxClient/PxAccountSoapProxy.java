package test.com.payex.external.PxClient;

public class PxAccountSoapProxy implements test.com.payex.external.PxClient.PxAccountSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxClient.PxAccountSoap pxAccountSoap = null;
  
  public PxAccountSoapProxy() {
    _initPxAccountSoapProxy();
  }
  
  public PxAccountSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxAccountSoapProxy();
  }
  
  private void _initPxAccountSoapProxy() {
    try {
      pxAccountSoap = (new test.com.payex.external.PxClient.PxAccountLocator()).getPxAccountSoap();
      if (pxAccountSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxAccountSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxAccountSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxAccountSoap != null)
      ((javax.xml.rpc.Stub)pxAccountSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxClient.PxAccountSoap getPxAccountSoap() {
    if (pxAccountSoap == null)
      _initPxAccountSoapProxy();
    return pxAccountSoap;
  }
  
  public java.lang.String listTransactions(long accountNumber, int clientType, java.lang.String clientRef, int maxRowCount, long filterByTransactionNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAccountSoap == null)
      _initPxAccountSoapProxy();
    return pxAccountSoap.listTransactions(accountNumber, clientType, clientRef, maxRowCount, filterByTransactionNumber, hash);
  }
  
  public java.lang.String createAccount(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String name, int type, java.lang.String currency, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAccountSoap == null)
      _initPxAccountSoapProxy();
    return pxAccountSoap.createAccount(accountNumber, clientType, clientRef, name, type, currency, hash);
  }
  
  public java.lang.String listInvoiceCA(long accountNumber, long clientAccountNumber, java.lang.String fromDate, java.lang.String toDate, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAccountSoap == null)
      _initPxAccountSoapProxy();
    return pxAccountSoap.listInvoiceCA(accountNumber, clientAccountNumber, fromDate, toDate, hash);
  }
  
  public java.lang.String listInvoiceTransactionCA(long accountNumber, long clientAccountNumber, long invoiceNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAccountSoap == null)
      _initPxAccountSoapProxy();
    return pxAccountSoap.listInvoiceTransactionCA(accountNumber, clientAccountNumber, invoiceNumber, hash);
  }
  
  
}