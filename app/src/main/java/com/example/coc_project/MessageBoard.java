package com.example.coc_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.coc_project.R.id.editText;
import static com.example.coc_project.R.id.listView1;
import static com.example.coc_project.R.id.list_item;

/**
 * 한줄 게시판.java
 * 연결 xml - messageboard.xml
 */
public class MessageBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messageboard);

        final ArrayList<String> midList = new ArrayList<String>();
        ListView listName = (ListView) findViewById(R.id.listView1);
        final ArrayList<String> midList2 = new ArrayList<String>();
        ListView list = (ListView) findViewById(R.id.listView2);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, midList);
        listName.setAdapter(adapter);

        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, midList2);
        list.setAdapter(adapter1);

        final EditText edtName = (EditText) findViewById(R.id.edtName);
        final EditText edt = (EditText) findViewById(editText);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MessageBoard.this,"등록 하였습니다.", Toast.LENGTH_LONG).show();
                midList.add(edtName.getText().toString());
                midList2.add(edt.getText().toString());
                adapter.notifyDataSetChanged();
                adapter1.notifyDataSetChanged();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                Toast.makeText(MessageBoard.this,"삭제 하였습니다.", Toast.LENGTH_LONG).show();
                midList.remove(arg2);
                adapter.notifyDataSetChanged();
                midList2.remove(arg2);
                adapter1.notifyDataSetChanged();
                return false;
            }
        });
    }
}
