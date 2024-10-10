package com.codegym.entity;

public class Account {
    private String idAccount;
    private String name;
    private String username;
    private String password;
    private String role;
    private boolean status;

    public Account() {
    }

    public Account(String id, String name, String username, String password, String role, boolean status) {
        this.idAccount = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getId() {
        return idAccount;
    }

    public void setId(String id) {
        this.idAccount = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
