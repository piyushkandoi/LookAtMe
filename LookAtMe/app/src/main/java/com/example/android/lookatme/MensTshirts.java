package com.example.android.lookatme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MensTshirts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_tshirts);
    }
    public void gotoeckotshirt(View view){
        Intent intent=new Intent(this,Eckotshirt.class);
        startActivity(intent);
    }
}
