package com.UrlHitApp.model;

public class Url {

    public int count;
    public String userName;

    public Url() {
    }

    public Url(int count, String userName) {
        this.count = count;
        this.userName = userName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Url{" +
                "count=" + count +
                ", userName='" + userName + '\'' +
                '}';
    }
}
