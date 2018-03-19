package com.example.broadcastreceiversinaction.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by sachin on 19/03/18.
 */

public class MyGlobalReceiver extends BroadcastReceiver {


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Event", "Coming here of my Action" + intent);

        Log.d("Event", "Action is " + intent.getAction());

        if (intent.getAction() == "android.intent.action.ACTION_POWER_CONNECTED") {
            Toast.makeText(context, "POWER_CONNECTED.", Toast.LENGTH_LONG).show();

        } else if (intent.getAction() == "android.intent.action.ACTION_POWER_DISCONNECTED") {
            Toast.makeText(context, "POWER_DISCONNECTED.", Toast.LENGTH_LONG).show();
        } else if (intent.getAction() == "android.intent.action.ACTION_BATTERY_OKAY") {
            Toast.makeText(context, "ACTION_BATTERY_OKAY.", Toast.LENGTH_LONG).show();
        } else if (intent.getAction() == "android.intent.action.AIRPLANE_MODE") {
            Toast.makeText(context, "AIRPLANE_MODE.", Toast.LENGTH_LONG).show();
        } else if (intent.getAction() == "android.intent.action.ACTION_BATTERY_LOW") {
            Toast.makeText(context, "ACTION_BATTERY_LOW.", Toast.LENGTH_LONG).show();
        }else if (intent.getAction() == "android.intent.action.DATE_CHANGED") {
            Toast.makeText(context, "DATE_CHANGED.", Toast.LENGTH_LONG).show();
        }else if (intent.getAction() == "CUSTOM_ACTION") {
            Toast.makeText(context, "THIS IS MY CUSTOM_ACTION.", Toast.LENGTH_LONG).show();
        } else {

        }
    }
}


//    Notification noti = new Notification.Builder(context)
//            .setContentTitle("Power is connected now")
//            .setContentText("POWER_CONNECTED").setSmallIcon(R.mipmap.ic_launcher)
//            .build();
//    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
//// hide the notification after its selected
//            noti.flags |= Notification.FLAG_AUTO_CANCEL;
//
//                    notificationManager.notify(0, noti);
