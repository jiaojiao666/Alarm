package com.owncloud.android.databases;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sniuniu on 2016/03/15.
 */
public class AlarmDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "alarmManage.db";
    private static final int VERSION = 1;

    public AlarmDBHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    public AlarmDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public AlarmDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void createTable(){

    }

}
