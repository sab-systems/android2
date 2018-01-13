package sabm.intent_service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first
        // Do what you want.
        Toast.makeText(getApplicationContext(), "simulate on pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
        // Do what you want.
        Toast.makeText(getApplicationContext(), "hey, back again", Toast.LENGTH_SHORT).show();
    }


    public void start_intent_service(View view) {

        Intent myIntent = new Intent(this, TutorialIntentService.class);
        //myIntent.setData(Uri.parse("http://www.google.de"));

        // Starts the IntentService
        this.startService(myIntent);

        //Toast.makeText(getApplicationContext(), "created new IntentService", Toast.LENGTH_SHORT).show();
    }

    public void info_on_pause(View view) {
        Toast.makeText(getApplicationContext(), "to simulate on pause you must switch off this app, then onPause() will load", Toast.LENGTH_LONG).show();
    }


}