package com.example.pawel.myapplication.moto;

//TODO add copyrights

public class User {
    private String name;
    private String assignedDeviceName;

    public User(String name, String assignedDeviceName) {
        this.name = name;
        this.assignedDeviceName = assignedDeviceName;
    }

    public String getName() {
        return name;
    }

    public String getAssignedDeviceName() {
        return assignedDeviceName;
    }
}
