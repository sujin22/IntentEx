package com.example.intentex4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Join3Activity extends AppCompatActivity {
    Button btnYes=null, btnNo=null;
    CheckBox [] checks = null;

    String name="", gender="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobby);

        Intent preIntent = getIntent();
        name = preIntent.getStringExtra("name");
        gender = preIntent.getStringExtra("gender");

        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);

        checks = new CheckBox[5];
        checks[0] = (CheckBox)findViewById(R.id.chk1);
        checks[1] = (CheckBox)findViewById(R.id.chk2);
        checks[2] = (CheckBox)findViewById(R.id.chk3);
        checks[3] = (CheckBox)findViewById(R.id.chk4);
        checks[4] = (CheckBox)findViewById(R.id.chk5);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                String chkRs = "";

                for(int i=0;i<checks.length; i++){
                    if(checks[i].isChecked()){
                        chkRs+=checks[i].getText().toString()+", ";
                        count++;
                    }
                }
                if(count==0){
                    Toast.makeText(getApplicationContext(), "하나 이상 체크해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                //축구,야구,배구
                chkRs = chkRs.substring(0,chkRs.length()-2);
                //축구,야구,배구
//                String [] chk = chkRs.split(","); //구분자로 구분해서 String배열에 차례로 저장
//                //{"축구", "야구", "배구"}

                Intent intent = new Intent(getApplicationContext(),Join4Activity.class);
                intent.putExtra("name", name);
                intent.putExtra("gender", gender);
//                intent.putExtra("chk", chk);
                intent.putExtra("hobby", chkRs);

                startActivity(intent);
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}
