package com.owncloud.android.databases;

/**
 * Created by Sniuniu on 2016/03/15.
 */
public interface AlarmDao {

    void add();
    void delete();
    void find();
    void findAll();
    void findFirstN(int num);
    void update();

}
