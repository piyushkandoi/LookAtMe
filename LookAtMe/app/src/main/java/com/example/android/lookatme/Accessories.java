package com.example.android.lookatme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Accessories extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);
    }

    public void gotosung(View view) {
        Intent intent = new Intent(this, sunglass_types.class);
        startActivity(intent);
    }

    public void gotojewel(View view) {
        Intent intent = new Intent(this, Jewellery.class);
        startActivity(intent);
    }
}