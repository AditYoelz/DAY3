package com.example.tamastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bmw extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmw);

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
                Intent ducati = new Intent(bmw.this, s1krr.class);
                startActivity(ducati);
            }
        });
    }

    void tkn3() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(bmw.this, s1kxr.class);
                startActivity(ducati);
            }
        });
    }

    void tkn2() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(bmw.this, f900r.class);
                startActivity(ducati);
            }
        });
    }

    void tkn4() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(bmw.this, g310r.class);
                startActivity(ducati);
            }
        });
    }

    void tkn5() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ducati = new Intent(bmw.this, r18.class);
                startActivity(ducati);
            }
        });
    }
}



