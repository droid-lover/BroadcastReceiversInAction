# Broadcast Receivers In Action
Little bit about catching the broadcast :) 
Well *Broadcast Receivers* simply respond to broadcast messages from other applications or from the system itself. 
These messages are sometime called events or intents. 

There are following two important steps to make BroadcastReceiver works for the system broadcasted intents −

1.) Creating the Broadcast Receiver.

2.) Registering Broadcast Receiver


1.) Creating the Broadcast Receiver.
A broadcast receiver is implemented as a subclass of BroadcastReceiver class and overriding the onReceive() method where each message is received as a Intent object parameter.



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
                //we can do here our task
            } else if (intent.getAction() == "CUSTOM_ACTION") {
                Toast.makeText(context, "THIS IS MY CUSTOM_ACTION.", Toast.LENGTH_LONG).show();
            } else {
    
            }
        }
    }



2.) Registering Broadcast Receiver

An application listens for specific broadcast intents by registering a broadcast receiver in AndroidManifest.xml file. 

*Broadcasting Custom Intents*


                Intent customActionIntent = new Intent();
                customActionIntent.setAction("CUSTOM_ACTION");
                sendBroadcast(customActionIntent);
                
                
