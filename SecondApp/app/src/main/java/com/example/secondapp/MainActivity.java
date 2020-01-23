package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btncount,btnrandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textview=findViewById(R.id.txt);
        Button btntoast=findViewById(R.id.btn1);
        btncount=findViewById(R.id.btn2);
        btnrandom=findViewById(R.id.btn3);

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Toast ",Toast.LENGTH_LONG).show();
            }
        });

        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count=textview.getText().toString();
                int countnum=Integer.parseInt(count);
                countnum++;
                        textview.setText(String.valueOf(countnum));
            }
        });
        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min=0;
                int max=100;
                int random=(int)((Math.random()*(max-min))+min);
                textview.setText(String.valueOf(random));

            }
        });
    }
}
