package com.example.lab06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView a2_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a2_login = findViewById(R.id.a2_zalogowany);
        Bundle paczka = getIntent().getExtras();
        String login = paczka.getString("login");
        a2_login.setText(login);
    }
}