package com.bnk.differntviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ViewPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        Button seekbar=(Button)findViewById(R.id.seekbar);
        Button rb=(Button)findViewById(R.id.ratingbar);
        Button rdb=(Button)findViewById(R.id.rdb) ;
        Button alertButton=(Button)findViewById(R.id.alert) ;
        Button menuButton=(Button)findViewById(R.id.menu) ;
        Button tabView=(Button)findViewById(R.id.tab_view) ;
        Button listButton=(Button) findViewById(R.id.list_view);


        seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ViewPage.this,Seekbar.class);
                startActivity(intent);
            }
        });

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPage.this,Ratingbar.class);
                startActivity(intent);
            }
        });

        rdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPage.this,Radiobuttons.class);
                startActivity(intent);
            }
        });
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ViewPage.this,AlertDialoge.class);
                startActivity(intent);
            }
        });
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ViewPage.this,SearchableMenu.class);
                startActivity(intent);
            }
        });
        tabView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ViewPage.this,TabViewActivity.class);
                startActivity(intent);
            }
        });
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ViewPage.this,ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
