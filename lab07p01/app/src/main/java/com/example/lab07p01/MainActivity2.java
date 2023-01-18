package com.example.lab07p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText v2_editText01, v2_editText02;
    Button v2_button01, v2_button02;
    int ileWierszy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        v2_editText01 = findViewById(R.id.v2_editText01);
        v2_editText02 = findViewById(R.id.v2_editText02);
        v2_button01 = findViewById(R.id.v2_button01);
        v2_button02 = findViewById(R.id.v2_button02);
        Bundle paczka = getIntent().getExtras();
        ileWierszy = paczka.getInt("ile");
        obslugaPrzyciskow();
    }

    private void obslugaPrzyciskow() {
        v2_button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";
                s+=String.valueOf(ileWierszy+1);
                s+=";";
                s+=v2_editText01.getText().toString();
                s+=";";
                s+=v2_editText02.getText().toString();
                s+=";";
                Intent odpowiedz = new Intent();
                odpowiedz.putExtra("odp", s);
                setResult(RESULT_OK, odpowiedz);
                finish();
            }
        });

        v2_button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}