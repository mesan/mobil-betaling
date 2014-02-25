package test.com.payex.external.PxClient;

public class PxClientSoapProxy implements test.com.payex.external.PxClient.PxClientSoap {
  private String _endpoint = null;
  private test.com.payex.external.PxClient.PxClientSoap pxClientSoap = null;
  
  public PxClientSoapProxy() {
    _initPxClientSoapProxy();
  }
  
  public PxClientSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxClientSoapProxy();
  }
  
  private void _initPxClientSoapProxy() {
    try {
      pxClientSoap = (new test.com.payex.external.PxClient.PxClientLocator()).getPxClientSoap();
      if (pxClientSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pxClientSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pxClientSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pxClientSoap != null)
      ((javax.xml.rpc.Stub)pxClientSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public test.com.payex.external.PxClient.PxClientSoap getPxClientSoap() {
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap;
  }
  
  public java.lang.String addExternalIdLink(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, java.lang.String externalId, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.addExternalIdLink(accountNumber, clientType, clientRef, password, externalId, hash);
  }
  
  public java.lang.String createClient(long accountNumber, boolean verified, java.lang.String email, java.lang.String gsm, java.lang.String socialSecurityNumber, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String currency, java.lang.String language, java.lang.String externalId, java.lang.String ip, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.createClient(accountNumber, verified, email, gsm, socialSecurityNumber, password, firstName, lastName, address1, address2, address3, postNumber, city, country, currency, language, externalId, ip, hash);
  }
  
  public java.lang.String createClient3(long accountNumber, boolean verified, java.lang.String email, java.lang.String gsm, java.lang.String socialSecurityNumber, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String currency, java.lang.String language, java.lang.String externalId, java.lang.String ip, boolean generatePxAccount, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.createClient3(accountNumber, verified, email, gsm, socialSecurityNumber, password, firstName, lastName, address1, address2, address3, postNumber, city, country, currency, language, externalId, ip, generatePxAccount, hash);
  }
  
  public java.lang.String updateExternalUserID(long accountNumber, java.lang.String externalUserIdOld, java.lang.String externalUserIdNew, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.updateExternalUserID(accountNumber, externalUserIdOld, externalUserIdNew, hash);
  }
  
  public java.lang.String updateExternalIdLink(long accountNumber, java.lang.String externalIdOld, java.lang.String externalIdNew, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.updateExternalIdLink(accountNumber, externalIdOld, externalIdNew, hash);
  }
  
  public java.lang.String getClientInfo(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, boolean validate, int clientInfo, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.getClientInfo(accountNumber, clientType, clientRef, password, validate, clientInfo, hash);
  }
  
  public java.lang.String getClientInfo3(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String password, boolean validate, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.getClientInfo3(accountNumber, clientType, clientRef, password, validate, hash);
  }
  
  public java.lang.String clientToClientTransfer(long accountNumber, long senderAccountNumber, int userType, java.lang.String userRef, int amount, java.lang.String description, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.clientToClientTransfer(accountNumber, senderAccountNumber, userType, userRef, amount, description, hash);
  }
  
  public java.lang.String setSocialSecurityNumberVerified(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String socialSecurityNumber, java.lang.String firstName, java.lang.String lastName, java.lang.String address1, java.lang.String address2, java.lang.String address3, java.lang.String postNumber, java.lang.String city, java.lang.String country, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.setSocialSecurityNumberVerified(accountNumber, clientType, clientRef, socialSecurityNumber, firstName, lastName, address1, address2, address3, postNumber, city, country, hash);
  }
  
  public java.lang.String addGsmNumber(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String gsmNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.addGsmNumber(accountNumber, clientType, clientRef, gsmNumber, hash);
  }
  
  public java.lang.String generateTemporaryPassword(long accountNumber, int clientType, java.lang.String clientRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxClientSoap == null)
      _initPxClientSoapProxy();
    return pxClientSoap.generateTemporaryPassword(accountNumber, clientType, clientRef, hash);
  }
  
  
}