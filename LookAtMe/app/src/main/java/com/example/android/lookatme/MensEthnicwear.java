package com.example.android.lookatme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MensEthnicwear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_ethnicwear);
    }
    public void gotosherwani(View view){
        Intent intent = new Intent(this,Sherwani.class);
        startActivity(intent);
    }
}
