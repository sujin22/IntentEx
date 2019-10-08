package com.example.intentex4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Join2Activity extends AppCompatActivity {

    Button btnYes=null, btnNo=null;
    RadioGroup radGroup = null;
    RadioButton btnMale=null, btnFemale=null;

    Intent intent;
    String genStr;

    String name ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);

        Intent preIntent = getIntent();
        name = preIntent.getStringExtra("name");

        radGroup = (RadioGroup)findViewById(R.id.genderRad);
        btnMale = (RadioButton)findViewById(R.id.manRad);
        btnFemale = (RadioButton)findViewById(R.id.womRad);

        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radGroup.getCheckedRadioButtonId() == R.id.manRad)
                    genStr = "남성";
                else if(radGroup.getCheckedRadioButtonId() == R.id.womRad)
                    genStr = "여성";

                intent = new Intent(getApplicationContext(), Join3Activity.class);

                intent.putExtra("gender", genStr);
                intent.putExtra("name", name);

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
