package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class power extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(power.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(power.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(power.this, maxhavelaar.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(power.this, sebuahseni.class);
        startActivity(intent);
    }
}
