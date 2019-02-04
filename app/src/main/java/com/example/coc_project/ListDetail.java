package com.example.coc_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 게시판 리스트 클릭시 해당 내용이 들어있는 파일.java
 * Addapter로 값 입력 후 Intent를 이용하여 값을 불러온다.
 */

public class ListDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_detail);

        TextView tvTitle = (TextView)findViewById(R.id.textView1);
        TextView tvdate = (TextView)findViewById(R.id.textView2);
        TextView tvuser = (TextView)findViewById(R.id.textView3);
        TextView tvtext = (TextView)findViewById(R.id.textView4);
        ImageView iv = (ImageView)findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView)findViewById(R.id.imageView2);
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER); // 레이아웃 크기에 이미지를 맞춘다.
        iv2.setScaleType(ImageView.ScaleType.FIT_CENTER); // 레이아웃 크기에 이미지를 맞춘

        Intent intent = getIntent(); // 보내온 Intent를 얻는다
        tvTitle.setText(intent.getStringExtra("title"));
        tvdate.setText(intent.getStringExtra("date"));
        tvuser.setText(intent.getStringExtra("user"));
        tvtext.setText(intent.getStringExtra("text"));
        iv.setImageResource(intent.getIntExtra("img", 0));
    } // end of onCreate
} // end of class