package com.example.miniprosjekt_mobil_betaling_DibsPaymentWindow;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.codehaus.jackson.map.ObjectMapper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Dibs {



    /**
     * Dependencies:
     * Apache-Commons/Commons-Codec for Hex encoding/decoding
     * Codehaus/Jackson for JSON mapping
     */
    /**
     * postToDIBS Sends a post to the specified DIBS function
     *
     * @param parameters A Map<String, String> holding the parameters to be parsed to DIBS
     * @param func A String holding the name of the function to be used
     * @return A Map<String, String> holding the parameters returned by DIBS
     */
    public Map<String, String> postToDIBS(Map<String, String> parameters, String func) {
        try {
            //Set the endpoint for the chosen function
            String endpoint = null;
            if (func.equals("AuthorizeCard")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/AuthorizeCard";
            } else if (func.equals("AuthorizeTicket")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/AuthorizeTicket";
            } else if (func.equals("CancelTransaction")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/CancelTransaction";
            } else if (func.equals("CaptureTransaction")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/CaptureTransaction";
            } else if (func.equals("CreateTicket")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/CreateTicket";
            } else if (func.equals("RefundTransaction")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/RefundTransaction";
            } else if (func.equals("Ping")) {
                endpoint = "https://api.dibspayment.com/merchant/v1/JSON/Transaction/Ping";
            } else {
                System.out.println("Error in postToDIBS(): Given function does not exist");
                return null;
            }

            // Set properties for connection.
            // Connection is not initialized until parameters are posted
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");

            // Initiate output stream for connection and post message
            OutputStream out = connection.getOutputStream();
            out.write("request=".getBytes(Charset.forName("UTF-8")));
            ObjectMapper objectMapper = new ObjectMapper(); // ObjectMapper from the Jackson library
            objectMapper.writeValue(out, parameters);
            out.flush();
            out.close();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // OK
                @SuppressWarnings("unchecked")
                Map<String, String> response = objectMapper.readValue(connection.getInputStream(), Map.class);
                return response;
            } else {
                // Server returned HTTP error code.
                System.out.println("HTTP error!" + connection.getResponseCode());
                return null;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return parameters;
    }

    /**
     * Dependencies:
     * Apache-Commons/Commons-Codec for Hex encoding/decoding
     * Codehaus/Jackson for JSON mapping
     */
    /**
     * calculateMac Calculates the MAC from a given Map holding the post parameters and the secret key from DIBS Admin
     *
     * @param parameters Map<String, String> holding all post parameters
     * @param macKeyHex Hex encoded secret key from DIBS Admin
     * @return The MAC string calculated from the message and secret key using the hmac-sha256 algorithm
     */
    public static String calculateMac(Map<String, String> parameters, String macKeyHex) {
        try {
            // Sort the parameters ASCII-betically
            SortedMap<String, String> sortedParameters = new TreeMap<String, String>(parameters);

            // Build the string to calculate HMAC from
            StringBuilder macMsg = new StringBuilder();
            for (Map.Entry<String, String> param : sortedParameters.entrySet()) {
                if (macMsg.length() != 0) {
                    macMsg.append('&');
                }
                macMsg.append(param.getKey()).append('=').append(param.getValue());
            }

            // Decode the hex-encoded secret key
            byte[] macKey = Hex.decodeHex(macKeyHex.toCharArray());

            // Calculate the hmac from message and secret key
            Mac hmacSha256 = Mac.getInstance("HmacSHA256");
            hmacSha256.init(new SecretKeySpec(macKey, "HmacSHA256"));
            byte[] mac = hmacSha256.doFinal(macMsg.toString().getBytes(Charset.forName("UTF-8")));

            // Return the hex-encoded hmac

            return new String(Hex.encodeHex(mac));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        return null;
    }
}
