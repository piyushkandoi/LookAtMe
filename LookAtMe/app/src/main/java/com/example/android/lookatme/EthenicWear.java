package com.example.android.lookatme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EthenicWear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethenic_wear);
    }
    public void gotosuit(View view)
    {
        Intent intent=new Intent(this,Ethenic_suitanarkali.class);
        startActivity(intent);
    }
}
