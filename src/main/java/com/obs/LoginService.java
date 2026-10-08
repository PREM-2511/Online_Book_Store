package com.obs;

public class LoginService {

    public boolean isValidLogin(String username, String password) {
        return username != null
                && !username.isBlank()
                && password != null
                && !password.isBlank();
    }
}