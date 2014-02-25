package com.example.miniprosjekt_mobil_betaling_DibsPaymentWindow;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class MyActivity extends Activity {

    private AuthorizeCard authorizeCard;
    private Button buttonSubmit;
    private EditText editTextAmount;
    private EditText editTextCardNumber;
    private EditText editTextCVC;
    private EditText editTextExpMonth;
    private EditText editTextExpYear;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        authorizeCard = new AuthorizeCard();

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        editTextCardNumber = (EditText) findViewById(R.id.editTextCardNumber);
        editTextCVC = (EditText) findViewById(R.id.editTextCVC);
        editTextExpMonth = (EditText) findViewById(R.id.editTextExpMonth);
        editTextExpYear = (EditText) findViewById(R.id.editTextExpYear);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int amount = Integer.parseInt(editTextAmount.getText().toString());
                String cardNumber = editTextCardNumber.getText().toString();
                String currency = "NOK";
                String merchantId = "987654321";
                String orderId = "1";
                String cvc = editTextCVC.getText().toString();
                int expMonth = Integer.parseInt(editTextExpMonth.getText().toString());
                int expYear = Integer.parseInt(editTextExpYear.getText().toString());
                String macKeyHex =
                        "6926337856665a2b7931584a23346761247e396a714b3a644e797539362b3b5a572d3f24446a707d2d5164776e51" +
                                "7543303925316433492352286f6b4e2a4368";
                new AuthorizeCardTask(amount, cardNumber, currency, merchantId, orderId, cvc, expMonth,
                        expYear, macKeyHex).execute();

            }
        });



    }

    public String getIpAddress() {
        String ip = null;
        String str;
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpGet httpget = new HttpGet("http://ip2country.sourceforge.net/ip2c.php?format=JSON");
            // HttpGet httpget = new HttpGet("http://whatismyip.com.au/");
            // HttpGet httpget = new HttpGet("http://www.whatismyip.org/");
            HttpResponse response;

            response = httpclient.execute(httpget);
            //Log.i("externalip",response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            entity.getContentLength();
            str = EntityUtils.toString(entity);

            JSONObject json_data = new JSONObject(str);
            ip = json_data.getString("ip");

        }
        catch (Exception e){
            Log.e(this.getClass().getSimpleName(), e.getMessage());
            e.printStackTrace();
        }

        return ip;
    }

    private class AuthorizeCardTask extends AsyncTask<Void, Void, Void> {

        private int amount;
        private String cardNumber;
        private String currency;
        private String merchantId;
        private String orderId;
        private String cvc;
        private int expMonth;
        private int expYear;
        private String macKeyHex;

        private AuthorizeCardTask(int amount, String cardNumber, String currency, String merchantId,
                                  String orderId, String cvc, int expMonth, int expYear, String macKeyHex) {
            this.amount = amount;
            this.cardNumber = cardNumber;
            this.currency = currency;
            this.merchantId = merchantId;
            this.orderId = orderId;
            this.cvc = cvc;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.macKeyHex = macKeyHex;
        }

        @Override
        protected Void doInBackground(Void... params) {
            String clientIp = getIpAddress();
            authorizeCard.authorizeCard(amount, cardNumber, clientIp, currency, merchantId,
                    orderId, cvc, expMonth, expYear, macKeyHex);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

        }
    }
}
