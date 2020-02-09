package com.example.objekwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sejarah extends AppCompatActivity {

    Button btnCJ, btnMR, btnCB, btnMKTR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        btnCJ = (Button) findViewById(R.id.buttonCandiJiwa);
        btnCJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), candijiwa.class);
                startActivity(i);
            }
        });

        btnMR = (Button) findViewById(R.id.buttonMonumenRawaGede);
        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), monumenrawagede.class);
                startActivity(i);
            }
        });

        btnCB = (Button) findViewById(R.id.buttonCandiBlandongan);
        btnCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), candiblandongan.class);
                startActivity(i);
            }
        });

        btnMKTR = (Button) findViewById(R.id.buttonMonumenKebulatan);
        btnMKTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), monumenkebulatan.class);
                startActivity(i);
            }
        });
    }
}

