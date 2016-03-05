package com.temnogrudova.contentprovider;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
      super(context, DB_Constants.DB_NAME, null, DB_Constants.DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
      db.execSQL(DB_Constants.DB_CREATE);
      ContentValues cv = new ContentValues();
      for (int i = 1; i <= 3; i++) {
        cv.put(DB_Constants.CONTACT_NAME, "name " + i);
        cv.put(DB_Constants.CONTACT_EMAIL, "email " + i);
        db.insert(DB_Constants.CONTACT_TABLE, null, cv);
      }
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
  }