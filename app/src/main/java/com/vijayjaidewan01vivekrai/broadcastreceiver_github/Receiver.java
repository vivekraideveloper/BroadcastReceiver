package com.vijayjaidewan01vivekrai.broadcastreceiver_github;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by MR VIVEK RAI on 03-06-2018.
 */

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcast Receiver working!", Toast.LENGTH_SHORT).show();

    }
}