package com.bnk.differntviews;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<String> data;
    ArrayAdapter<String> adapter;
    Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mcontext=this;
        final ListView lv=(ListView)findViewById(R.id.list_view_1);
        data=new ArrayList<>();
        data.add("hello");
        data.add("dff");
        data.add("afaf");
        data.add("afdf");
        data.add("afdsf");
        data.add("afdfff");
        data.add("adfdff");
        data.add("hellafdffo");
        data.add("hedafadffllo");
        data.add("fafdsffg");
        data.add("hello");
        data.add("dff");
        data.add("afaf");
        data.add("afdf");
        data.add("afdsf");
        data.add("afdfff");
        data.add("adfdff");
        data.add("hellafdffo");
        data.add("hedafadffllo");
        data.add("fafdsffg");

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        Button btn= new Button(this);
        btn.setText("Load More");
        btn.setAllCaps(false);
        lv.addFooterView(btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.add("1");
                data.add("2");
                data.add("3");
                data.add("4");
                data.add("5");
                adapter.clear();
                adapter=new ArrayAdapter<>(mcontext,android.R.layout.simple_list_item_1,data);
                lv.setAdapter(adapter);
            }
        });
    }

}
