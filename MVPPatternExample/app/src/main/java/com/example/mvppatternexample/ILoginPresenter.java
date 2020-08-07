package com.example.mvppatternexample;

public interface ILoginPresenter {
    public void doLogin(String username, String password);
    public void setProgressBarVisibility(int visibility);
}
