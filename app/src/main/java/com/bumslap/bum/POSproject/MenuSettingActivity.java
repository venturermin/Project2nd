package com.bumslap.bum.POSproject;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_setting);
        ImageView BTNMenuUpdate = (ImageView)findViewById(R.id.imageView);
        BTNMenuUpdate.setOnClickListener(updatemenu);

    }

    ImageView.OnClickListener updatemenu = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MenuUpdateActivity.class);
        }
    };
}
