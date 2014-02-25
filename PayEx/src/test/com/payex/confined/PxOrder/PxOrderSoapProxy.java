package test.com.payex.confined.PxOrder;

public class PxOrderSoapProxy implements test.com.payex.confined.PxOrder.PxOrderSoap {
  private String _endpoint = null;
  private test.com.payex.confined.PxOrder.PxOrderSoap pxOrderSoap = null;
  
  public PxOrderSoapProxy() {
    _initPxOrderSoapProxy();
  }
  
  public PxOrderSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxOrderSoapProxy();
  }
  
  private void _initPxOrderSoapProxy() {
    try {
      pxOrderSoap = (new test.com.payex.confined.PxOrder.PxOrderLocator()).getPxOrderSoap();
      if (pxOrderSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxOrderSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxOrderSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxOrderSoap != null)
      ((javax.xml.rpc.Stub)pxOrderSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.confined.PxOrder.PxOrderSoap getPxOrderSoap() {
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap;
  }
  
  public java.lang.String saleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, hash);
  }
  
  public java.lang.String saleCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCC2(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String saleCC3(long accountNumber, java.lang.String orderRef, int transactionType, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCC3(accountNumber, orderRef, transactionType, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String authorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, hash);
  }
  
  public java.lang.String authorizeCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeCC2(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String authorizeCC3(long accountNumber, java.lang.String orderRef, int transactionType, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeCC3(accountNumber, orderRef, transactionType, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String prepareAuthorizeCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareAuthorizeCC2(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String prepareSaleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareSaleCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, clientIPAddress, clientIdentifier, hash);
  }
  
  public java.lang.String prepareSaleCC2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareSaleCC2(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, hash);
  }
  
  public java.lang.String prepareAuthorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareAuthorizeCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, clientIPAddress, clientIdentifier, hash);
  }
  
  
}