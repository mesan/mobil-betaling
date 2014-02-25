package test.com.payex.external.PxRecurring;

public class PxRecurringSoapProxy implements test.com.payex.external.PxRecurring.PxRecurringSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxRecurring.PxRecurringSoap pxRecurringSoap = null;
  
  public PxRecurringSoapProxy() {
    _initPxRecurringSoapProxy();
  }
  
  public PxRecurringSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxRecurringSoapProxy();
  }
  
  private void _initPxRecurringSoapProxy() {
    try {
      pxRecurringSoap = (new test.com.payex.external.PxRecurring.PxRecurringLocator()).getPxRecurringSoap();
      if (pxRecurringSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxRecurringSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxRecurringSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxRecurringSoap != null)
      ((javax.xml.rpc.Stub)pxRecurringSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxRecurring.PxRecurringSoap getPxRecurringSoap() {
    if (pxRecurringSoap == null)
      _initPxRecurringSoapProxy();
    return pxRecurringSoap;
  }
  
  public java.lang.String start(long accountNumber, java.lang.String agreementRef, java.lang.String startDate, int periodType, long period, int alertPeriod, int price, java.lang.String productNumber, java.lang.String orderID, java.lang.String description, java.lang.String notifyUrl, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxRecurringSoap == null)
      _initPxRecurringSoapProxy();
    return pxRecurringSoap.start(accountNumber, agreementRef, startDate, periodType, period, alertPeriod, price, productNumber, orderID, description, notifyUrl, hash);
  }
  
  public java.lang.String stop(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxRecurringSoap == null)
      _initPxRecurringSoapProxy();
    return pxRecurringSoap.stop(accountNumber, agreementRef, hash);
  }
  
  public java.lang.String check(long accountNumber, java.lang.String agreementRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxRecurringSoap == null)
      _initPxRecurringSoapProxy();
    return pxRecurringSoap.check(accountNumber, agreementRef, hash);
  }
  
  
}