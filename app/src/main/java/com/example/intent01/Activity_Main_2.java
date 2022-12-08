package com.example.intent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Main_2 extends AppCompatActivity {
    Button btnStart_1,btnStart_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        btnStart_1=findViewById(R.id.btnStartActivity_1);
        btnStart_2=findViewById(R.id.btnStartActivity_2);

        //關閉第二個活動按鈕會回到主畫面
        btnStart_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //使用finish()即可關閉當前畫面
                finish();
            }
        });
        //點開啟第三個畫面按鈕會進入第三個畫面
        btnStart_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Activity_Main_2.this,Activity_Main_3.class);
                startActivity(i);
            }
        });
    }
}