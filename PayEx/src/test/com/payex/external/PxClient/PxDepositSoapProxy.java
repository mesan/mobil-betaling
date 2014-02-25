package test.com.payex.external.PxClient;

public class PxDepositSoapProxy implements test.com.payex.external.PxClient.PxDepositSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxClient.PxDepositSoap pxDepositSoap = null;
  
  public PxDepositSoapProxy() {
    _initPxDepositSoapProxy();
  }
  
  public PxDepositSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxDepositSoapProxy();
  }
  
  private void _initPxDepositSoapProxy() {
    try {
      pxDepositSoap = (new test.com.payex.external.PxClient.PxDepositLocator()).getPxDepositSoap();
      if (pxDepositSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxDepositSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxDepositSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxDepositSoap != null)
      ((javax.xml.rpc.Stub)pxDepositSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxClient.PxDepositSoap getPxDepositSoap() {
    if (pxDepositSoap == null)
      _initPxDepositSoapProxy();
    return pxDepositSoap;
  }
  
  public java.lang.String depositEVC(long accountNumber, java.lang.String description, int clientType, java.lang.String clientRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String clientIdentifier1, java.lang.String clientIdentifier2, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxDepositSoap == null)
      _initPxDepositSoapProxy();
    return pxDepositSoap.depositEVC(accountNumber, description, clientType, clientRef, valueCode, clientIPAddress, clientIdentifier1, clientIdentifier2, hash);
  }
  
  
}