package com.example.coc_project;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * 프레디저 체크박스 화면.java
 * 연결 xml -
 */
public class preddy_test2 extends AppCompatActivity {

    public static ArrayList<Activity> actList = new ArrayList<Activity>();

    protected void onCreate(Bundle savedInstanceState) {
        actList.add(this); // actList에 B를 추가해줍니다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preddy_test2);

        final CheckBox cbthings1 = (CheckBox) findViewById(R.id.things1);
        final CheckBox cbdata1 = (CheckBox) findViewById(R.id.data1);
        final CheckBox cbpeople1 = (CheckBox) findViewById(R.id.people1);
        final CheckBox cbidea1 = (CheckBox) findViewById(R.id.idea1);

        final CheckBox cbthings2 = (CheckBox) findViewById(R.id.things2);
        final CheckBox cbdata2 = (CheckBox) findViewById(R.id.data2);
        final CheckBox cbpeople2 = (CheckBox) findViewById(R.id.people2);
        final CheckBox cbidea2 = (CheckBox) findViewById(R.id.idea2);

        final CheckBox cbthings3 = (CheckBox) findViewById(R.id.things3);
        final CheckBox cbdata3 = (CheckBox) findViewById(R.id.data3);
        final CheckBox cbpeople3 = (CheckBox) findViewById(R.id.people3);
        final CheckBox cbidea3 = (CheckBox) findViewById(R.id.idea3);

        final CheckBox cbthings4 = (CheckBox) findViewById(R.id.things4);
        final CheckBox cbdata4 = (CheckBox) findViewById(R.id.data4);
        final CheckBox cbpeople4 = (CheckBox) findViewById(R.id.people4);
        final CheckBox cbidea4 = (CheckBox) findViewById(R.id.idea4);

        final CheckBox cbthings5 = (CheckBox) findViewById(R.id.things5);
        final CheckBox cbdata5 = (CheckBox) findViewById(R.id.data5);
        final CheckBox cbpeople5 = (CheckBox) findViewById(R.id.people5);
        final CheckBox cbidea5 = (CheckBox) findViewById(R.id.idea5);

        final CheckBox cbthings6 = (CheckBox) findViewById(R.id.things6);
        final CheckBox cbdata6 = (CheckBox) findViewById(R.id.data6);
        final CheckBox cbpeople6 = (CheckBox) findViewById(R.id.people6);
        final CheckBox cbidea6 = (CheckBox) findViewById(R.id.idea6);

        final CheckBox cbthings7 = (CheckBox) findViewById(R.id.things7);
        final CheckBox cbdata7 = (CheckBox) findViewById(R.id.data7);
        final CheckBox cbpeople7 = (CheckBox) findViewById(R.id.people7);
        final CheckBox cbidea7 = (CheckBox) findViewById(R.id.idea7);

        final CheckBox cbthings8 = (CheckBox) findViewById(R.id.things8);
        final CheckBox cbdata8 = (CheckBox) findViewById(R.id.data8);
        final CheckBox cbpeople8 = (CheckBox) findViewById(R.id.people8);
        final CheckBox cbidea8 = (CheckBox) findViewById(R.id.idea8);

        final CheckBox cbthings9 = (CheckBox) findViewById(R.id.things9);
        final CheckBox cbdata9 = (CheckBox) findViewById(R.id.data9);
        final CheckBox cbpeople9 = (CheckBox) findViewById(R.id.people9);
        final CheckBox cbidea9 = (CheckBox) findViewById(R.id.idea9);

        final CheckBox cbthings10 = (CheckBox) findViewById(R.id.things10);
        final CheckBox cbdata10 = (CheckBox) findViewById(R.id.data10);
        final CheckBox cbpeople10 = (CheckBox) findViewById(R.id.people10);
        final CheckBox cbidea10 = (CheckBox) findViewById(R.id.idea10);

        final CheckBox cbthings11 = (CheckBox) findViewById(R.id.things11);
        final CheckBox cbdata11 = (CheckBox) findViewById(R.id.data11);
        final CheckBox cbpeople11 = (CheckBox) findViewById(R.id.people11);
        final CheckBox cbidea11 = (CheckBox) findViewById(R.id.idea11);

        final CheckBox cbthings12 = (CheckBox) findViewById(R.id.things12);
        final CheckBox cbdata12 = (CheckBox) findViewById(R.id.data12);
        final CheckBox cbpeople12 = (CheckBox) findViewById(R.id.people12);
        final CheckBox cbidea12 = (CheckBox) findViewById(R.id.idea12);

        final CheckBox cbthings13 = (CheckBox) findViewById(R.id.things13);
        final CheckBox cbdata13 = (CheckBox) findViewById(R.id.data13);
        final CheckBox cbpeople13 = (CheckBox) findViewById(R.id.people13);
        final CheckBox cbidea13 = (CheckBox) findViewById(R.id.idea13);


        Button next = (Button) findViewById(R.id.next); //문의사항

        next.setOnClickListener(new View.OnClickListener() { //넘어가기 버튼 클릭시
            @Override
            public void onClick(View v) {
                //String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
                int mthings = 0; //사물 카운트
                int mpeople = 0 ; //사람 카운트
                int mdata = 0 ; //자료 카운트
                int midea = 0 ; //사고 카운트
                int msum = 0 ;

                if(cbdata1.isChecked() == true) { mdata++ ; }
                if(cbdata2.isChecked() == true) { mdata++ ; }
                if(cbdata3.isChecked() == true) { mdata++ ; }
                if(cbdata4.isChecked() == true) { mdata++ ; }
                if(cbdata5.isChecked() == true) { mdata++ ; }
                if(cbdata6.isChecked() == true) { mdata++ ; }
                if(cbdata7.isChecked() == true) { mdata++ ; }
                if(cbdata8.isChecked() == true) { mdata++ ; }
                if(cbdata9.isChecked() == true) { mdata++ ; }
                if(cbdata10.isChecked() == true) { mdata++ ; }
                if(cbdata11.isChecked() == true) { mdata++ ; }
                if(cbdata12.isChecked() == true) { mdata++ ; }
                if(cbdata13.isChecked() == true) { mdata++ ; }

                if(cbthings1.isChecked() == true) { mthings++ ; }
                if(cbthings2.isChecked() == true) { mthings++ ; }
                if(cbthings3.isChecked() == true) { mthings++ ; }
                if(cbthings4.isChecked() == true) { mthings++ ; }
                if(cbthings5.isChecked() == true) { mthings++ ; }
                if(cbthings6.isChecked() == true) { mthings++ ; }
                if(cbthings7.isChecked() == true) { mthings++ ; }
                if(cbthings8.isChecked() == true) { mthings++ ; }
                if(cbthings9.isChecked() == true) { mthings++ ; }
                if(cbthings10.isChecked() == true) { mthings++ ; }
                if(cbthings11.isChecked() == true) { mthings++ ; }
                if(cbthings12.isChecked() == true) { mthings++ ; }
                if(cbthings13.isChecked() == true) { mthings++ ; }

                if(cbpeople1.isChecked() == true) { mpeople++ ; }
                if(cbpeople2.isChecked() == true) { mpeople++ ; }
                if(cbpeople3.isChecked() == true) { mpeople++ ; }
                if(cbpeople4.isChecked() == true) { mpeople++ ; }
                if(cbpeople5.isChecked() == true) { mpeople++ ; }
                if(cbpeople6.isChecked() == true) { mpeople++ ; }
                if(cbpeople7.isChecked() == true) { mpeople++ ; }
                if(cbpeople8.isChecked() == true) { mpeople++ ; }
                if(cbpeople9.isChecked() == true) { mpeople++ ; }
                if(cbpeople10.isChecked() == true) { mpeople++ ; }
                if(cbpeople11.isChecked() == true) { mpeople++ ; }
                if(cbpeople12.isChecked() == true) { mpeople++ ; }
                if(cbpeople13.isChecked() == true) { mpeople++ ; }

                if(cbidea1.isChecked() == true) { midea++ ; }
                if(cbidea2.isChecked() == true) { midea++ ; }
                if(cbidea3.isChecked() == true) { midea++ ; }
                if(cbidea4.isChecked() == true) { midea++ ; }
                if(cbidea5.isChecked() == true) { midea++ ; }
                if(cbidea6.isChecked() == true) { midea++ ; }
                if(cbidea7.isChecked() == true) { midea++ ; }
                if(cbidea8.isChecked() == true) { midea++ ; }
                if(cbidea9.isChecked() == true) { midea++ ; }
                if(cbidea10.isChecked() == true) { midea++ ; }
                if(cbidea11.isChecked() == true) { midea++ ; }
                if(cbidea12.isChecked() == true) { midea++ ; }
                if(cbidea13.isChecked() == true) { midea++ ; }
                //tv.setText("선택결과:" + result);


                msum = mdata + midea + mpeople + mthings ;

                if(msum == 9) {

                    msum = 0 ;
                    Intent intent = new Intent(getApplicationContext(), preddy_test3.class);

                    // intent 객체에 데이터를 실어서 보내기
                    // 리스트뷰 클릭시 인텐트 (Intent) 생성하고 position 값을 이용하여 인텐트로 넘길값들을 넘긴다
                    intent.putExtra("data", mdata);
                    intent.putExtra("idea", midea);
                    intent.putExtra("people", mpeople);
                    intent.putExtra("things", mthings);

                    startActivity(intent);

                }
                else if(msum != 9 ){


                    Toast.makeText(preddy_test2.this,"9개만 선택 해주세요.(현재 선택 개수:"+msum+")", Toast.LENGTH_LONG).show();

                }
            } // end onClick
        }); // end setOnClickListener

    }
}

