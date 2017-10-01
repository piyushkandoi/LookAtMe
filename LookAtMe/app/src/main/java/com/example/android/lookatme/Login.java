package com.example.android.lookatme;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.android.lookatme.data.loginDbHelper;
import static com.example.android.lookatme.data.loginContract.loginEntry;
public class Login extends AppCompatActivity {
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private loginDbHelper mDbHelper = new loginDbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEmailEditText = (EditText) findViewById(R.id.email);
        mPasswordEditText = (EditText) findViewById(R.id.password);
    }
    public void gotosignup(View view) {
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
    public void gotomainActivity(View view) {
        verify();
    }
    private void verify() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                loginEntry._ID,
                loginEntry.COLUMN_USERNAME,
                loginEntry.COLUMN_EMAIL,
                loginEntry.COLUMN_PASSWORD};

        // Perform a query on the pets table
        Cursor cursor = db.query(
                loginEntry.TABLE_NAME,   // The table to query
                projection,            // The columns to return
                null,                  // The columns for the WHERE clause
                null,                  // The values for the WHERE clause
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);                   // The sort order
        try {
            int idColumnIndex = cursor.getColumnIndex(loginEntry._ID);
            int nameColumnIndex = cursor.getColumnIndex(loginEntry.COLUMN_USERNAME);
            int emailColumnIndex = cursor.getColumnIndex(loginEntry.COLUMN_EMAIL);
            int passwordColumnIndex = cursor.getColumnIndex(loginEntry.COLUMN_PASSWORD);
            while (cursor.moveToNext()) {
                int currentID = cursor.getInt(idColumnIndex);
                String currentName = cursor.getString(nameColumnIndex);
                String currentEmail = cursor.getString(emailColumnIndex);
                String currentPassword = cursor.getString(passwordColumnIndex);
                String emailString = mEmailEditText.getText().toString().trim();
                String passwordString = mPasswordEditText.getText().toString().trim();

                if(currentEmail.equals(emailString)) {
                    if ((emailString.equals(currentEmail)) && (passwordString.equals(currentPassword))) {
                        Intent i = new Intent(this, MainActivity.class);
                        startActivity(i);
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                        break;

                    } else {
                        Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                    }}}} finally {
            cursor.close();
        }
    }
}