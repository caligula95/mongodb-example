package com.example.mongodb_example;

public class UserRole {

    private String name;

    private String privilege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "name='" + name + '\'' +
                ", privilege='" + privilege + '\'' +
                '}';
    }
}
