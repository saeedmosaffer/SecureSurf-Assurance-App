package edu.birzeit.saeedmosaffer.securesurfassuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import edu.birzeit.saeedmosaffer.securesurfassuranceapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStarted(View view) {
        Intent intent = new Intent(this, PolicyAcceptanceActivity.class);
        startActivity(intent);
    }
}