package com.example.practica3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B;
        B = (Button) findViewById(R.id.changeActivity);
        B.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}