package com.owncloud.android.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Sniuniu on 2016/03/15.
 */
public class AlarmImpl implements AlarmDao {

    private final AlarmDBHelper helper;
    private final SQLiteDatabase db;

    public AlarmImpl(Context context) {
        helper = new AlarmDBHelper(context);
        db = helper.getWritableDatabase();
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void findFirstN(int num) {

    }

    @Override
    public void update() {

    }
}
