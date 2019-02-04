package com.example.coc_project;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        Button luck = (Button) findViewById(R.id.luck);
        Button depression = (Button) findViewById(R.id.depression);
        Button diet = (Button) findViewById(R.id.diet);
        Button love = (Button) findViewById(R.id.love);
        Button color = (Button) findViewById(R.id.color);

        luck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://search.naver.com/search.naver?where=nexearch&query=%EC%98%A4%EB%8A%98%EC%9D%98%EC%9A%B4%EC%84%B8&sm=top_sug.pre&fbm=1&acr=1&acq=%EC%9A%B4&qdt=0&ie=utf8"));
                startActivity(browserIntent);
            }
        });
        depression.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "http://self-test.info/dep/"));
                startActivity(browserIntent);
            }
        });
        diet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "http://datanara.net/test1/"));
                startActivity(browserIntent);
            }
        });
        love.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "http://datanara.net/test4/"));
                startActivity(browserIntent);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "http://datanara.net/test5/"));
                startActivity(browserIntent);
            }
        });
    }
}

