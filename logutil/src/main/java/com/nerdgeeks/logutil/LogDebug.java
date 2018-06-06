package com.nerdgeeks.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "Library Testing";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
