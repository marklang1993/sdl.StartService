package jp.ac.titech.itpro.sdl.startservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class Service3BroadcastReceiver extends BroadcastReceiver {
    private final static String TAG = Service3BroadcastReceiver.class.getSimpleName();
    public final static String EXTRA_MYARG = "MYARG";

    public final static String ACTION = "T3_ACTION";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive in " + Thread.currentThread());
        Log.d(TAG, "myarg = " + intent.getStringExtra(EXTRA_MYARG));
    }
}
