package com.example.barffood;

import android.content.Context;
import android.content.SharedPreferences;

public final class SaveLoadValues {

    static void saveSettings( Context context, String key, int value){
        SharedPreferences settings = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    static int loadSettings( Context context, String key){
        SharedPreferences settings = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
        return settings.getInt(key, 0);
    }
}
