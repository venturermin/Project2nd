package com.bumslap.bum.POSproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnStart = (Button)findViewById(R.id.button_Start);
        BtnStart.setOnClickListener(BtnClick);

        Button BtnPreparet = (Button)findViewById(R.id.button_Prepare);
        BtnPreparet.setOnClickListener(BtnClick);

        Button BtnAnalysis = (Button)findViewById(R.id.button_Analysis);
        BtnAnalysis.setOnClickListener(BtnClick);

        Button BtnSetting = (Button)findViewById(R.id.button_Setting);
        BtnSetting.setOnClickListener(BtnClick);
    }

    Button.OnClickListener BtnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button_Start:
                    Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button_Prepare:
                    intent = new Intent(getApplicationContext(), MenuSettingActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button_Analysis:
                    intent = new Intent(getApplicationContext(), PieChartActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button_Setting:
                    intent = new Intent(getApplicationContext(), UserSettingActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
