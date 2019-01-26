package com.example.coc_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * C.O.C project 메인 화면.java
 * 연결 xml - carrer.xml, notice.xml, test.xml, messageBoard.xml, appInfo.xml, inquiry.xml
 */
public class start_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button btn1 = (Button) findViewById(R.id.btn1); //진로상담
        Button btn2 = (Button) findViewById(R.id.btn2); //공지사항
        Button btn3 = (Button) findViewById(R.id.btn3); //간단 테스트
        Button btn4 = (Button) findViewById(R.id.btn4); //한줄 게시판
        Button btn5 = (Button) findViewById(R.id.btn5); //app정보
        Button btn6 = (Button) findViewById(R.id.btn6); //관심글
        Button btn7 = (Button) findViewById(R.id.btn7); //문의사항

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Carrer.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Notice.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Test.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MessageBoard.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AppInfo.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Attention.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Inquiry.class);
                startActivity(intent);
            }
        });

    }

}

