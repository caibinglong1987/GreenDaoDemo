package com.hexing.fdmdemo.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by HEC271 on 2017/12/28.
 * @author long
 */

@Entity
public class UserInfo {

    @Id
    private long id;

    private String name;

    private int age;

    @Generated(hash = 1646886455)
    public UserInfo(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Generated(hash = 1279772520)
    public UserInfo() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}