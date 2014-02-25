package dk.dibs.android.library.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dk.dibs.android.library.DibsPayment;
import dk.dibs.android.library.PaymentData;
import dk.dibs.android.library.PaymentServer;
import dk.dibs.android.library.PurchasePaymentData;
import dk.dibs.android.library.Theme;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Example app that shows how to use DIBS payment library.
 * <p/>
 * It shows how to:
 * <ul>
 * <li>Initialize library with URLs and payment window paths (see static initializers)</li>
 * <li>Obtain callbacks to a payment window listener (see {@link #onCreate(android.os.Bundle)} and {@link MyPaymentResultListener})</li>
 * <li>Construct payment data for payment window and show it (see {@link #onCreate(android.os.Bundle)} and {@link #constructPaymentData()})</li>
 * <li>Cancel ongoing payment processing (see {@link #onCreateOptionsMenu(android.view.Menu)} and {@link #onOptionsItemSelected(android.view.MenuItem)})</li>
 * </ul>
 */
public class DibsPaymentLibraryExampleApp extends Activity {

    private static final String TAG = "DIBS." + DibsPaymentLibraryExampleApp.class.getSimpleName();

    private DibsPayment paymentWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        paymentWindow = (DibsPayment) findViewById(R.id.DibsPayment);

        // Set your listener implementation, to get callbacks in the life-cycle of a payment processing
        paymentWindow.setPaymentResultListener(new MyPaymentResultListener(this));

        // Load the payment window with the payment data that suits the payment flow you need
        // Please be patient, when loading on the emulator
        paymentWindow.loadPaymentWindow(constructPaymentData());
    }

    /**
     * Shows a "cancel" action in the options menu on the phone, which shows how to
     * call cancel functionality into the payment window to cancel ongoing payment processing.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.payment_window_menu, menu);
        return true;
    }

    /**
     * If user chose "cancel" in options menu, we call "cancel" into payment window.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuitem_payment_window_cancel:
                //
                // Calling cancel into payment window cancels the ongoing payment processing.
                // Because cancelling is an asynchronous process, you will need to wait for a callback
                // to paymentCancelled on your PaymentResultListener listener, before being positive that
                // payment window is done cancelling.
                //
                paymentWindow.cancelPayment();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * @return the payment data instance that is needed as input to {@link DibsPayment#loadPaymentWindow(dk.dibs.android.library.PaymentData)}
     */
    private PaymentData constructPaymentData() {
        // IMPORTANT: This needs to be set to YOUR merchant number, that you have obtained through an
        // agreement with DIBS.
        //you can use the merchant "demo" for a demorun through the payment window // read information about demo mode in the documentation

        String merchantId = "demo";

        // The currency the payment is to be processed in
        String currencyCode = "DKK";

        // You set this to your own orderId value
        String yourOrderId = "42";

        // The amount to be paid, given in "least possible unit" (aka: "oerer")
        long amount = 1250;

        // The cards that is allowed to be used in payment window
        List<String> payTypes = new ArrayList<String>();
        payTypes.add("DK");
        payTypes.add("VISA");
        payTypes.add("V-DK");

        // this will add fee to the payment window.
        boolean calcfee = true;


        // In this example, we simply use "PurchasePaymentData", which is a simple "buy-with-credit-card" flow,
        // where no pre-authorization is performed.
        //
        // Look to other subclasses of PaymentData for the other supported flows.
        //
        PurchasePaymentData paymentData = new PurchasePaymentData(merchantId, currencyCode, yourOrderId, amount, payTypes);

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

        paymentData.setLanguage("da_DK");
        paymentData.setTheme(Theme.ANDROID_DIBS);


        // If you need to, you can pass custom options to the payment window, which will be posted back again.
        //
        //Map<String, String> yourCustomOptions = new HashMap<String, String>();
        //yourCustomOptions.put("foo", "bar");
        //paymentData.setCustomOptions(yourCustomOptions);

        return paymentData;
    }

}
