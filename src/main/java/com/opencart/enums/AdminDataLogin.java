package com.opencart.enums;

public enum AdminDataLogin {

    ADMIN("admin","admin");

    private String password;
    private String login;
    private AdminDataLogin(String login,String password) {
        this.password = password;
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public String getLogin()
    {
        return login;
    }

}
