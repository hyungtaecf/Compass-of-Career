package com.example.coc_project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by MinJungKim on 2016-12-10.
 */

public class preddy_test3 extends AppCompatActivity {

    ArrayList<PrQ> alPr = new ArrayList<PrQ>();  // 문의사항 정보를 담을 배열 선언
    public static ArrayList<Activity> actList = new ArrayList<Activity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preddy_test3);


        // add 제목, 이미지, 작성 날짜, 작성자, 내용
        alPr.add(new PrQ("1. 교육가",R.drawable.preddy_result,R.drawable.st_line2,
                "1. 사람관계 중시, 공감과 소통능력\n" +
                        "2. 정서가 풍부하며, 마음이 따뜻함\n" +
                        "3. 비분석적이며, 세부적 사항에 약함\n" +
                        "4. 활동적이고, 유쾌한 성격 (외로움) \n" +
                        "5. 실속을 챙기지 못하고, 말이 길다. 타인에게 인정받고 싶어함이 강함 \n" +
                        "6. 꼼꼼하게 따지는 사람에게 부담감, 기분파일 경우가 많다"));
        alPr.add(new PrQ("2. 연구가",R.drawable.preddy_result2,R.drawable.st_line2,
                "1. 흥미를 가지는 분야에 오랫동안 종사, 데이터(기술)축적, 특정분야의 전문가로 인정 \n" +
                        "2. 책임감, 신중, 사무능력, 계산능력. \n" +
                        "3. 고집이 세고 믿음 중시, 변화를 싫어함. \n" +
                        "4. 허세보다는 검증된 부분을 신뢰. \n" +
                        "5. 거짓말 하는 것을 싫어하며, 말이 짧다. \n" +
                        "6. 감정표현이 서툴고, 깔끔, 정리정돈. "));
        alPr.add(new PrQ("3. 현장가",R.drawable.preddy_result3,R.drawable.st_line2,
                "1. 현장에서 사람과 함께 하는 것을 좋아함.\n" +
                        "2. 모임을 주도하고, 타고난 중재자 역할.\n" +
                        "4. 빨간색 많을 경우 - 작업, 수리, 현장감독.\n" +
                        "3. 노란색이 많을 경우 - 판매, 영업, 서비스 .\n" +
                        "5. 일 처리가 뛰어나고, 겸손하여 자신의 능력을 외부로 나타내는걸 꺼려함. \n" +
                        "6. 주어진 일을 묵묵히 성실하게 수행함.\n" +
                        "7. 활동적이며, 에너지가 넘침."));
        alPr.add(new PrQ("4. 기획가",R.drawable.preddy_result4,R.drawable.st_line2,
                "1. 아이디어 풍부, 독창적, 자기주관 뚜렷.  \n" +
                        "2. 논리적, 분석적이며, 지적 호기심 강함.  \n" +
                        "3. 스스로 모든 것을 책임지는 유형, 계획성.  \n" +
                        "4. 감정표현 보다는 숙고하는 스타일.  \n" +
                        "5. 깊이 생각하는 힘이 있다.   \n" +
                        "6. 목표를 정하면 끝까지 연구하는 유형\n"));
        alPr.add(new PrQ("5. 탐구가",R.drawable.preddy_result9,R.drawable.st_line2,
                "1. 조용하고, 논리적, 분석적, 자기주관 뚜렷.\n" +
                        "2. 특정 분야의 전문가 유형. \n" +
                        "3. 장인기질이 뛰어나 손재주가 좋다.\n" +
                        "4. 명장, 기술자 유형이 많다. \n" +
                        "5. 상상력과 공학적 사고의 결합\n" +
                        "6. 물건을 만들어 낸다는 것의 정석"));
        alPr.add(new PrQ("6. 사업가/행정가",R.drawable.preddy_result10,R.drawable.st_line2,
                "1. 적극적, 정확, 세밀, 계획성, 조심성. \n" +
                        "2. 행정능력이 뛰어나고, 완벽주의 성향\n" +
                        "3. 신념이 강하고, 자기개발에 노력 \n" +
                        "4. 책임감이 강하고, 솔선수범하는 유형. \n" +
                        "5. 자료(data)가 더 많을 경우 행정가 형으로 봄\n" +
                        "6. 사무능력과 계산능력이 뛰어난 특징.  "));
        alPr.add(new PrQ("7. 기술자",R.drawable.preddy_result5,R.drawable.st_line2,
                "사물(things)에 치우친 사람\n" +
                "1. 실용적임\n" +
                "2. 몸을 움직이길 좋아함, 경험을 통해 배우며, 문제 해결이나 관리를 선호\n" +
                "3. 현장성, 사물, 도구 사용"));
        alPr.add(new PrQ("8. 복지사",R.drawable.preddy_result6,R.drawable.st_line2,
                "사람(people)에 치우친 사람\n" +
                "1. 여러 사람들과 어울리는 것을 선호\n" +
                "2. 상대방의 입장에서 생각, 배려를 잘 함\n" +
                "3. 관리보다 지원에 강함"));
        alPr.add(new PrQ("9. 관리자",R.drawable.preddy_result7,R.drawable.st_line2,
                "자료(data)에 치우친 사람\n" +
                "1. 정확하고 세밀함\n" +
                "2. 책임감이 있고, 조심성 있음\n" +
                "3. 빈틈이 없고, 계획성 있음\n" +
                "4. 변화를 좋아하지 않음\n" +
                "5. 사무능력, 계산능력"));
        alPr.add(new PrQ("10. 평론가",R.drawable.preddy_result8,R.drawable.st_line2,
                "사고(idea)에 치우친 사람\n" +
                "1. 생각하는 것을 즐김\n" +
                "2. 상상력 풍부, 감수성 뛰어남\n" +
                "3. 자유분방하여 틀에 고정되어 있기를 원하지 않음\n" +
                "4. 예술적, 창의적 소질"));



        PrAdapter pradapter = new PrAdapter(
                getApplicationContext(), // 현재화면의 제어권자
                R.layout.preddy_detail,  // 리스트뷰의 한행의 레이아웃
                alPr);         // 데이터

        ListView lv = (ListView)findViewById(R.id.listView1);
        lv.setAdapter(pradapter);

        TextView result1 = (TextView)findViewById(R.id.result1);
        TextView result2 = (TextView)findViewById(R.id.result2);
        Button return_main3 = (Button) findViewById(R.id.return_main3);
        Intent intent = getIntent(); // 보내온 Intent를 얻는다

        int mdata = intent.getIntExtra("data",256);
        int midea = intent.getIntExtra("idea",256);
        int mpeople = intent.getIntExtra("people",256);
        int mthings = intent.getIntExtra("things",256);
        result1.setText("선택 유형  "+"사물: "+mthings+"  사람: "+mpeople+"  사고: "+midea+"  자료: "+mdata);
        result2.setText("유형 검색- 본인이 많이 나온 유형으로 보시면 됩니다.\n"+"ex)사물 4, 사람 1, 사고 2, 자료 2 = 사물 유형(7)\n"
                +"ex)사물 2, 사람 1, 사고 3, 자료 3 = 사고,자료 유형(2)");

        return_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //버튼 클릭시 이전 액티비티 종료 하고 start_screen으로 이동!
                for(int i = 0; i < actList.size(); i++)
                    actList.get(i).finish();
                Intent intent = new Intent(getApplicationContext(), start_screen.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();

            }
        });

        /*Toast.makeText(
                preddy_test3.this,"자료 = " + mdata, Toast.LENGTH_LONG).show();*/


    }
}

class PrAdapter extends BaseAdapter { // 리스트 뷰의 어댑터
    Context context;
    int layout;
    ArrayList<PrQ> alPr;
    LayoutInflater inf;
    public PrAdapter(Context context, int layout, ArrayList<PrQ> alPr) {
        this.context = context;
        this.layout = layout;
        this.alPr = alPr;
        inf = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return alPr.size();
    }
    @Override
    public Object getItem(int position) {
        return alPr.get(position);
    }
    @Override
    public long getItemId(int position) {return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView iv = (ImageView)convertView.findViewById(R.id.imageView);
        ImageView iv2 = (ImageView)convertView.findViewById(R.id.imageView3);
        iv.setScaleType(ImageView.ScaleType.FIT_START); // 레이아웃 크기에 이미지를 맞춘
        TextView tvtype = (TextView)convertView.findViewById(R.id.type);
        TextView tvtext = (TextView)convertView.findViewById(R.id.text);


        PrQ m = alPr.get(position);
        iv.setImageResource(m.img);
        iv2.setImageResource(m.img2);
        tvtype.setText(m.type);
        tvtext.setText(m.text);

        return convertView;
    }
}

class PrQ { // 자바빈
    String type = ""; // 타입
    int img; // 이미지
    int img2; // 이미지
    String text = ""; // text

    public PrQ(String type, int img, int img2, String text) {
        super();
        this.type = type; //글 제목
        this.img = img; //이미지
        this.img2 = img2;
        this.text = text; //내용
    }
    public PrQ() {}
}





