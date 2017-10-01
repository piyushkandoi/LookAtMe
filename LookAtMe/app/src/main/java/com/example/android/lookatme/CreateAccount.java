package com.example.android.lookatme;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.lookatme.data.loginDbHelper;

import static com.example.android.lookatme.data.loginContract.loginEntry;

public class CreateAccount extends AppCompatActivity {

    private loginDbHelper mDbHelper = new loginDbHelper(this);
    private EditText mNameEditText;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        mNameEditText = (EditText) findViewById(R.id.name);
        mEmailEditText = (EditText) findViewById(R.id.email);
        mPasswordEditText = (EditText) findViewById(R.id.password);
    }
    public void gotologin(View view){
        Intent intent=new Intent (this,Login.class);
        startActivity(intent);
    }
    public void insertUser(View view) {
        String nameString = mNameEditText.getText().toString().trim();
        String emailString = mEmailEditText.getText().toString().trim();
        String passwordString = mPasswordEditText.getText().toString().trim();
        SQLiteDatabase db=mDbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(loginEntry.COLUMN_USERNAME,nameString);
        values.put(loginEntry.COLUMN_EMAIL,emailString);
        values.put(loginEntry.COLUMN_PASSWORD, passwordString);
        long newRowId=db.insert(loginEntry.TABLE_NAME, null, values);
        if(newRowId==-1){
            Toast.makeText(this,"Error in saving user",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"User saved with row ID: "+newRowId,Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,Login.class);
            startActivity(i);
        }
    }
}