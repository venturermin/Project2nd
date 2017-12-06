package com.bumslap.bum.POSproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumslap.bum.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ImageButton BtnStart = (ImageButton)findViewById(R.id.button_Start);
        BtnStart.setOnClickListener(BtnClick);

        ImageButton BtnPrepare = (ImageButton)findViewById(R.id.button_Prepare);
        BtnPrepare.setOnClickListener(BtnClick);

        ImageButton BtnAnalysis = (ImageButton)findViewById(R.id.button_Analysis);
        BtnAnalysis.setOnClickListener(BtnClick);

        ImageButton BtnSetting = (ImageButton)findViewById(R.id.button_Setting);
        BtnSetting.setOnClickListener(BtnClick);*/
    }

    public void onClickedAnaly(){

        Intent intent = new Intent(MainActivity.this, com.bumslap.bum.statistics.PieChartDataActivity.class);

        startActivity(intent);
    }

   /* ImageButton.OnClickListener BtnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button_Start:
                    Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button_Prepare:
                    intent = new Intent(MainActivity.this, MenuSettingActivity.class);
                    startActivity(intent);
                    break;
               case R.id.button_Analysis:
                    intent = new Intent(MainActivity.this, PieChartActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button_Setting:
                    intent = new Intent(MainActivity.this, UserSettingActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };*/
}