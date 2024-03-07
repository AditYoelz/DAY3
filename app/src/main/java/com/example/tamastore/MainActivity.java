package com.example.tamastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dcbtn, mvbtn, bmwbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dcbtn = findViewById(R.id.dcbtn);
        bmwbtn = findViewById(R.id.bmwbtn);
        mvbtn = findViewById(R.id.mvbtn);

        tekan();
        tkn();
        tekkan();
    }



    void tekan() {
        dcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(MainActivity.this, ducati.class);
                startActivity(ducati);
            }
        });
    }

    void tkn() {
        bmwbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beemwe = new Intent(MainActivity.this, bmw.class);
                startActivity(beemwe);
            }
        });
    }


    void tekkan() {
        mvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mv = new Intent(MainActivity.this, mv.class);
                startActivity(mv);
            }
        });
    }
}