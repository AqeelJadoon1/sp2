package com.example.sp20_bse_002_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btun1,btun2,btun3,btun4,btun5,btun6,btun7,btun8,btun9,btun0,back,open;
    TextView textView;

    int pswd= 1234;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btun0=findViewById(R.id.btn_0);
        btun1=findViewById(R.id.btn_1);
        btun2=findViewById(R.id.btn_2);
        btun3=findViewById(R.id.btn_3);
        btun4=findViewById(R.id.btn_4);
        btun5=findViewById(R.id.btn_5);
        btun6=findViewById(R.id.btn_6);
        btun7=findViewById(R.id.btn_7);
        btun8=findViewById(R.id.btn_8);
        btun9=findViewById(R.id.btn_9);
        back=findViewById(R.id.btn_back);
        open=findViewById(R.id.btn_open);
        textView=findViewById(R.id.textView);
        ;


        btun0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"0");
            }
        });


        btun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"1");
            }
        });


        btun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"2");
            }
        });


        btun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"3");
            }
        });


        btun4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"4");
            }
        });


        btun5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"5");
            }
        });


        btun6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"6");
            }
        });


        btun7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"7");
            }
        });


        btun8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"8");
            }
        });


        btun9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"9");
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                str = str.substring(0, str.length() - 1);

                textView.setText(str);

            }
        });


        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    int x= Integer.parseInt(textView.getText().toString());

                    if(x==pswd)
                    {
                        Intent intent = new Intent(MainActivity.this, OpenActivity.class);
                        finish();
                        startActivity(intent);
                    }

                    else
                    {
                        count++;

                        if (count==3)
                        {
                            finish();
                        }

                        else
                        {
                            Toast.makeText(MainActivity.this,"Wrong Key!",Toast.LENGTH_SHORT).show();
                            textView.setText("");
                        }
                    }
            }
        });
    }
}