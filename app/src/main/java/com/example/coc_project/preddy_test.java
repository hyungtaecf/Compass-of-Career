package com.example.coc_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 프레디저 검사 설명 화면.java
 * 연결 xml - preddy_test2.xml
 */

public class preddy_test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preddy_test);

        Button Start = (Button) findViewById(R.id.Start); //프레디저 검사

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), preddy_test2.class);
                startActivity(intent);
            }
        });

    }

}
