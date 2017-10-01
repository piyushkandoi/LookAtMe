package com.example.android.lookatme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops);
    }
    public void gotogreen(View view)
    {
        Intent intent=new Intent(this,Raregreen_top.class);
        startActivity(intent);
    }
}
