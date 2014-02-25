package test.com.payex.external.PxAgreement;

public class PxAgreementSoapProxy implements test.com.payex.external.PxAgreement.PxAgreementSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxAgreement.PxAgreementSoap pxAgreementSoap = null;
  
  public PxAgreementSoapProxy() {
    _initPxAgreementSoapProxy();
  }
  
  public PxAgreementSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxAgreementSoapProxy();
  }
  
  private void _initPxAgreementSoapProxy() {
    try {
      pxAgreementSoap = (new test.com.payex.external.PxAgreement.PxAgreementLocator()).getPxAgreementSoap();
      if (pxAgreementSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxAgreementSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxAgreementSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxAgreementSoap != null)
      ((javax.xml.rpc.Stub)pxAgreementSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxAgreement.PxAgreementSoap getPxAgreementSoap() {
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap;
  }
  
  public java.lang.String alert(long accountNumber, java.lang.String agreementRef, int price, java.lang.String billingDate, java.lang.String lateWarningDate, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap.alert(accountNumber, agreementRef, price, billingDate, lateWarningDate, hash);
  }
  
  public java.lang.String autoPay(long accountNumber, java.lang.String agreementRef, int price, java.lang.String productNumber, java.lang.String description, java.lang.String orderId, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap.autoPay(accountNumber, agreementRef, price, productNumber, description, orderId, hash);
  }
  
  public java.lang.String createAgreement(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String merchantRef, java.lang.String description, long paymentMethod, int maxAmount, java.lang.String notifyUrl, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap.createAgreement(accountNumber, clientType, clientRef, merchantRef, description, paymentMethod, maxAmount, notifyUrl, hash);
  }
  
  public java.lang.String createAgreement2(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String merchantRef, java.lang.String description, long paymentMethod, int maxAmount, java.lang.String notifyUrl, java.lang.String startDate, java.lang.String stopDate, int maxLimitPeriod, int maxPeriod, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap.createAgreement2(accountNumber, clientType, clientRef, merchantRef, description, paymentMethod, maxAmount, notifyUrl, startDate, stopDate, maxLimitPeriod, maxPeriod, hash);
  }
  
  public java.lang.String deleteAgreement(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxAgreementSoap == null)
      _initPxAgreementSoapProxy();
    return pxAgreementSoap.deleteAgreement(accountNumber, agreementRef, hash);
  }
  
  
}