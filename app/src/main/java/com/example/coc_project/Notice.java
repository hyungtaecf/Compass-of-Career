package com.example.coc_project;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
 * 공지사항 게시판.java
 * 연결 xml - notice.xml, row.xml, list_detail.xml
 */

public class Notice extends AppCompatActivity {
    ArrayList<NoQ> alNo = new ArrayList<NoQ>();  // 문의사항 정보를 담을 배열 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);

        // add 제목, 이미지, 작성 날짜, 작성자, 내용
        alNo.add(new NoQ("직업 심리검사 사이트 안내",R.drawable.notice_img2_2,"16/12/09","MK","워크넷\n" + "http://www.work.go.kr/consltJobCarpa/jobPsyExam/jobPsyExamIntro.do"));
        alNo.add(new NoQ("심리검사 사이트 안내",R.drawable.notice_img_2,"16/12/08","MJ","커리어넷(교육부)\n"+ "http://www.career.go.kr/cnet/front/examen/inspctMain.do\n\n"+"진로 상담\n"+"http://www.work.go.kr/consltJobCarpa/jobConslt/jobConsltList.do"));
        alNo.add(new NoQ("심리상담센터",R.drawable.notice_img3_2,"16/12/09","HE","늘푸른심리상담센터\n"+"www.evergreen2002.or.kr\n\n"
                +"어세스타 온라인심리검사센터\n"+"www.career4u.net\n\n"));
        alNo.add(new NoQ("센터 전화번호",R.drawable.notice_img4_2,"16/12/09","MIN","여성인력개발센터\n"+"02-318-5880, 6294\n\n"
                +"고용노동부\n"+"1350\n\n"
                +"늘푸른심리상담센터\n"+"031.718.7500\n\n"
                +"어세스타 온라인심리검사센터\n"+"02-787-1400\n\n"));
        alNo.add(new NoQ("공채 소식 알림",R.drawable.notice_img5_2,"16/12/11","KY","잡코리아\n"+"http://www.jobkorea.co.kr/Starter/Live/?schCtgr="));
        alNo.add(new NoQ("공채 달력",R.drawable.notice_img6_2,"16/12/11","HT","공채 달력\n"+"http://www.jobkorea.co.kr/starter/calendar/ "));
        alNo.add(new NoQ("공채 사이트",R.drawable.notice_img7_2,"16/12/11","YH","공채 사이트\n"+"http://www.saramin.co.kr/zf_user/"));
        alNo.add(new NoQ("대학 알리미",R.drawable.notice_img8_2,"16/12/12","HJ","대학 알리미\n"+"http://www.academyinfo.go.kr/\n\n"
                +"대입정보포털\n"+"http://www.adiga.kr/EgovPageLink.do?link=EipMain\n\n"
                +"전문대학포털\n"+"http://www.procollege.kr/web/main/index.do\n\n"));
        alNo.add(new NoQ("아르바이트 사이트",R.drawable.notice_img9_2,"16/12/13","GJ","알바몬\n"+"www.albamon.com\n\n"
                +"알바천국\n"+"www.alba.co.kr\n\n"));



        NoAdapter noAdapter = new NoAdapter(
                getApplicationContext(), // 현재화면의 제어권자
                R.layout.row,  // 리스트뷰의 한행의 레이아웃
                alNo);         // 데이터

        ListView lv = (ListView)findViewById(R.id.listView1);
        lv.setAdapter(noAdapter);

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
                intent.putExtra("title", alNo.get(position).title);
                intent.putExtra("img", alNo.get(position).img);
                intent.putExtra("date", alNo.get(position).date);
                intent.putExtra("user", alNo.get(position).user);
                intent.putExtra("text", alNo.get(position).text);

                startActivity(intent);
            }
        });
    } // end of onCreate
} // end of class

class NoAdapter extends BaseAdapter { // 리스트 뷰의 어댑터
    Context context;
    int layout;
    ArrayList<NoQ> alNo;
    LayoutInflater inf;
    public NoAdapter(Context context, int layout, ArrayList<NoQ> alNo) {
        this.context = context;
        this.layout = layout;
        this.alNo = alNo;
        inf = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return alNo.size();
    }
    @Override
    public Object getItem(int position) {
        return alNo.get(position);
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


        NoQ m = alNo.get(position);
        iv.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.date);
        tvuser.setText(m.user);

        return convertView;
    }
}

class NoQ { // 자바빈
    String title = ""; // 글 제목 title
    int img; // 이미지
    String date = ""; // 날짜
    String user = ""; // user
    String text = ""; // text

    public NoQ(String title, int img, String date, String user, String text) {
        super();
        this.title = title; //글 제목
        this.img = img; //이미지
        this.date = date; //날짜
        this.user = user; //작성자
        this.text = text; //내용
    }
    public NoQ() {}
}
