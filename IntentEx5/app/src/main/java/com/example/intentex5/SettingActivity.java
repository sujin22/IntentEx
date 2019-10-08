package com.example.intentex5;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    Button btnSetting = null, btnSourceSetting=null, btnWifi = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        btnSetting = (Button)findViewById(R.id.btnSetting);
        btnSourceSetting = (Button)findViewById(R.id.btnSourceSetting);
        btnWifi = (Button)findViewById(R.id.btnWifi);

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent);
            }
        });

        btnSourceSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        });

        btnWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(intent);
            }
        });
    }

}
