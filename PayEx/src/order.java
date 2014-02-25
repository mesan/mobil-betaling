import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import test.com.payex.external.PxOrder.*;
import java.io.IOException;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import test.com.payex.external.PxOrder.*;

public class order {
	//########### payex init ########### 
	private String enckey = "48Kb479qbY5zVR3W5g2b"; //you generate it in payex admin "merchant profile"
	private long accountNumber = 60019908; //must be set, it's your payex acc. nr
	private String purchaseOperation = "SALE"; //sale or autorize
	private String orderID = "1"; //must be unique
	private String productNumber = "1";
	private String priceArgList = ""; //used only if price is not used.
	private String description = "NONE";
	private String returnUrl = "http://www.testster.se"; // the return page the user is re-directed to after a purchase.
	private String hash=""; //will be generated for each transaction
	private int price=1000; //used only if priceArgList is not used.
	private int vat=0;
	private int amount; // "capture" need this.
	private String clientIPAddress="192.168.1.1"; //in case of fraud, it's easier to track the buyer.
	private String externalID=""; //used with f.eks autopay to id a buyer.
	private String view="CC"; //type of payment
	private String currency="SEK"; 
	private String cancelUrl="";
	private String agreementRef=""; //used with f.eks autopay	
	private String clientIdentifier = ""; //USERAGENT=ie7.0
	private String clientLanguage ="";
	private String additionalValues ="";
//########### payex response ########### 
	private String orderRef;
	private String code;
	private String date;
	private String id;
	private String desc;
	private String sessionRef;
	private String redirectUrl;
	private String error;
	private String transactionRef;
	
	private String tmphashinput;
	private PxOrderSoapProxy newOrder = new PxOrderSoapProxy();
	
	public static void main(String[] args) {
		new order();
	}
	
	public order(){
		init7();
		addSingleOrderLine();		
		complete();
	}
	
	public void init7() {
		
		tmphashinput = accountNumber + purchaseOperation + price + priceArgList + currency + vat + orderID + productNumber + description + clientIPAddress + clientIdentifier + additionalValues + externalID + returnUrl + view + agreementRef + cancelUrl + clientLanguage;		
		hash = getHash(tmphashinput,enckey);

		System.out.println(tmphashinput);
		System.out.println(hash);
		
		try {			
			//String responseFromPayEx = newOrder.initialize5(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, externalID, returnUrl, view, viewType, agreementRef, cancelUrl, hash);
			String responseFromPayEx = newOrder.initialize7(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, additionalValues, externalID, returnUrl, view, agreementRef, cancelUrl, clientLanguage, hash);
			SAXBuilder builder = new SAXBuilder();			
	        ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
	        Element rootnode = xmlDoc.getRootElement();	        
	        
	        //response from PayEx
	        getParamsFromResponse(rootnode);	       	        
			XMLOutputter outPXml = new XMLOutputter();			
	        outPXml.output(xmlDoc, System.out);
	        builder = null;
		} catch (RemoteException e) {	
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}

	}
	
	public void addSingleOrderLine() {
		
		tmphashinput = accountNumber+ orderRef+ "1"+ "test"+ ""+ ""+ ""+ ""+ 3+ amount+ 12+ 2500;		
		hash = getHash(tmphashinput,enckey);

		System.out.println(tmphashinput);
		System.out.println(hash);
		
		try {			
			String responseFromPayEx = newOrder.addSingleOrderLine(accountNumber, orderRef, "1", "test", "", "", "", "", 3, amount, 12, 2500, hash);
			//String responseFromPayEx = newOrder.initialize5(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, externalID, returnUrl, view, viewType, agreementRef, cancelUrl, hash);
			//String responseFromPayEx = newOrder.initialize7(accountNumber, purchaseOperation, price, priceArgList, currency, vat, orderID, productNumber, description, clientIPAddress, clientIdentifier, additionalValues, externalID, returnUrl, view, agreementRef, cancelUrl, clientLanguage, hash);
			SAXBuilder builder = new SAXBuilder();			
	        ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
	        Element rootnode = xmlDoc.getRootElement();	        
	        
	        //response from PayEx
	        getParamsFromResponse(rootnode);	       	        
			XMLOutputter outPXml = new XMLOutputter();			
	        outPXml.output(xmlDoc, System.out);
	        builder = null;
		} catch (RemoteException e) {	
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}

	}
	
	private void credit() {		
		tmphashinput = accountNumber+transactionRef+amount;		
		hash = getHash(tmphashinput,enckey);
		
		try {
			SAXBuilder builder = new SAXBuilder();
			String responseFromPayEx = newOrder.credit(accountNumber, transactionRef, amount, hash);
			ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
			XMLOutputter outPXml = new XMLOutputter();
	        outPXml.output(xmlDoc, System.out);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void capture() {
		tmphashinput = accountNumber+transactionRef+amount;		
		hash = getHash(tmphashinput,enckey);
		
		try {
			SAXBuilder builder = new SAXBuilder();
			String responseFromPayEx = newOrder.capture(accountNumber, transactionRef, amount, hash);
			ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
			XMLOutputter outPXml = new XMLOutputter();
	        outPXml.output(xmlDoc, System.out);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void cancel() {
		tmphashinput = accountNumber+transactionRef;		
		hash = getHash(tmphashinput,enckey);
		
		try {
			SAXBuilder builder = new SAXBuilder();
			String responseFromPayEx = newOrder.cancel(accountNumber, transactionRef, hash);
			ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
			XMLOutputter outPXml = new XMLOutputter();
	        outPXml.output(xmlDoc, System.out);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void complete() {
		tmphashinput = accountNumber+orderRef;
		hash = getHash(tmphashinput,enckey);
		
		try {
			SAXBuilder builder = new SAXBuilder();			
			String responseFromPayEx = newOrder.complete(accountNumber, orderRef, hash);
			ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 
			XMLOutputter outPXml = new XMLOutputter();
	        outPXml.output(xmlDoc, System.out);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void check() {
		String tmphashinput = accountNumber+transactionRef;
		hash = getHash(tmphashinput,enckey);
		
		try {
			SAXBuilder builder = new SAXBuilder();
			String responseFromPayEx = newOrder.check(accountNumber, transactionRef, hash);
			ByteArrayInputStream responseStream = new ByteArrayInputStream(responseFromPayEx.getBytes());
	        Document xmlDoc = builder.build(responseStream);
	        responseStream.close(); 

			XMLOutputter outPXml = new XMLOutputter();
	        outPXml.output(xmlDoc, System.out);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void getParamsFromResponse(Element rootnode) {
        List elements = rootnode.getChildren();
        Iterator iterator = elements.iterator();
        while (iterator.hasNext()) {
          Element child = (Element) iterator.next();	          
          if(child.getName().matches("id"))
        	  id = child.getTextTrim();
          else if(child.getName().matches("date"))
          	  date = child.getTextTrim();
          else if(child.getName().matches("code"))
        	  code = child.getTextTrim();
          else if(child.getName().matches("description"))
        	  desc = child.getTextTrim();
          else if(child.getName().matches("orderRef"))
        	  orderRef = child.getTextTrim();
          else if(child.getName().matches("sessionRef"))
        	  sessionRef = child.getTextTrim();
          else if(child.getName().matches("redirectUrl"))
        	  redirectUrl = child.getTextTrim();
          else if(child.getName().matches("transactionRef"))
        	  transactionRef = child.getTextTrim();
          else
        	  //just in case there is something unexpected in return, it's "logged" in this String.
        	error += child.getTextTrim();
          getParamsFromResponse(child);
        }	    	        
}
	
	private String getHash(String data, String key) {
		StringBuffer sb= new StringBuffer();	
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			md5.update(data.getBytes());
			byte result[] = md5.digest(key.getBytes());
	        for (int i = 0; i < result.length; i++) {
	            String s = Integer.toHexString(result[i]);
	            int length = s.length();
	            if (length >= 2) {
	                sb.append(s.substring(length - 2, length));
	            } else {
	                sb.append("0");
	                sb.append(s);
	            }
	        }
	        md5.reset();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
        return sb.toString();
	}

}
