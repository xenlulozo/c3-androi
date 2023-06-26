package com.example.cau_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent intent = getIntent();
        float num1 = intent.getFloatExtra("item1", 0);
        float num2 = intent.getFloatExtra("item2", 0);
            Log.i("TAG", "onCreate: " + num1 + num2);

        TextView tv = findViewById(R.id.textView);
        tv.setText(num1 + " + " + num2 + " " + " = " + " " +(num1+num2));


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button clickButton = (Button) findViewById(R.id.button2);
        clickButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}