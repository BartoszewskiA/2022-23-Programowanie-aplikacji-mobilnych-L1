package com.example.lab02p02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int ile =0;
    TextView wyswietlacz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wyswietlacz= findViewById(R.id.textView01);
    }

    public void dodaj(View view)
    {
        ile++;
        wyswietlacz.setText(String.valueOf(ile));
    }
    public void odejmij(View view)
    {
        ile--;
        wyswietlacz.setText(String.valueOf(ile));
    }

    public void zeruj(View view)
    {
        ile=0;
        wyswietlacz.setText(String.valueOf(ile));
    }

}