package com.example.pawel.myapplication.moto;

import android.provider.Settings;
import android.support.test.InstrumentationRegistry;

public class Util {
    //Implementation based on http://android-developers.blogspot.mx/2011/03/identifying-app-installations.html
    //and http://stackoverflow.com/a/16778740
    public static String getUniqDeviceID() {
        return Settings.Secure.getString(InstrumentationRegistry.getTargetContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }
}
