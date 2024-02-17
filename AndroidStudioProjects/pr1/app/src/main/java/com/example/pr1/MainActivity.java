package com.example.pr1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "1PRAKTIKA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "App created");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение создано", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "App started");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение запущено", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "App stopped");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение приостановленно", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "App destroyed");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение перезапущенно", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "App paused");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение остановленно", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "App resumed");
        Toast toast = Toast.makeText(getApplicationContext(), "Приложение возобновленно", Toast.LENGTH_LONG);
        toast.show();
    }
}