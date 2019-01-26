package com.example.coc_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 문의 사항 게시판.java
 * 연결 xml - inquiry.xml, row.xml, list_detail.xml
 */


public class Inquiry extends AppCompatActivity {
    ArrayList<InQ> al = new ArrayList<InQ>();  // 문의사항 정보를 담을 배열 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inquiry);

        // add 제목, 이미지, 작성 날짜, 작성자, 내용
        al.add(new InQ("상담 관련 센터 문의",R.drawable.inquiry_img4,"16/12/08","MJ","안녕하세요 문의드립니다."));
        al.add(new InQ("상담을 받고 싶어요",R.drawable.inquiry_img3,"16/12/09","HE","안녕하세요 " +
                "상담을 받고 싶습니다."));
        al.add(new InQ("어플 버그&오류",R.drawable.inquiry_img2,"16/12/10","운영자","이 어플은 진로 검사 및 간단한 테스트를 할 수 있는 어플입니다.\n"
                +"버그나 오류 발견 시 문의사항에 등록해주시길 바랍니다."));
        al.add(new InQ("문의 드립니다.",R.drawable.inquiry_img,"16/12/12","guest1","제가 졸업반인데 아직도 취업을 어디로 할지 정하질 못했어요\n"
                +"어떻게 해야 할지 모르겠어서 상담 문의 드립니다."));



        MyAdapter adapter = new MyAdapter(
                getApplicationContext(), // 현재화면의 제어권자
                R.layout.row,  // 리스트뷰의 한행의 레이아웃
                al);         // 데이터

        ListView lv = (ListView)findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // 상세정보 화면으로 이동하기(인텐트 날리기)
                // 1. 다음화면을 만든다
                // 2. AndroidManifest.xml 에 화면을 등록한다
                // 3. Intent 객체를 생성하여 날린다
                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        ListDetail.class); // 다음넘어갈 화면

                // intent 객체에 데이터를 실어서 보내기
                // 리스트뷰 클릭시 인텐트 (Intent) 생성하고 position 값을 이용하여 인텐트로 넘길값들을 넘긴다
                intent.putExtra("title", al.get(position).title);
                intent.putExtra("img", al.get(position).img);
                intent.putExtra("date", al.get(position).date);
                intent.putExtra("user", al.get(position).user);
                intent.putExtra("text", al.get(position).text);

                startActivity(intent);
            }
        });
    } // end of onCreate
} // end of class

class MyAdapter extends BaseAdapter { // 리스트 뷰의 어댑터
    Context context;
    int layout;
    ArrayList<InQ> al;
    LayoutInflater inf;
    public MyAdapter(Context context, int layout, ArrayList<InQ> al) {
        this.context = context;
        this.layout = layout;
        this.al = al;
        inf = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return al.size();
    }
    @Override
    public Object getItem(int position) {
        return al.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView iv = (ImageView)convertView.findViewById(R.id.imageView1);
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER); // 레이아웃 크기에 이미지를 맞춘
        TextView tvName = (TextView)convertView.findViewById(R.id.textView1);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.textView2);
        TextView tvuser = (TextView)convertView.findViewById(R.id.textView3);


        InQ m = al.get(position);
        iv.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.date);
        tvuser.setText(m.user);

        return convertView;
    }
}

class InQ { // 자바빈
    String title = ""; // 글 제목 title
    int img; // 이미지
    String date = ""; // 날짜
    String user = ""; // user
    String text = ""; // text

    public InQ(String title, int img, String date, String user, String text) {
        super();
        this.title = title; //글 제목
        this.img = img; //이미지
        this.date = date; //날짜
        this.user = user; //작성자
        this.text = text; //내용
    }
    public InQ() {}
}
