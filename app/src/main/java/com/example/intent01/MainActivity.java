package com.example.intent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnStart_1,btnStart_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart_1=findViewById(R.id.btnStartActivity_1);
        btnStart_2=findViewById(R.id.btnStartActivity_2);

        //因為只使用一次，故採匿名
        btnStart_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Activity_Main_2.class);
                startActivity(i);
            }
        });
        btnStart_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent i= 新的畫面(本活動畫面.this,指定呼叫活動畫面.class)
                Intent i = new Intent(MainActivity.this,Activity_Main_3.class);
                //啟動intent
                startActivity(i);
            }
        });
    }

}