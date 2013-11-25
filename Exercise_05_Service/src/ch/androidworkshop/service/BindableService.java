package ch.androidworkshop.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class BindableService extends Service {

	// TODO: Create a binder here
	// - Extend the Binder base class
	// - provide a getService() method to access the BindableService-instance

	@Override
	public IBinder onBind(Intent intent) {
		// TODO return your binder here
		return null;
	}

	public void writeSomethingToLogFile(String data) {
		Log.d("CustomIntentService", data);
	}
}
