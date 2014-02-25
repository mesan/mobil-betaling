package test.com.payex.external.PxMerchant;

public class PxMerchantSoapProxy implements test.com.payex.external.PxMerchant.PxMerchantSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxMerchant.PxMerchantSoap pxMerchantSoap = null;
  
  public PxMerchantSoapProxy() {
    _initPxMerchantSoapProxy();
  }
  
  public PxMerchantSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxMerchantSoapProxy();
  }
  
  private void _initPxMerchantSoapProxy() {
    try {
      pxMerchantSoap = (new test.com.payex.external.PxMerchant.PxMerchantLocator()).getPxMerchantSoap();
      if (pxMerchantSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxMerchantSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxMerchantSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxMerchantSoap != null)
      ((javax.xml.rpc.Stub)pxMerchantSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxMerchant.PxMerchantSoap getPxMerchantSoap() {
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap;
  }
  
  public java.lang.String generateHash(java.lang.String plainText, java.lang.String encryptionKey) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.generateHash(plainText, encryptionKey);
  }
  
  public java.lang.String transferToClient(long accountNumber, int userType, java.lang.String userRef, int amount, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.transferToClient(accountNumber, userType, userRef, amount, description, hash);
  }
  
  public java.lang.String transferToMerchant(long accountNumber, long toAccountNumber, int amount, java.lang.String description, java.lang.String orderId, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.transferToMerchant(accountNumber, toAccountNumber, amount, description, orderId, hash);
  }
  
  public java.lang.String transferToBankAccount(long accountNumber, int amount, java.lang.String description, java.lang.String orderId, java.lang.String bankAccountNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.transferToBankAccount(accountNumber, amount, description, orderId, bankAccountNumber, hash);
  }
  
  public java.lang.String withdrawalToBankAccount(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String bankAccountNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.withdrawalToBankAccount(accountNumber, orderId, currency, country, amount, description, nameOfReceiver, bankAccountNumber, hash);
  }
  
  public java.lang.String withdrawalToIBAN(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String ibanNumber, java.lang.String bic, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.withdrawalToIBAN(accountNumber, orderId, currency, country, amount, description, nameOfReceiver, ibanNumber, bic, hash);
  }
  
  public java.lang.String withdrawalToBankPayout(long accountNumber, java.lang.String orderId, java.lang.String currency, java.lang.String country, int amount, java.lang.String description, java.lang.String nameOfReceiver, java.lang.String address1, java.lang.String address2, java.lang.String postNumber, java.lang.String city, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxMerchantSoap == null)
      _initPxMerchantSoapProxy();
    return pxMerchantSoap.withdrawalToBankPayout(accountNumber, orderId, currency, country, amount, description, nameOfReceiver, address1, address2, postNumber, city, hash);
  }
  
  
}