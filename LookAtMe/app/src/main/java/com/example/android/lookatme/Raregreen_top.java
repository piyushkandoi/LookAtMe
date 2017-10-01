package com.example.android.lookatme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Raregreen_top extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raregreen_top);
    }
    public void addtocart(View view){
        Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT)
                .show();
    }
}
