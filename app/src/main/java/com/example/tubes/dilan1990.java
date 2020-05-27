package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dilan1990 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilan1990);
    }

    public void Sewa(View view) {
        Intent intent = new Intent(dilan1990.this, sewa.class);
        startActivity(intent);
    }

    public void Beli(View view) {
        Intent intent = new Intent(dilan1990.this, beli.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(dilan1990.this, sebuahseni.class);
        startActivity(intent);
    }

    public void Previous(View view) {
        Intent intent = new Intent(dilan1990.this, dilan1991.class);
        startActivity(intent);
    }
}
