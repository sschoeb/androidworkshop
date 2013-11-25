package ch.androidworkshop.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// TODO:
		// Access your button here
		// Add an View.OnClickListener
		// Execute the showClickedToast()-method when the button is clicked
	}

	private void showClickedToast() {
		Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show();
	}
}
