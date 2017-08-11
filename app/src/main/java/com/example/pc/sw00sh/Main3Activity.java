package com.example.pc.sw00sh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button btnBeg;
    private Button btnBall;
    private Button btnFinnish;
    private String s= "";
    int num=0;
    private Float i = (float) .7;
    private Float o = (float) .2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        s=getIntent().getStringExtra("");

        btnBeg = (Button) findViewById(R.id.btnBeg);
        btnBall = (Button) findViewById(R.id.btnBall);
        btnFinnish = (Button) findViewById(R.id.btnFinnish);

        btnBeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFinnish.setBackgroundResource(R.drawable.my_button_bg);
                num=1;
                btnFinnish.setAlpha(i);
                btnBeg.setAlpha(i);
                btnBall.setAlpha(o);
            }
        });

        btnBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFinnish.setBackgroundResource(R.drawable.my_button_bg);
                num=2;
                btnFinnish.setAlpha(i);
                btnBall.setAlpha(i);
                btnBeg.setAlpha(o);
            }
        });

        btnFinnish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==1){
                    Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                    intent.putExtra("",1);
                    intent.putExtra("1",s);
                    startActivity(intent);
                }
                if (num==2){
                    Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                    intent.putExtra("",2);
                    intent.putExtra("1",s);
                    startActivity(intent);
                }
            }
        });


    }
}
