package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maxhavelaar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxhavelaar);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(maxhavelaar.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(maxhavelaar.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(maxhavelaar.this, MainActivity.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(maxhavelaar.this, power.class);
        startActivity(intent);
    }
}
