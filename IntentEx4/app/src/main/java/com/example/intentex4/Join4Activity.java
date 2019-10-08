package com.example.intentex4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class Join4Activity extends AppCompatActivity {

    Button btnYes=null, btnNo=null;
    TextView resultTxt=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinresult);

        Intent intent = new Intent(this.getIntent());

        String strName = intent.getStringExtra("name");
        String strGender = intent.getStringExtra("gender");
       // String [] chk = intent.getStringArrayExtra("chk");
        String strHobby = intent.getStringExtra("hobby");

        resultTxt = (TextView)findViewById(R.id.resultTxt);
        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);

//        String str = "";
//        for(int i=0;i<chk.length;i++){
//            str += chk[i];
//        }

        String result = String.format(Locale.getDefault(),
                                "이름: %s\n"+ "성별:%s\n " +"취미: %s\n", strName, strGender, strHobby);

        resultTxt.setText(result);

        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "회원가입 성공", Toast.LENGTH_SHORT).show();
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