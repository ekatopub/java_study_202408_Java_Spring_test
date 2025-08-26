package com.example.demo.model;

public class LoginModel {
    // ログイン画面のバリデーションは、SpringSecurityにより実装。
    // ID・パスワード不一致時は、messages.propertiesの
    // AbstractUserDetailsAuthenticationProvider.badCredentialsで定義したメッセージを出力

    private String userId;
    private String password;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return this.userId;
    }
    public String getPassword() {
        return this.password;
    }
}