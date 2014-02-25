package no.mesan.mobil.betaling;

import android.app.Activity;
import android.os.Bundle;
import dk.dibs.android.library.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private DibsPayment paymentWindow;



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        paymentWindow = (DibsPayment) findViewById(R.id.DibsPayment);

        paymentWindow.setBackgroundColor(android.R.color.holo_purple);
        // Set your listener implementation, to get callbacks in the life-cycle of a payment processing

        // Load the payment window with the payment data that suits the payment flow you need
        // Please be patient, when loading on the emulator
        paymentWindow.loadPaymentWindow(constructPaymentData());


    }

    private PaymentData constructPaymentData() {
        // IMPORTANT: This needs to be set to YOUR merchant number, that you have obtained through an
        // agreement with DIBS.
        //you can use the merchant "demo" for a demorun through the payment window // read information about demo mode in the documentation

        String merchantId = "demo";

        // The currency the payment is to be processed in
        String currencyCode = "NOK";

        // You set this to your own orderId value
        String yourOrderId = "42";

        // The amount to be paid, given in "least possible unit" (aka: "oerer")
        long amount = 1;

        // The cards that is allowed to be used in payment window
        List<String> payTypes = new ArrayList<String>();
        payTypes.add("VISA");
        payTypes.add("MC");
        payTypes.add("AMEX");
        payTypes.add("DIN");
        payTypes.add("ELEC");
        payTypes.add("DK");
        payTypes.add("MTRO");

        // this will add fee to the payment window.
        boolean calcfee = false;

        // In this example, we simply use "PurchasePaymentData", which is a simple "buy-with-credit-card" flow,
        // where no pre-authorization is performed.
        //
        // Look to other subclasses of PaymentData for the other supported flows.
        //
        PurchasePaymentData paymentData = new PurchasePaymentData(merchantId, currencyCode, yourOrderId, amount, payTypes);
        //PurchasePaymentData paymentData = new PreAuthorizationPaymentData()


        paymentData.setCalcfee(calcfee);

        // Set this flag to "true", if you want to be able to use test cards.
        // REMEMBER to reset this to false, in production !!!
        paymentData.setTest(true);

        // If you want checks (and payment failure) if the orderId you gave already have been payed.
        paymentData.setUseUniqueOrderIdCheck(false);

        // If you want MAC security calculations, you will need to pre-calculate a MAC value on your server,
        // based on the values you give to this payment window, and set this pre-calculated MAC value like this.
        //
        //paymentData.setCalculatedMAC("YourPreCalculatedMACValueHere");

        // Payment window supports loading cancel or callback URLs based on payment outcome.
        // Another, and maybe better, way to do this in an app, is to listen for the proper callbacks
        // on the listener you set on the payment window, and then do your own cancel or payment success
        // handling against your own servers.
        //
        //paymentData.setCallbackUrl(new URL("yourCallbackURL"));
        //paymentData.setCancelUrl(new URL("yourCancelURL"));

        paymentData.setLanguage("nb_NO");
        paymentData.setTheme(Theme.ANDROID_DIBS);


        // If you need to, you can pass custom options to the payment window, which will be posted back again.
        //
        //Map<String, String> yourCustomOptions = new HashMap<String, String>();
        //yourCustomOptions.put("foo", "bar");
        //paymentData.setCustomOptions(yourCustomOptions);

        return paymentData;
    }
}
