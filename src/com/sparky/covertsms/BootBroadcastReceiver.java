package com.sparky.covertsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver {

	public static final String TAG = "CovertSMSBootListener";
	
	@Override
	public void onReceive( Context context, Intent intent ) {
		
		Log.i( BootBroadcastReceiver.TAG, "RECEIVED BOOT COMPLETED BROADCAST" );
		
		Intent mIntent = new Intent( context, CovertEncrytpionService.class );
		context.startService( mIntent );
	}
}
