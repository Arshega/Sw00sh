package com.example.pc.sw00sh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnStart;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
         btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.startAnimation(buttonClick);
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("IS_EMPLOYEE", true);
        startActivity(i);
    }
}
