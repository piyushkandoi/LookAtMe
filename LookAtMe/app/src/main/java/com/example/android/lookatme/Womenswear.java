package com.example.android.lookatme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Womenswear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womenswear);
    }
    public void gotoaccessories(View view){
        Intent intent=new Intent(this,Accessories.class);
        startActivity(intent);
    }
    public void gotoethnic(View view){
        Intent intent=new Intent(this,EthenicWear.class);
        startActivity(intent);
    }
    public void gototops(View view){
        Intent intent=new Intent(this,Tops.class);
        startActivity(intent);
    }
}
