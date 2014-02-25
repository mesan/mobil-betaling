package com.example.miniprosjekt_mobil_betaling_DibsPaymentWindow;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: andersu
 * Date: 20.02.14
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */

public class AuthorizeCard {

    private Dibs dibs;

    public AuthorizeCard() {
        dibs = new Dibs();
    }
/**
 * Dependencies:
 * Apache-Commons/Commons-Codec for Hex encoding/decoding
 * Codehaus/Jackson for JSON mapping
 */
    /**
     * authorizeCard Authorizes a given card using the AuthorizeCard JSON service.
     *
     * @param amount The amount of the purchase in smallest unit
     * @param cardNumber The customers cardnumber
     * @param clientIp The customers IP address
     * @param currency The currency either in numeric or string format (e.g. 208/DKK)
     * @param merchantId DIBS Merchant ID / customer number
     * @param orderId The shops order ID for the purchase
     * @param cvc Card Verification Value, 3 digit
     * @param expMonth Expiry month of the card, 1 or 2 digits (e.g. 6/06)
     * @param expYear Expiry year of the card, 2 digits (e.g. 18 for 2018)
     * @param macKeyHex The secret HMAC key from DIBS Admin
     */
    public void authorizeCard(int amount, String cardNumber, String clientIp, String currency, String merchantId, String orderId, String cvc, int expMonth, int expYear, String macKeyHex) {
        // Create JSON object and add parameters
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("amount", String.valueOf(amount));
        parameters.put("cardNumber", cardNumber);
        parameters.put("clientIp", clientIp);
        parameters.put("currency", currency);
        parameters.put("merchantId", merchantId);
        parameters.put("orderId", orderId);
        parameters.put("cvc", cvc);
        parameters.put("expMonth", String.valueOf(expMonth));
        parameters.put("expYear", String.valueOf(expYear));

        // Uncomment following line for test mode to be active
        parameters.put("test", String.valueOf(Boolean.TRUE));

        // Add MAC value for request
        parameters.put("MAC", dibs.calculateMac(parameters, macKeyHex));

        // Post to the DIBS system and receive response
        Map<String, String> resp = dibs.postToDIBS(parameters, "AuthorizeCard");

        if (resp.get("status").equals("ACCEPT")) {
            // Authorization accepted. Check resp.get("transactionId") for transaction ID
            // ...
            Log.v("mobil_betaling", "Auth accepted. Response: " + resp.toString());
        } else if (resp.get("status").equals("DECLINE")) {
            // Authorization declined. Check resp.get("declineReason") for more information
            // ...
            Log.v("mobil_betaling", "Auth declined. Response: " + resp.toString());
        } else {
            // An error happened. Check Check resp.get("declineReason") for more information
            // ...
            Log.v("mobil_betaling", "An error happened during Auth. Response: " + resp.toString());
        }
    }
}
