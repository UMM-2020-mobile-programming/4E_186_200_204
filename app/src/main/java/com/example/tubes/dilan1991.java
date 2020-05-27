package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dilan1991 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilan1991);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(dilan1991.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(dilan1991.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(dilan1991.this, dilan1990.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(dilan1991.this, koalakumal.class);
        startActivity(intent);
    }
}
