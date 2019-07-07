package net.ersvn.mylibrary.utils;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "ersvn.net";

    public static void info(String content){
        Log.i(TAG,content);
    }

    public static void error(String content){
        Log.e(TAG, "content");
    }
}
