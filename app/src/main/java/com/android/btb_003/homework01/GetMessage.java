package com.android.btb_003.homework01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetMessage extends AppCompatActivity {
    TextView gname,gphone,gclass;
    Button btnGoBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_message);
        gname=findViewById(R.id.tvGetName);
        //get the data form maniActivity
        Student student= (Student) getIntent().getSerializableExtra("student");
        gname=findViewById(R.id.tvGetName);
        gphone=findViewById(R.id.tvGetPhone);
        gclass=findViewById(R.id.tvGetClass);
        gname.setText(student.getName().toString());
        gphone.setText(student.getPhone().toString());
        gclass.setText(student.getClassName().toString());
        btnGoBack=findViewById(R.id.btnBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                setResult(2,intent);
                finish();
            }
        });

    }
}
