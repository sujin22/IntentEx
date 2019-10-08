package com.example.activity_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultIntentActivity extends AppCompatActivity {//리스트뷰의 아이템 클릭했을때의 액션

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultintent);

        TextView textView = (TextView)findViewById(R.id.resulttext);
        Button btn = (Button)findViewById(R.id.btn2);

        Intent intent = new Intent(this.getIntent());
        String str = intent.getStringExtra("text");

        textView.setText(str);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }

}
