package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sebuahseni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebuahseni);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(sebuahseni.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(sebuahseni.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(sebuahseni.this, power.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(sebuahseni.this, dilan1990.class);
        startActivity(intent);
    }
}
