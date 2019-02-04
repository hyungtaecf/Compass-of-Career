package com.example.coc_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 직업 상담 게시판.java
 * 연결 xml - preddy_test.xml, preddy_test2.xml
 */

public class Carrer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrer);

        Button button = (Button) findViewById(R.id.button); //프레디저 검사

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), preddy_test.class);
                startActivity(intent);
            }
        });

    }
}