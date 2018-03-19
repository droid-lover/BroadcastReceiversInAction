# BroadcastReceiversInAction
Little bit about catching the broadcast :) 
Well *Broadcast Receivers* simply respond to broadcast messages from other applications or from the system itself. 
These messages are sometime called events or intents. 

There are following two important steps to make BroadcastReceiver works for the system broadcasted intents −

1.) Creating the Broadcast Receiver.

2.) Registering Broadcast Receiver


1.) Creating the Broadcast Receiver.
A broadcast receiver is implemented as a subclass of BroadcastReceiver class and overriding the onReceive() method where each message is received as a Intent object parameter.

public class MyReceiver extends BroadcastReceiver {
   @Override
   public void onReceive(Context context, Intent intent) {
      Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
      //Here we can do our work after we get this event action here
   }
}

2.) Registering Broadcast Receiver

An application listens for specific broadcast intents by registering a broadcast receiver in AndroidManifest.xml file. 

*Broadcasting Custom Intents*


                Intent customActionIntent = new Intent();
                customActionIntent.setAction("CUSTOM_ACTION");
                sendBroadcast(customActionIntent);
                
                
