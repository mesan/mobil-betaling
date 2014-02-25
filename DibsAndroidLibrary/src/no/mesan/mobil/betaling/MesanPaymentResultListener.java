package no.mesan.mobil.betaling;

import android.util.Log;
import dk.dibs.android.library.PaymentResultListener;

import java.util.Map;

public class MesanPaymentResultListener implements PaymentResultListener {

    @Override
    public void paymentAccepted(Map<String, String> stringStringMap) {
        Log.i("paymentAccepted", "Oh yeah");
    }

    @Override
    public void paymentCancelled(Map<String, String> stringStringMap) {
        Log.i("paymentCancelled", "Oh yeah");
    }

    @Override
    public void paymentWindowLoaded() {
        Log.i("paymentWindowLoaded", "Oh yeah");
    }

    @Override
    public void cancelUrlLoaded() {
        Log.i("cancelUrlLoaded", "Oh yeah");
    }

    @Override
    public void failedLoadingPaymentWindow() {
        Log.i("failedLoadingPaymentWindow", "Oh yeah");
    }

    @Override
    public void errorOccurred(Map<String, String> stringStringMap) {
        Log.i("errorOccurred", "Oh yeah");
    }
}
