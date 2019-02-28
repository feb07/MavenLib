package com.feb.mavenfirstlib;

import android.text.TextUtils;

/**
 * Created by lilichun on 2019/2/28.
 */
public class StringUtil {
    private static StringUtil _instance;

    public synchronized static StringUtil getInstance() {
        if (_instance == null) {
            _instance = new StringUtil();
        }
        return _instance;
    }

    public boolean isEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }
}
