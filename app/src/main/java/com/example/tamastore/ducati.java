package com.example.tamastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ducati extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ducati);

        btn1 = findViewById(R.id.btn1d);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        tkn1();
        tkn2();
        tkn3();
        tkn4();
        tkn5();

    }

    void tkn1() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(ducati.this, v4s.class);
                startActivity(ducati);
            }
        });
    }

    void tkn3() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(ducati.this, hypermotard.class);
                startActivity(ducati);
            }
        });
    }

    void tkn2() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(ducati.this, powerstage.class);
                startActivity(ducati);
            }
        });
    }

    void tkn4() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(ducati.this, scramble.class);
                startActivity(ducati);
            }
        });
    }

    void tkn5() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(ducati.this, daviel.class);
                startActivity(ducati);
            }
        });
    }
}

    

