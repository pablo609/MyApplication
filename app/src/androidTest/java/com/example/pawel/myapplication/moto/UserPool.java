package com.example.pawel.myapplication.moto;

//TODO add copyrights

import java.util.HashMap;

public class UserPool {
    private static final String SAMSUNGID = "1234";
    private static final String HTCID = "1234";
    private static String currentDeviceID = null;

    private static HashMap<String, User> userToDeviceMap = new HashMap<String, User>();
    static {
        //Default user if Device ID not provided
        userToDeviceMap.put(null, new User("USER1", "DEVICE1"));
        userToDeviceMap.put(SAMSUNGID, new User("USER1", "DEVICE1"));
        userToDeviceMap.put(HTCID, new User("USER2", "DEVICE2"));
    }

    public static User getUser() {
        if(currentDeviceID == null) {
            currentDeviceID = Util.getUniqDeviceID();
        }
        return userToDeviceMap.get(currentDeviceID);
    }
}
