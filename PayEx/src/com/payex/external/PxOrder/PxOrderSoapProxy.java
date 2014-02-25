package com.payex.external.PxOrder;

public class PxOrderSoapProxy implements com.payex.external.PxOrder.PxOrderSoap {
  private String _endpoint = null;
  private com.payex.external.PxOrder.PxOrderSoap pxOrderSoap = null;
  
  public PxOrderSoapProxy() {
    _initPxOrderSoapProxy();
  }
  
  public PxOrderSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPxOrderSoapProxy();
  }
  
  private void _initPxOrderSoapProxy() {
    try {
      pxOrderSoap = (new com.payex.external.PxOrder.PxOrderLocator()).getPxOrderSoap();
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
  
  public com.payex.external.PxOrder.PxOrderSoap getPxOrderSoap() {
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap;
  }
  
  public java.lang.String saleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, hash);
  }
  
  public java.lang.String authorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, hash);
  }
  
  public java.lang.String prepareSaleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareSaleCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, clientIPAddress, clientIdentifier, hash);
  }
  
  public java.lang.String prepareAuthorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareAuthorizeCC(accountNumber, orderRef, userType, userRef, cardNumber, cardNumberExpireMonth, cardNumberExpireYear, cardNumberCVC, cardHolderName, clientIPAddress, clientIdentifier, hash);
  }
  
  public java.lang.String initialize3(long accountNumber, java.lang.String purchaseOperation, java.lang.String orderType, int period, int price, java.lang.String priceArgList, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize3(accountNumber, purchaseOperation, orderType, period, price, priceArgList, vat, orderID, productNumber, description, clientIPAddress, externalID, returnUrl, view, viewType, hash);
  }
  
  public java.lang.String initialize4(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize4(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, externalID, returnUrl, view, viewType, agreementRef, cancelUrl, hash);
  }
  
  public java.lang.String initialize5(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize5(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, externalID, returnUrl, view, viewType, agreementRef, cancelUrl, hash);
  }
  
  public java.lang.String initialize6(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String clientLanguage, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize6(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, externalID, returnUrl, view, viewType, agreementRef, cancelUrl, clientLanguage, hash);
  }
  
  public java.lang.String initialize7(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String additionalValues, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String clientLanguage, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize7(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, additionalValues, externalID, returnUrl, view, agreementRef, cancelUrl, clientLanguage, hash);
  }
  
  public java.lang.String initialize(long accountNumber, java.lang.String orderType, java.lang.String purchaseOperation, int autoRenew, java.lang.String view, int period, java.lang.String orderID, java.lang.String productNumber, java.lang.String subscriptionNumber, int price, java.lang.String priceArgList, int vat, java.lang.String description, java.lang.String returnURL, int checkPeriod, java.lang.String externalID, int initialDiscount, java.lang.String expireDate, int expireDateType, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initialize(accountNumber, orderType, purchaseOperation, autoRenew, view, period, orderID, productNumber, subscriptionNumber, price, priceArgList, vat, description, returnURL, checkPeriod, externalID, initialDiscount, expireDate, expireDateType, hash);
  }
  
  public java.lang.String initializeBasic(long accountNumber, java.lang.String purchaseOperation, java.lang.String orderID, java.lang.String productNumber, java.lang.String priceArgList, java.lang.String description, java.lang.String returnURL, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.initializeBasic(accountNumber, purchaseOperation, orderID, productNumber, priceArgList, description, returnURL, hash);
  }
  
  public java.lang.String complete(long accountNumber, java.lang.String orderRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.complete(accountNumber, orderRef, hash);
  }
  
  public java.lang.String check(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.check(accountNumber, transactionRef, hash);
  }
  
  public java.lang.String salePX(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.salePX(accountNumber, orderRef, userType, userRef, password, hash);
  }
  
  public java.lang.String authorizePX(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizePX(accountNumber, orderRef, userType, userRef, password, hash);
  }
  
  public java.lang.String saleCPA(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCPA(accountNumber, orderRef, userType, userRef, password, hash);
  }
  
  public java.lang.String saleCA(long accountNumber, java.lang.String orderRef, long clientAccountNumber, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleCA(accountNumber, orderRef, clientAccountNumber, password, hash);
  }
  
  public java.lang.String authorizeCA(long accountNumber, java.lang.String orderRef, long clientAccountNumber, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeCA(accountNumber, orderRef, clientAccountNumber, password, hash);
  }
  
  public java.lang.String reserveIVR(long accountNumber, java.lang.String orderRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.reserveIVR(accountNumber, orderRef, hash);
  }
  
  public java.lang.String saleIVR(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String ivrCode, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleIVR(accountNumber, orderRef, userType, userRef, ivrCode, hash);
  }
  
  public java.lang.String cancel(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.cancel(accountNumber, transactionRef, hash);
  }
  
  public java.lang.String credit(long accountNumber, java.lang.String transactionRef, int amount, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.credit(accountNumber, transactionRef, amount, hash);
  }
  
  public java.lang.String creditOrderLine(long accountNumber, java.lang.String transactionRef, java.lang.String itemNumber, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.creditOrderLine(accountNumber, transactionRef, itemNumber, hash);
  }
  
  public java.lang.String capture(long accountNumber, java.lang.String transactionRef, int amount, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.capture(accountNumber, transactionRef, amount, hash);
  }
  
  public java.lang.String saleEVC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleEVC(accountNumber, orderRef, userType, userRef, valueCode, clientIPAddress, hash);
  }
  
  public java.lang.String authorizeEVC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeEVC(accountNumber, orderRef, userType, userRef, valueCode, clientIPAddress, hash);
  }
  
  public java.lang.String addSingleOrderLine(long accountNumber, java.lang.String orderRef, java.lang.String itemNumber, java.lang.String itemDescription1, java.lang.String itemDescription2, java.lang.String itemDescription3, java.lang.String itemDescription4, java.lang.String itemDescription5, int quantity, int amount, int vatPrice, int vatPercent, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.addSingleOrderLine(accountNumber, orderRef, itemNumber, itemDescription1, itemDescription2, itemDescription3, itemDescription4, itemDescription5, quantity, amount, vatPrice, vatPercent, hash);
  }
  
  public java.lang.String addMultipleOrderLines(long accountNumber, java.lang.String orderRef, int numberOfItems, java.lang.String[][] orderDetails, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.addMultipleOrderLines(accountNumber, orderRef, numberOfItems, orderDetails, hash);
  }
  
  public java.lang.String prepareSaleDD(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String bankName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.prepareSaleDD(accountNumber, orderRef, userType, userRef, bankName, clientIPAddress, clientIdentifier, hash);
  }
  
  public java.lang.String saleInvoice(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleInvoice(accountNumber, orderRef, userType, userRef, invoiceText, mediaDistribution, customerId, customerName, customerPostNumber, customerCity, customerCountry, customerSosialSecurityNumber, customerPhoneNumber, customerEmailAddress, customerCOAddress, customerStreetAddress, productCode, dueDateExceeded, hash);
  }
  
  public java.lang.String saleInvoice2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String creditcheckRef, java.lang.String invoiceLayout, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleInvoice2(accountNumber, orderRef, userType, userRef, invoiceText, mediaDistribution, customerId, customerName, customerPostNumber, customerCity, customerCountry, customerSosialSecurityNumber, customerPhoneNumber, customerEmailAddress, customerCOAddress, customerStreetAddress, productCode, dueDateExceeded, creditcheckRef, invoiceLayout, hash);
  }
  
  public java.lang.String addLoan(long accountNumber, java.lang.String orderRef, java.lang.String socialSecurityNumber, java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String address, java.lang.String postalCode, java.lang.String city, java.lang.String country, java.lang.String phone1, java.lang.String phone2, java.lang.String gsm, java.lang.String additionalProducs, java.lang.String shippingDescription, java.lang.String additionalInfo, int calculateType, java.lang.String calculateRef, int nominalInterest, int pkiMethod, int model, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.addLoan(accountNumber, orderRef, socialSecurityNumber, email, firstName, lastName, address, postalCode, city, country, phone1, phone2, gsm, additionalProducs, shippingDescription, additionalInfo, calculateType, calculateRef, nominalInterest, pkiMethod, model, hash);
  }
  
  public java.lang.String calculateLoan(long accountNumber, int numberOfMonths, int monthlyPayment, int amount, int loanType, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.calculateLoan(accountNumber, numberOfMonths, monthlyPayment, amount, loanType, hash);
  }
  
  public java.lang.String saleLoan(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleLoan(accountNumber, orderRef, userType, userRef, hash);
  }
  
  public java.lang.String authorizeLoan(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeLoan(accountNumber, orderRef, userType, userRef, hash);
  }
  
  public java.lang.String addOrderAddress(long accountNumber, java.lang.String orderRef, java.lang.String billingFirstName, java.lang.String billingLastName, java.lang.String billingAddress1, java.lang.String billingAddress2, java.lang.String billingAddress3, java.lang.String billingPostNumber, java.lang.String billingCity, java.lang.String billingState, java.lang.String billingCountry, java.lang.String billingEmail, java.lang.String billingPhone, java.lang.String billingGsm, java.lang.String deliveryFirstName, java.lang.String deliveryLastName, java.lang.String deliveryAddress1, java.lang.String deliveryAddress2, java.lang.String deliveryAddress3, java.lang.String deliveryPostNumber, java.lang.String deliveryCity, java.lang.String deliveryState, java.lang.String deliveryCountry, java.lang.String deliveryEmail, java.lang.String deliveryPhone, java.lang.String deliveryGsm, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.addOrderAddress(accountNumber, orderRef, billingFirstName, billingLastName, billingAddress1, billingAddress2, billingAddress3, billingPostNumber, billingCity, billingState, billingCountry, billingEmail, billingPhone, billingGsm, deliveryFirstName, deliveryLastName, deliveryAddress1, deliveryAddress2, deliveryAddress3, deliveryPostNumber, deliveryCity, deliveryState, deliveryCountry, deliveryEmail, deliveryPhone, deliveryGsm, hash);
  }
  
  public java.lang.String authorizeGC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String pan, java.lang.String expireMonth, java.lang.String expireYear, java.lang.String cvc, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeGC(accountNumber, orderRef, userType, userRef, pan, expireMonth, expireYear, cvc, hash);
  }
  
  public java.lang.String saleGC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String pan, java.lang.String expireMonth, java.lang.String expireYear, java.lang.String cvc, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.saleGC(accountNumber, orderRef, userType, userRef, pan, expireMonth, expireYear, cvc, hash);
  }
  
  public java.lang.String getTransactionDetails(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.getTransactionDetails(accountNumber, transactionRef, hash);
  }
  
  public java.lang.String authorizeInvoice(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String creditcheckRef, java.lang.String invoiceLayout, java.lang.String hash) throws java.rmi.RemoteException{
    if (pxOrderSoap == null)
      _initPxOrderSoapProxy();
    return pxOrderSoap.authorizeInvoice(accountNumber, orderRef, userType, userRef, invoiceText, mediaDistribution, customerId, customerName, customerPostNumber, customerCity, customerCountry, customerSosialSecurityNumber, customerPhoneNumber, customerEmailAddress, customerCOAddress, customerStreetAddress, productCode, dueDateExceeded, creditcheckRef, invoiceLayout, hash);
  }
  
  
}