package com.bnk.differntviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Ratingbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);

        RatingBar rb1=(RatingBar)findViewById(R.id.rb11);
        final TextView tv1=(TextView)findViewById(R.id.tv1);
        RatingBar rb2=(RatingBar)findViewById(R.id.rb2);
        final TextView tv2=(TextView)findViewById(R.id.tv2);
        RatingBar rb3=(RatingBar)findViewById(R.id.rb3);
        final TextView tv3=(TextView)findViewById(R.id.tv3);


        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv1.setText("Value : "+v);
            }
        });
        rb2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv2.setText("Value : "+v);
            }
        });
        rb3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv3.setText("Value : "+v);
            }
        });
    }
}
