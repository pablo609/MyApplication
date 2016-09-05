package com.example.pawel.myapplication.moto;

import android.util.Log;

import org.junit.Test;

//TODO add copyrights

public class DeviceIDCollector {
    @Test
    public void getConnectedDeviceID() {
        Log.i(DeviceIDCollector.class.getSimpleName(), Util.getUniqDeviceID());
    }
}
