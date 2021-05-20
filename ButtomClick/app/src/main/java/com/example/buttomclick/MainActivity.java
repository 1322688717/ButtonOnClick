package com.example.buttomclick;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myclick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                Toast.makeText(getApplicationContext(),"第一个按钮", Toast.LENGTH_LONG).show();
                Log.e("TAG","你点击了第一个按钮");
                break;
            case R.id.btn_two:
                Log.e("TAG","你点击了第二个按钮");
                Toast.makeText(MainActivity.this,"你点击了第二个按钮", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_three:
                Log.e("TAG","你点击了第三个按钮");
                Toast.makeText(this,"你点击了第三个按钮", Toast.LENGTH_SHORT).show();
                break;
        }
     }
 }