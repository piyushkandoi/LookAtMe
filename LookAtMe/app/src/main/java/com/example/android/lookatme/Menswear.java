package com.example.android.lookatme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menswear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menswear);
    }
    public void gototshirts(View view){
        Intent intent=new Intent(this,MensTshirts.class);
        startActivity(intent);
    }

    public void gotomensethnicwear (View view){
        Intent intent=new Intent(this,MensEthnicwear.class);
        startActivity(intent);
    }
    public void gotomensshirts (View view){
        Intent intent=new Intent(this,Mensshirts.class);
        startActivity(intent);
    }
}
