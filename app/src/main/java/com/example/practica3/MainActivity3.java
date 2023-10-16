package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b1;
        TextView text;

        text = findViewById(R.id.textt);
        b1 = findViewById(R.id.volver);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                new CountDownTimer(5000, 1000){
                    @Override
                    public void onTick(long l) {
                        int seconds = (int) (l/1000);
                        text.setText(String.valueOf(seconds));
                    }
                    @Override
                    public void onFinish() {
                        Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                        startActivity(i);
                    }
                }.start();
            }
        });
    }
}