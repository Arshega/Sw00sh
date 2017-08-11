package com.example.pc.sw00sh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button btnMen;
    private Button btnNext;
    private Button btnWomen;
    private Button btnCoed;
    private TextView txtAns;
    private TextView txtAn;
    private Float i = (float) .7;
    private Float o = (float) .2;
    int num1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnMen = (Button) findViewById(R.id.btnMen);
        btnWomen = (Button) findViewById(R.id.btnWomen);
        btnCoed = (Button) findViewById(R.id.btnCoed);
        btnNext = (Button) findViewById(R.id.btnNext);
        txtAns = (TextView) findViewById(R.id.txtAns);
        txtAn = (TextView) findViewById(R.id.txtAn);



        int num = getIntent().getIntExtra("",0);
        String s = getIntent().getStringExtra("1");

        if("Mens".equals(s)){
            if (num==1){
                btnNext.setVisibility(View.GONE);
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Beginner");
                txtAn.setVisibility(View.VISIBLE);
                btnMen.setAlpha(1);
                btnWomen.setAlpha(o);
                btnCoed.setAlpha(o);
                btnNext.setClickable(false);
            }
            if (num==2){
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Baller");
                txtAn.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                btnMen.setAlpha(1);
                btnWomen.setAlpha(o);
                btnCoed.setAlpha(o);
            }
        }

        if("Womens".equals(s)){
            if (num==1){
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Beginner");
                txtAn.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                btnWomen.setAlpha(1);
                btnMen.setAlpha(o);
                btnCoed.setAlpha(o);
               // btnNext.setClickable(false);
            }
            if (num==2){
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Baller");
                txtAn.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                btnWomen.setAlpha(1);
                btnMen.setAlpha(o);
                btnCoed.setAlpha(o);
            }
        }

        if("Co-ed".equals(s)){
            if (num==1){
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Beginner");
                txtAn.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                btnCoed.setAlpha(1);
                btnMen.setAlpha(o);
                btnWomen.setAlpha(o);
            }
            if (num==2){
                txtAns.setText("I am a: ");
                txtAns.setVisibility(View.VISIBLE);
                txtAn.setText("Baller");
                txtAn.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                btnCoed.setAlpha(1);
                btnMen.setAlpha(o);
                btnWomen.setAlpha(o);
            }
        }

        btnMen.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                btnNext.setAlpha(i);
                btnNext.setBackgroundResource(R.drawable.my_button_bg);
                btnMen.setAlpha(i);
                btnWomen.setAlpha(o);
                btnCoed.setAlpha(o);
                num1 = 1;

            }
        });

        btnWomen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNext.setAlpha(i);
                btnNext.setBackgroundResource(R.drawable.my_button_bg);
                btnMen.setAlpha(o);
                btnWomen.setAlpha(i);
                btnCoed.setAlpha(o);
                num1 = 2;
            }
        });


        btnCoed.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNext.setAlpha(i);
                btnNext.setBackgroundResource(R.drawable.my_button_bg);
                btnMen.setAlpha(o);
                btnWomen.setAlpha(o);
                btnCoed.setAlpha(i);
                num1 = 3;
            }
        });

        btnNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1==1){
                    Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                    intent.putExtra("","Mens");
                    startActivity(intent);
                }
                if (num1==2){
                    Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                    intent.putExtra("","Womens");
                    startActivity(intent);
                }
                if (num1==3){
                    Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                    intent.putExtra("","Co-ed");
                    startActivity(intent);
                }
            }
        });


    }





}
