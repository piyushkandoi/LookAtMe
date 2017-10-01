package com.example.android.lookatme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
    public void buynow(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "LOOK @ ME");
        intent.putExtra(Intent.EXTRA_TEXT, "Ecko Unltd Men White and Navy Blue T-shirt\nQty: 1\nPrice: Rs 712\nMode of payment: COD");
        startActivity(intent);}
    }

