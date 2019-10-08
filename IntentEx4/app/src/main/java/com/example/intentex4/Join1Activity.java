package com.example.intentex4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Join1Activity extends AppCompatActivity {


    Button btnNo=null, btnYes=null;
    EditText nameTxt=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);


        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);
        nameTxt = (EditText)findViewById(R.id.nameTxt);


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name =  nameTxt.getText().toString();
                name = name.trim();

                if(name.getBytes().length <= 0) {
                    Toast.makeText(getApplicationContext(), "이름을 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), Join2Activity.class);

                intent.putExtra("name",name);

                startActivity(intent);
                finish();
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "회원가입 취소", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
