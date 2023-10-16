package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button B1;
        Button B2;
        Button Correo;
        Button Telefono;

        Correo = findViewById(R.id.ButtonTres);
        Telefono =  findViewById(R.id.telefono);
        B1 = (Button) findViewById(R.id.ButtonUno);
        B2 = findViewById(R.id.ButtonDos);

        View.OnClickListener mainTres = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        };

        View.OnClickListener mainTelefono = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:8715200251"));
                startActivity(i);
            }
        };

        View.OnClickListener mainCorreo = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_APP_EMAIL);

                startActivity(i);
            }
        };

        View.OnClickListener mainSiia = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("uttorreon.mx"));
                startActivity(i);
            }
        };

        Correo.setOnClickListener(mainCorreo);
        Telefono.setOnClickListener(mainTelefono);
        B1.setOnClickListener(mainTres);
        B2.setOnClickListener(mainSiia);
    }






}