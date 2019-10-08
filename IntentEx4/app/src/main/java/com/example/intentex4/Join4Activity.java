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

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinresult);

        intent = new Intent(this.getIntent());

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

        String str = String.format(Locale.getDefault(),
                                "이름: %s\n"+ "성별:%s\n " +"취미: %s\n", strName, strGender, strHobby);

        resultTxt.setText(str);

        Toast.makeText(getApplicationContext(), "입력하신 정보를 확인해주세요", Toast.LENGTH_SHORT).show();

        intent = new Intent(Join4Activity.this, MainActivity.class);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "회원가입 성공", Toast.LENGTH_SHORT).show();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //새로 생성하려는 액티비티와 동일한 액티비티가 스택에 있을경우 동일한 액티비티 위의 모든 액티비티를 종료시키고 기존 액티비티를 새로 생성된 액티비티로 교체한다


                startActivity(intent);
                finish();
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "회원가입 취소", Toast.LENGTH_SHORT).show();

                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();

            }
        });
    }

}
