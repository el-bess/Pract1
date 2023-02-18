package com.example.pract1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.os.TokenWatcher;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Pr1";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "U r in onCreate", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error in onCreate");
        Log.w(TAG, "Warning in onCreate");
        Log.i(TAG, "Info in onCreate");
        Log.d(TAG, "Debug in onCreate");
        Log.v(TAG, "Verbose in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "U r in onStart", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error in onStart");
        Log.w(TAG, "Warning in onStart");
        Log.i(TAG, "Info in onStart");
        Log.d(TAG, "Debug in onStart");
        Log.v(TAG, "Verbose in onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "U r in onStop", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error in onStop");
        Log.w(TAG, "Warning in onStop");
        Log.i(TAG, "Info in onStop");
        Log.d(TAG, "Debug in onStop");
        Log.v(TAG, "Verbose in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "U r in onDestroy", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error in onDestroy");
        Log.w(TAG, "Warning in onDestroy");
        Log.i(TAG, "Info in onDestroy");
        Log.d(TAG, "Debug in onDestroy");
        Log.v(TAG, "Verbose in onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "U r in onPause", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Error in onPause");
        Log.w(TAG, "Warning in onPause");
        Log.i(TAG, "Info in onPause");
        Log.d(TAG, "Debug in onPause");
        Log.v(TAG, "Verbose in onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "U r in onResume", Toast.LENGTH_LONG).show();
        Log.e(TAG, "About error onResume");
        Log.w(TAG, "About warning onResume");
        Log.i(TAG, "About info onResume");
        Log.d(TAG, "About debug onResume");
        Log.v(TAG, "About verbose onResume");
    }
}