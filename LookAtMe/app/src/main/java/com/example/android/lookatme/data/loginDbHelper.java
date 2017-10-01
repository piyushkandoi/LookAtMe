package com.example.android.lookatme.data;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static com.example.android.lookatme.data.loginContract.loginEntry;
/**
 * Created by Student on 4/18/2017.
 */
public class loginDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="entry.db";
    public loginDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
//create table and write the entire schema of that table in here
        String SQL_CREATE_LOGIN_TABLE="CREATE TABLE "+ loginEntry.TABLE_NAME+" ("
                + loginEntry._ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +loginEntry.COLUMN_USERNAME+" TEXT NOT NULL,"
                +loginEntry.COLUMN_EMAIL+" TEXT NOT NULL,"
                +loginEntry.COLUMN_PASSWORD+" TEXT NOT NULL)";
        db.execSQL(SQL_CREATE_LOGIN_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}