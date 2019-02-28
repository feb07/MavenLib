package com.feb.mavenlib;

import android.app.Activity;
import android.widget.Toast;

import com.feb.mavenfirstlib.StringUtil;

/**
 * Created by lilichun on 2019/2/28.
 */
public class TestClass extends Activity {
    public void test(String str) {
        boolean testResult = StringUtil.getInstance().isEmpty(str);
        Toast.makeText(TestClass.this, "测试maven引用成功", Toast.LENGTH_SHORT).show();
    }
}
