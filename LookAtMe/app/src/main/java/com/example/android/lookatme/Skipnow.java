package com.example.android.lookatme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Skipnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skipnow);
    }
    public void gotosignup(View view){
        Intent intent=new Intent (this,CreateAccount.class);
        startActivity(intent);
    }

    public void gotologin(View view){
        Intent intent=new Intent (this,Login.class);
        startActivity(intent);
    }
    public void gotomain(View view){
        Intent intent=new Intent (this,MainActivity.class);
        startActivity(intent);
    }
}
