package com.bnk.differntviews;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertDialoge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        final TextView tv1 = (TextView) findViewById(R.id.name);
        final TextView tv2 = (TextView) findViewById(R.id.acno);
        final TextView tv3 = (TextView) findViewById(R.id.bal);
        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        Button bt3 = (Button) findViewById(R.id.bt3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Naresh kumar");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(AlertDialoge.this);

                builder.setMessage("Are you sure?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                tv2.setText("201489322478");
                            }}
                        ).setNegativeButton("Cancel",null);
                AlertDialog alert=builder.create();
                alert.show();


            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(AlertDialoge.this);

                builder.setMessage("Are you sure?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                tv3.setText("Rs : 2000");
                            }}
                        ).setNegativeButton("Cancel",null);
                AlertDialog alert=builder.create();
                alert.show();


            }
        });

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder =new AlertDialog.Builder(AlertDialoge.this);

        builder.setTitle("Really Exit? ")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        AlertDialoge.super.onBackPressed();
                    }}
                ).setNegativeButton("Cancel",null);
        AlertDialog alert=builder.create();
        alert.show();
    }
}
