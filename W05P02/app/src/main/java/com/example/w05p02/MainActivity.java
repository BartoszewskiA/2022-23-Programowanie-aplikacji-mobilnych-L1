package com.example.w05p02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView zalogowany;
    Button bt_zaloguj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zalogowany = findViewById(R.id.zalogowany);
        bt_zaloguj = findViewById(R.id.bt_zaloguj);
        bt_zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                startActivityForResult(intencja, 1);
            }
        });
    }
}