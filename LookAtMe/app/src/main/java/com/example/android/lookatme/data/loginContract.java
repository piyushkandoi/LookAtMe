package com.example.android.lookatme.data;
import android.provider.BaseColumns;
public class loginContract {
    public final static class loginEntry implements BaseColumns
    {
        public final static String _ID=BaseColumns._ID;
        public final static String TABLE_NAME="login";
        public final static String COLUMN_USERNAME="name";
        public final static String COLUMN_EMAIL="email";
        public final static String COLUMN_PASSWORD="password";
    }
}