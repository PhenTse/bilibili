package com.meng.bilibili.lib;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {

    private static SharedPreferences sp;
    private static SharedPreferences.Editor editor;
    private Context context;

    public SharedPreferenceHelper(Context c, String name) {
        context = c;
        sp = context.getSharedPreferences("mainPreference", 0);
        editor = sp.edit();
    }

    public static boolean getBoolean(String key) {
        return sp.getBoolean(key, false);
    }

    public static boolean getBoolean(String key, boolean p1) {
        return sp.getBoolean(key, p1);
    }

    public static void putBoolean(String key, Boolean value) {
        editor = sp.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static String getString(String key) {
        return sp.getString(key, null);
    }

    public static String getString(String key, String defaultValue) {
        return sp.getString(key, defaultValue);
    }

    public static void putString(String key, String value) {
        editor = sp.edit();
        editor.putString(key, value);
        editor.apply();
    }
}
