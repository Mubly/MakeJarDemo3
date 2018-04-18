package com.mayi.makejardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mayi.mylibrary.ToolUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToolUtils.setText((TextView) findViewById(R.id.hellow),"嘿嘿！很happy");
    }
}
