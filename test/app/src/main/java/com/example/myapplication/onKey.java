package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class onKey extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_A) {
            // 用户按下了字母 'A' 键
            Toast.makeText(this, "A key pressed", Toast.LENGTH_SHORT).show();
            return true;  // 返回 true 表示事件已经处理
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_A) {
            // 用户松开了字母 'A' 键
            Toast.makeText(this, "A key released", Toast.LENGTH_SHORT).show();
            return true;  // 返回 true 表示事件已经处理
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_A) {
            // 用户长按字母 'A' 键
            Toast.makeText(this, "A key long pressed", Toast.LENGTH_SHORT).show();
            return true;  // 返回 true 表示事件已经处理
        }
        return super.onKeyLongPress(keyCode, event);
    }
}
