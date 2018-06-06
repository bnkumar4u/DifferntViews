package com.bnk.differntviews;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Radiobuttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobuttons);

        RadioGroup rdb =(RadioGroup)findViewById(R.id.radio_group);
        final TextView tv =(TextView)findViewById(R.id.radio_tv);

        rdb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i==R.id.rdb1)
                   tv.setText("Gender : Male");
                else if(i==R.id.rdb2)
                    tv.setText("Gender : Female");
                else if(i==R.id.rdb3)
                    tv.setText("Gender : Other");
            }
        });
    }
}
