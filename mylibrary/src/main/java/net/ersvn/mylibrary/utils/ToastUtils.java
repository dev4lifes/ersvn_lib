package net.ersvn.mylibrary.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public static void showLong(Context context, String messagge){
        Toast.makeText(context,messagge,Toast.LENGTH_LONG).show();
    }
    public static void showShort(Context context, String messagge){
        Toast.makeText(context,messagge,Toast.LENGTH_SHORT).show();
    }
}
