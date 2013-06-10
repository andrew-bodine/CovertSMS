package com.sparky.covertsms;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

public class CovertEncrytpionService extends IntentService {

	public static final String TAG = "CovertSMSEncryptionService";
	
	public CovertEncrytpionService( ) {
		super( CovertEncrytpionService.TAG );
	}

	@Override
	protected void onHandleIntent( Intent arg0 ) {
		Log.i( CovertEncrytpionService.TAG, "started .." );
		SystemClock.sleep( 1000 );
		Log.i( CovertEncrytpionService.TAG, "stopping .." );
	}
}
