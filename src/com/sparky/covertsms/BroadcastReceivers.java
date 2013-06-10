package com.sparky.covertsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceivers {

	public static class SMSReceivedBR extends BroadcastReceiver {

		public static final String TAG = "CovertSMS_SMSReceivedBR";
		
		@Override
		public void onReceive( Context context, Intent intent ) {
			
			Log.i( BootBroadcastReceiver.TAG, "BROADCAST: SMS RECEIVED" );
		}	
	}
}
