package dk.dibs.android.library.example;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import dk.dibs.android.library.PaymentResultListener;

import java.util.Map;

/**
 * Your implementation of the PaymentResultListener interface.
 * <p/>
 * Before showing the payment window, an instance of this class is set as listener,
 * which ensures that the app is notified via callbacks when certain events in the
 * payment flow occurs.
 */
public class MyPaymentResultListener implements PaymentResultListener {

    private static final String TAG = "DIBS." + MyPaymentResultListener.class.getSimpleName();

    private Context context;

    public MyPaymentResultListener(Context context) {
        this.context = context;
    }

    @Override
    public void paymentAccepted(Map<String, String> paymentData) {
        Toast.makeText(context, "Paywin says: paymentAccepted", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "paymentAccepted: " + paymentData);
    }

    @Override
    public void paymentCancelled(Map<String, String> paymentData) {
        Toast.makeText(context, "Paywin says: paymentCancelled", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "paymentCancelled: " + paymentData);
    }

    @Override
    public void paymentWindowLoaded() {
        Toast.makeText(context, "Paywin says: paymentWindowLoaded", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "paymentWindowLoaded");
    }

    @Override
    public void cancelUrlLoaded() {
        Toast.makeText(context, "Paywin says: cancelUrlLoaded", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "cancelUrlLoaded");
    }

    @Override
    public void failedLoadingPaymentWindow() {
        Toast.makeText(context, "Paywin says: failedLoadingPaymentWindow", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "failedLoadingPaymentWindow");
    }

    @Override
    public void errorOccurred(Map<String, String> errorInfo) {
        Log.d(TAG, "errorDidOccur: " + errorInfo);

        int errNo = Integer.parseInt(errorInfo.get(PaymentResultListener.ERROR_INFO_KEY_NUMBER));
        String errMsg = errorInfo.get(PaymentResultListener.ERROR_INFO_KEY_MESSAGE);

        int toastDuration;
        String toastMsg;
        if (errNo <= PaymentResultListener.CRITICAL_ERROR_MAX) {
            //
            // When you get a critical error here, your app SHOULD cancel/dismiss payment view.
            //
            toastDuration = Toast.LENGTH_LONG;
            toastMsg = "Paywin says: errorDidOccur CRITICAL " + errNo + ", " + errMsg + " - payment must be cancelled!!";
        } else {
            toastDuration = Toast.LENGTH_SHORT;
            toastMsg = "Paywin says: errorDidOccur " + errNo + ", " + errMsg;

        }
        Toast.makeText(context, toastMsg, toastDuration).show();
    }
}
