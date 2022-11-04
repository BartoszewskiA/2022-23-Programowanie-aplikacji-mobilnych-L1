package com.example.lab02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void liczenie(View view)
    {
        EditText e1 = findViewById(R.id.editText01);
        EditText e2 = findViewById(R.id.editText02);
        EditText w = findViewById(R.id.editText03);
        int x = Integer.parseInt(e1.getText().toString());
        int y = Integer.parseInt(e2.getText().toString());
        w.setText(String.valueOf(x+y));


    }
}