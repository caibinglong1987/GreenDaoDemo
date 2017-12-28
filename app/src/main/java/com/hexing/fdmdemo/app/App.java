package com.hexing.fdmdemo.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;
import com.hexing.fdmdemo.db.CusSQLiteOpenHelper;
import com.hexing.fdmdemo.db.DaoMaster;
import com.hexing.fdmdemo.db.DaoSession;

/**
 * @author HEC271
 *         on 2017/12/28.
 */

public class App extends Application {
    private DaoSession daoSession;
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initGreenDao();
    }

    /**
     * 初始化 greenDao
     */
    private void initGreenDao() {
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "FDM.db");
//        SQLiteDatabase database = helper.getWritableDatabase();
//        DaoMaster daoMaster = new DaoMaster(database);
//        daoSession = daoMaster.newSession();

        /**
         *  if you want see the log info,default is false
         */
        MigrationHelper.DEBUG = true;
        CusSQLiteOpenHelper helper = new CusSQLiteOpenHelper(this, "FDM.db", null);
        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());
        daoSession = daoMaster.newSession();
    }

    /**
     * 获取 DaoSession
     *
     * @return DaoSession
     */
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
