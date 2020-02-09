package com.example.objekwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantai extends AppCompatActivity {

    Button btnTB, btnTP, btnSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai);

        btnTB = (Button) findViewById(R.id.buttonTanjungBaru);
        btnTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), tanjungbaru.class);
                startActivity(i);
            }
        });

        btnTP = (Button) findViewById(R.id.buttonTanjungPakis);
        btnTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), tanjungpakis.class);
                startActivity(i);
            }
        });

        btnSB = (Button) findViewById(R.id.buttonSamuderaBaru);
        btnSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), samuderabaru.class);
                startActivity(i);
            }
        });
    }
}

