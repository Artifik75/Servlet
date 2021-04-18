package com.company.controller;

import com.company.type.Rola;

public class User {
    private String login;
    private String password;
    private Rola rola;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.rola = Rola.USER;
    }

    public User(String login, String password, Rola rola) {
        this.login = login;
        this.password = password;
        this.rola = rola;
    }




}
