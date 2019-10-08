package com.example.activity_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputintent);

        Button btn1 = (Button)findViewById(R.id.btn1);
        final EditText editText = (EditText)findViewById(R.id.edittext);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputIntentActivity.this, ResultIntentActivity.class);

                intent.putExtra("text", String.valueOf(editText.getText())); //(key, value)

                startActivity(intent);
            }
        });


    }

}
