package com.example.lab03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pole_x, pole_y, pole_wynik;
    Button bt_plus, bt_minus, bt_razy, bt_podzilic, bt_ce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        znajdzKontrolki();
        dodajSluchaczZdarzen();
    }

    private void dodajSluchaczZdarzen() {
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                double x,y,wynik=0;
                x = Integer.parseInt(pole_x.getText().toString());
                y = Integer.parseInt(pole_y.getText().toString());
                switch (id)
                {
                    case R.id.bt_plus: wynik = x+y; break;
                    case R.id.bt_minus: wynik = x-y; break;
                    case R.id.bt_razy: wynik = x*y; break;
                    case R.id.bt_podzielic: wynik = x/y; break;
                }
                pole_wynik.setText(String.valueOf(wynik));
            }
        };
        bt_plus.setOnClickListener(sluchacz);
        bt_minus.setOnClickListener(sluchacz);
        bt_razy.setOnClickListener(sluchacz);
        bt_podzilic.setOnClickListener(sluchacz);

        bt_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pole_x.setText("0");
                pole_y.setText("0");
                pole_wynik.setText("");
            }
        });
    }

    private void znajdzKontrolki() {
        pole_x = findViewById(R.id.editText01);
        pole_y = findViewById(R.id.editText02);
        pole_wynik = findViewById(R.id.editText03);
        bt_plus = findViewById(R.id.bt_plus);
        bt_minus = findViewById(R.id.bt_minus);
        bt_podzilic = findViewById(R.id.bt_podzielic);
        bt_razy =  findViewById(R.id.bt_razy);
        bt_ce = findViewById(R.id.bt_ce);

    }
}