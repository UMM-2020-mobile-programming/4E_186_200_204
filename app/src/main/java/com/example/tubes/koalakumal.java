package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class koalakumal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koalakumal);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(koalakumal.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(koalakumal.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(koalakumal.this, dilan1991.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(koalakumal.this, laskarpelangi.class);
        startActivity(intent);
    }
}
