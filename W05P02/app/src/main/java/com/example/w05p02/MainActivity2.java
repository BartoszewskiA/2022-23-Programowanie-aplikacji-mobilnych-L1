package com.example.w05p02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText a2_login, a2_haslo;
    Button a2_zaloguj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a2_login = findViewById(R.id.a2_login);
        a2_haslo = findViewById(R.id.a2_haslo);
        a2_zaloguj = findViewById(R.id.a2_zaloguj);
        a2_zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odpowiedz = new Intent();
                odpowiedz.putExtra(a2_login.getText().toString())
                finish();
            }
        });
    }
}