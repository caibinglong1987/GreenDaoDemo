package com.hexing.fdmdemo.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author by HEC271 on 2017/12/28.
 */
@Entity
public class DBTest {
    private String title;
    private String context;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;
    @Generated(hash = 377379467)
    public DBTest(String title, String context, String desc) {
        this.title = title;
        this.context = context;
        this.desc = desc;
    }

    @Generated(hash = 2069100866)
    public DBTest() {
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContext() {
        return this.context;
    }
    public void setContext(String context) {
        this.context = context;
    }
}
