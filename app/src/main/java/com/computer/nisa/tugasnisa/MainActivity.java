package com.computer.nisa.tugasnisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgkacang, imgkusam, imggigit, imgterminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {

        imgterminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("gambar","terminal");
                startActivity(d);
            }
        });

        imgkacang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("gambar","kacang");
                startActivity(c);
            }
        });

        imggigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("gambar","gigit");
                startActivity(a);
            }
        });

        imgkusam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("gambar","kusam");
                startActivity(al);
            }
        });
    }

    private void setInisialisasi() {
        imgterminal= (ImageView)findViewById(R.id.terminal);
        imgkacang = (ImageView)findViewById(R.id.kacang);
        imggigit = (ImageView)findViewById(R.id.gigit);
        imgkusam= (ImageView)findViewById(R.id.kusam);
    }
}
