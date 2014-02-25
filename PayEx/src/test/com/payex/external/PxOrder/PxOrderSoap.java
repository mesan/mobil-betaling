/**
 * PxOrderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.com.payex.external.PxOrder;

public interface PxOrderSoap extends java.rmi.Remote {
    public java.lang.String saleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareSaleCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareAuthorizeCC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String cardNumber, java.lang.String cardNumberExpireMonth, java.lang.String cardNumberExpireYear, java.lang.String cardNumberCVC, java.lang.String cardHolderName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize3(long accountNumber, java.lang.String purchaseOperation, java.lang.String orderType, int period, int price, java.lang.String priceArgList, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize4(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize5(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize6(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, int viewType, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String clientLanguage, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize7(long accountNumber, java.lang.String purchaseOperation, int price, java.lang.String priceArgList, java.lang.String currency, int vat, java.lang.String orderID, java.lang.String productNumber, java.lang.String description, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String additionalValues, java.lang.String externalID, java.lang.String returnUrl, java.lang.String view, java.lang.String agreementRef, java.lang.String cancelUrl, java.lang.String clientLanguage, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initialize(long accountNumber, java.lang.String orderType, java.lang.String purchaseOperation, int autoRenew, java.lang.String view, int period, java.lang.String orderID, java.lang.String productNumber, java.lang.String subscriptionNumber, int price, java.lang.String priceArgList, int vat, java.lang.String description, java.lang.String returnURL, int checkPeriod, java.lang.String externalID, int initialDiscount, java.lang.String expireDate, int expireDateType, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String initializeBasic(long accountNumber, java.lang.String purchaseOperation, java.lang.String orderID, java.lang.String productNumber, java.lang.String priceArgList, java.lang.String description, java.lang.String returnURL, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String complete(long accountNumber, java.lang.String orderRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String check(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String salePX(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizePX(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleCPA(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleCA(long accountNumber, java.lang.String orderRef, long clientAccountNumber, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeCA(long accountNumber, java.lang.String orderRef, long clientAccountNumber, java.lang.String password, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String reserveIVR(long accountNumber, java.lang.String orderRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleIVR(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String ivrCode, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String cancel(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String credit(long accountNumber, java.lang.String transactionRef, int amount, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String creditOrderLine(long accountNumber, java.lang.String transactionRef, java.lang.String itemNumber, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String capture(long accountNumber, java.lang.String transactionRef, int amount, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleEVC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeEVC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String valueCode, java.lang.String clientIPAddress, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String addSingleOrderLine(long accountNumber, java.lang.String orderRef, java.lang.String itemNumber, java.lang.String itemDescription1, java.lang.String itemDescription2, java.lang.String itemDescription3, java.lang.String itemDescription4, java.lang.String itemDescription5, int quantity, int amount, int vatPrice, int vatPercent, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String addMultipleOrderLines(long accountNumber, java.lang.String orderRef, int numberOfItems, java.lang.String[][] orderDetails, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String prepareSaleDD(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String bankName, java.lang.String clientIPAddress, java.lang.String clientIdentifier, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleInvoice(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleInvoice2(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String creditcheckRef, java.lang.String invoiceLayout, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String addLoan(long accountNumber, java.lang.String orderRef, java.lang.String socialSecurityNumber, java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String address, java.lang.String postalCode, java.lang.String city, java.lang.String country, java.lang.String phone1, java.lang.String phone2, java.lang.String gsm, java.lang.String additionalProducs, java.lang.String shippingDescription, java.lang.String additionalInfo, int calculateType, java.lang.String calculateRef, int nominalInterest, int pkiMethod, int model, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String calculateLoan(long accountNumber, int numberOfMonths, int monthlyPayment, int amount, int loanType, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleLoan(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeLoan(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String addOrderAddress(long accountNumber, java.lang.String orderRef, java.lang.String billingFirstName, java.lang.String billingLastName, java.lang.String billingAddress1, java.lang.String billingAddress2, java.lang.String billingAddress3, java.lang.String billingPostNumber, java.lang.String billingCity, java.lang.String billingState, java.lang.String billingCountry, java.lang.String billingEmail, java.lang.String billingPhone, java.lang.String billingGsm, java.lang.String deliveryFirstName, java.lang.String deliveryLastName, java.lang.String deliveryAddress1, java.lang.String deliveryAddress2, java.lang.String deliveryAddress3, java.lang.String deliveryPostNumber, java.lang.String deliveryCity, java.lang.String deliveryState, java.lang.String deliveryCountry, java.lang.String deliveryEmail, java.lang.String deliveryPhone, java.lang.String deliveryGsm, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeGC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String pan, java.lang.String expireMonth, java.lang.String expireYear, java.lang.String cvc, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String saleGC(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String pan, java.lang.String expireMonth, java.lang.String expireYear, java.lang.String cvc, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String getTransactionDetails(long accountNumber, java.lang.String transactionRef, java.lang.String hash) throws java.rmi.RemoteException;
    public java.lang.String authorizeInvoice(long accountNumber, java.lang.String orderRef, int userType, java.lang.String userRef, java.lang.String invoiceText, int mediaDistribution, java.lang.String customerId, java.lang.String customerName, java.lang.String customerPostNumber, java.lang.String customerCity, java.lang.String customerCountry, java.lang.String customerSosialSecurityNumber, java.lang.String customerPhoneNumber, java.lang.String customerEmailAddress, java.lang.String customerCOAddress, java.lang.String customerStreetAddress, java.lang.String productCode, java.lang.String dueDateExceeded, java.lang.String creditcheckRef, java.lang.String invoiceLayout, java.lang.String hash) throws java.rmi.RemoteException;
}
