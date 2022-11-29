package com.example.lab06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt_zaloguj;
    EditText et_login, et_haslo;
    String loginy[] = {"aaa","bbb","ccc","ddd"};
    String hasla[] = {"111","222","333","444"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_zaloguj = findViewById(R.id.bt_zaloguj);
        et_login = findViewById(R.id.login);
        et_haslo = findViewById(R.id.haslo);
        bt_zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sprawdzHaslo(et_login.getText().toString(), et_haslo.getText().toString()))
                {
                    Intent intencja = new Intent(getApplicationContext(), MainActivity2.class);
                    intencja.putExtra("login", et_login.getText().toString());
                    startActivity(intencja);
                }
            }
        });
    }

    private boolean sprawdzHaslo(String login, String haslo) {
        String s1="", s2="";
        if(s1.equals(s2))
        {

        }
        return true;
    }
}