package com.example.traffic8_29.Utils;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Administrator on 2017/8/31.
 */

public class SpUtils {
    public static void putValues(Context context, String key, Object values) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        if (values instanceof Boolean) {
            edit.putBoolean(key, (Boolean) values);
        } else if (values instanceof  String) {
            edit.putString(key, (String) values);
        } else if (values instanceof  Integer) {
            edit.putInt(key, (Integer) values);
        } else if (values instanceof Float) {
            edit.putFloat(key, (Float) values);
        } else if (values instanceof  Long) {
            edit.putLong(key, (Long) values);
        }
        edit.commit();
    }

    public static Object getValues(Context context,String key,Object values) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        if (values instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) values);
        } else if (values instanceof  String) {
            return sp.getString(key, (String) values);
        } else if (values instanceof  Integer) {
            return sp.getInt(key, (Integer) values);
        } else if (values instanceof Float) {
            return sp.getFloat(key, (Float) values);
        } else if (values instanceof Long) {
            return sp.getLong(key, (Long) values);
        } else {
            return null;
        }
    }
}
