package com.example.apple.buglydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author crazyZhangxl on 2018-12-13 19:58:47.
 * Describe:
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BuglyHelper.getInstance().doUpdateNow(this);
    }
}
