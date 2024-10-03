package com.codegym.entity;

public class Employee extends Account{
    public Employee() {
    }

    public Employee(String username, String password) {
       this.username = username;
       this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                "} ";
    }
}
