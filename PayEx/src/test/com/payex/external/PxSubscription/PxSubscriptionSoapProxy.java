package test.com.payex.external.PxSubscription;

public class PxSubscriptionSoapProxy implements test.com.payex.external.PxSubscription.PxSubscriptionSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxSubscription.PxSubscriptionSoap pxSubscriptionSoap = null;
  
  public PxSubscriptionSoapProxy() {
    _initPxSubscriptionSoapProxy();
  }
  
  public PxSubscriptionSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxSubscriptionSoapProxy();
  }
  
  private void _initPxSubscriptionSoapProxy() {
    try {
      pxSubscriptionSoap = (new test.com.payex.external.PxSubscription.PxSubscriptionLocator()).getPxSubscriptionSoap();
      if (pxSubscriptionSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxSubscriptionSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxSubscriptionSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxSubscriptionSoap != null)
      ((javax.xml.rpc.Stub)pxSubscriptionSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxSubscription.PxSubscriptionSoap getPxSubscriptionSoap() {
    if (pxSubscriptionSoap == null)
      _initPxSubscriptionSoapProxy();
    return pxSubscriptionSoap;
  }
  
  public java.lang.String check2(long accountNumber, java.lang.String productNumber, java.lang.String externalId, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxSubscriptionSoap == null)
      _initPxSubscriptionSoapProxy();
    return pxSubscriptionSoap.check2(accountNumber, productNumber, externalId, hash);
  }
  
  public java.lang.String add(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String productNumber, java.lang.String externalId, int period, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxSubscriptionSoap == null)
      _initPxSubscriptionSoapProxy();
    return pxSubscriptionSoap.add(accountNumber, clientType, clientRef, productNumber, externalId, period, description, hash);
  }
  
  
}