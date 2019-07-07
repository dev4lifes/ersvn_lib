package net.ersvn.mylibrary.utils;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarUtils {

    public static void showLongWithOnlyText(View view, String message){
        Snackbar.make(view,message,Snackbar.LENGTH_LONG).show();
    }

    public static void showShortWithOnlyText(View view, String message){
        Snackbar.make(view,message,Snackbar.LENGTH_SHORT).show();
    }

    /**
     *
     * @param view
     * @param message content show to user on snackbar
     * @param btnName text on button on snackbar
     * @param mListenner object of OnSnackbarListenner interface
     */
    public static void showLongWithButton(View view, String message, String btnName, final OnSnackBarListener mListenner){
        Snackbar.make(view,message,Snackbar.LENGTH_SHORT).setAction(btnName, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListenner.onButtonListenner();
            }
        });
    }
    public interface OnSnackBarListener{
        void onButtonListenner();
    }
}
