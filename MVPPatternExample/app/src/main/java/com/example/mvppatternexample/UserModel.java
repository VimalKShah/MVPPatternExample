package com.example.mvppatternexample;

public class UserModel implements IUser {

    private String username;
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean checkValidity() {
        return !this.username.isEmpty() && !this.password.isEmpty();
    }
}
