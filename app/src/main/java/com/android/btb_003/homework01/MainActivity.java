package com.android.btb_003.homework01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnGegister,btnPhone;
    EditText name,phone,className;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edClass);
        phone=findViewById(R.id.edPhone);
        className=findViewById(R.id.edClass);


        btnGegister=findViewById(R.id.btnRegister);
        btnGegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,GetMessage.class);
                Student student=new Student(name.getText().toString(),phone.getText().toString(),className.getText().toString());


                intent.putExtra("student",student);
                startActivityForResult(intent,2);
                name.setText("");
                phone.setText("");
                className.setText("");

//                btnPhone=findViewById(R.id.btnCall);
//                btnPhone.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent icall=new Intent(Intent.ACTION_DIAL);
//                        icall.setData(Uri.parse("Tel: 096979899"));
//                        startActivity(icall);
//                    }
//                });



            }
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==2 && resultCode==2){
//            name.setText("");
//            phone.setText("");
//            className.setText("");
//        }
//    }
}
