package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(MainActivity.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(MainActivity.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(MainActivity.this, laskarpelangi.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(MainActivity.this, maxhavelaar.class);
        startActivity(intent);
    }



}
