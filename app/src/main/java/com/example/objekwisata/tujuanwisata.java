package com.example.objekwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tujuanwisata extends AppCompatActivity {

    Button btnSejarah, btnPantai, btnDanau, btnCurug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuanwisata);

        btnSejarah = (Button) findViewById(R.id.buttonSejarah);
        btnSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), sejarah.class);
                startActivity(i);
            }
        });

        btnPantai = (Button) findViewById(R.id.buttonPantai);
        btnPantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), pantai.class);
                startActivity(i);
            }
        });

        btnDanau = (Button) findViewById(R.id.buttonDanau);
        btnDanau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), danau.class);
                startActivity(i);
            }
        });

        btnCurug = (Button) findViewById(R.id.buttonCurug);
        btnCurug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), curug.class);
                startActivity(i);
            }
        });
    }
}

