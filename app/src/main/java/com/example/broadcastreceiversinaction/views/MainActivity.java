package com.example.broadcastreceiversinaction.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.broadcastreceiversinaction.R;

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
            }
        });
    }
}
