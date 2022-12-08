package com.example.intent01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Main_3 extends AppCompatActivity {
    Button btnStart_1,btnStart_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        btnStart_1=findViewById(R.id.btnStartActivity_1);
        btnStart_2=findViewById(R.id.btnStartActivity_2);

        btnStart_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //點擊關閉第三個活動按鈕會回到第二個活動頁面
                //finish()只能轉跳到前一個畫面，
                //
                //
                finish();
            }
        });
        //第二顆按鈕是啟動第二個畫面
        btnStart_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Activity_Main_3.this,Activity_Main_2.class);
                startActivity(i);
            }
        });

    }
}