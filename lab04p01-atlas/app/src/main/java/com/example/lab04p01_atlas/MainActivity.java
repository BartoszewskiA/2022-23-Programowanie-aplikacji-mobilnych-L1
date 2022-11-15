package com.example.lab04p01_atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] foto = new int[] {R.drawable.f_wilk,
                            R.drawable.f_rekin,
                            R.drawable.f_lion};
    String[] nazwy;
    String[] opisy;
    int nr =0;
    Random random = new Random();
   /* int[] foto;*/
    ImageView ramka;
    TextView nazwa, opis;
    Button back, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*foto = getResources().getIntArray(R.array.ilustracje);*/
        nazwy = getResources().getStringArray(R.array.nazwy);
        opisy = getResources().getStringArray(R.array.opisy);
        ramka = findViewById(R.id.ramka);
        nazwa = findViewById(R.id.tw_nazwa);
        opis = findViewById(R.id.tw_opis);
        back = findViewById(R.id.b_back);
        next = findViewById(R.id.b_next);
        nr = random.nextInt(foto.length);
        przeladuj(nr);
    }

    private void przeladuj(int nr) {
        ramka.setImageResource(foto[nr]);
        opis.setText(opisy[nr]);
        nazwa.setText(nazwy[nr]);
    }

}