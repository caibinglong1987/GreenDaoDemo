package com.hexing.fdmdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.hexing.fdmdemo.app.App;
import com.hexing.fdmdemo.db.DBTest;
import com.hexing.fdmdemo.db.DBTestDao;
import com.hexing.fdmdemo.db.UserInfo;
import com.hexing.fdmdemo.db.UserInfoDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                addDBTest();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addDBTest(){
       DBTestDao dbTestDao = App.getInstance().getDaoSession().getDBTestDao();
        DBTest dbTest = new DBTest("11","测试","333");
        dbTestDao.insert(dbTest);

        dbTest = new DBTest("22","测试","");
        dbTestDao.insert(dbTest);

        dbTest = new DBTest("33","测试","");
        dbTestDao.insert(dbTest);
    }

    private void getUserInfo() {
        UserInfoDao dao = App.getInstance().getDaoSession().getUserInfoDao();
        List<UserInfo> userInfoList = dao.loadAll();
    }
}
