package com.example.android.lookatme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mensshirts extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensshirts);
    }

    public void gotoshirt(View view)
    {
        Intent intent=new Intent(this,John_checkedshirt.class);
        startActivity(intent);
    }
}
