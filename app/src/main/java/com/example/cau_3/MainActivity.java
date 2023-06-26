package com.example.cau_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText item1 = findViewById(R.id.editTextPhone);
        EditText item2 = findViewById(R.id.editTextPhone2);

        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(String.valueOf(item1.getText()));
                float num2 = Float.parseFloat(String.valueOf(item2.getText()));
                Log.i("TAG", "onCreate: " + num1 + num2);
                Intent intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("item1", num1);
                intent.putExtra("item2", num2);

                v.getContext().startActivity(intent);
            }
        });

    }
}