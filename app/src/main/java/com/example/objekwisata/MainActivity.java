package com.example.objekwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnTujuanWisata, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

        btnTujuanWisata = (Button) findViewById(R.id.buttonTujuanxWisata);
        btnTujuanWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), tujuanwisata.class);
                startActivity(i);
            }
        });

        btnAbout = (Button) findViewById(R.id.buttonAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), about.class);
                startActivity(i);
            }
        });
    }
    }
