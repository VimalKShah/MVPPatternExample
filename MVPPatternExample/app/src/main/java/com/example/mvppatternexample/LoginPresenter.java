package com.example.mvppatternexample;

public class LoginPresenter implements ILoginPresenter {
    private ILoginResult iLoginResult;
    private IUser iUser;

    public LoginPresenter(ILoginResult iLoginResult) {
        this.iLoginResult = iLoginResult;
    }

    @Override
    public void doLogin(String username, String password) {
        iUser = new UserModel(username, password);
        iLoginResult.loginResult(iUser.checkValidity());
    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        iLoginResult.setProgressBarVisibility(visibility);
    }
}
