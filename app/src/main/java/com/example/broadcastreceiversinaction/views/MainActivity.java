package com.example.broadcastreceiversinaction.views;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.broadcastreceiversinaction.R;
import com.example.broadcastreceiversinaction.receivers.MyGlobalReceiver;

public class MainActivity extends AppCompatActivity {

    private Button customActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        customActionButton = (Button) findViewById(R.id.custom_action_button);

        customActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent customActionIntent = new Intent();
                customActionIntent.setAction("CUSTOM_ACTION");
                sendBroadcast(customActionIntent);

                //We can register the Receiver Programmatically also like -
//                IntentFilter customActionIntent = new IntentFilter("CUSTOM_ACTION");
//
//                MyGlobalReceiver myGlobalReceiver = new MyGlobalReceiver();
//                registerReceiver(myGlobalReceiver,customActionIntent);
            }
        });
    }
}
