package com.kodluyoruz.collections;

public class User {
    private final int userId;
    private final String userName;
//    private final String password;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
