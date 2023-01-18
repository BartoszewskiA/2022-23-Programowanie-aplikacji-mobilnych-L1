package com.example.lab08p01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] obrazki = new int[] {R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5};
    Random random = new Random();
    ImageView ramka01, ramka02, ramka03;
    TextView klikniecia;
    int poz_1, poz_2, poz_3;
    int licznik =0;
    androidx.constraintlayout.widget.ConstraintLayout tlo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ramka01 = findViewById(R.id.ramka01);
        ramka02 = findViewById(R.id.ramka02);
        ramka03 = findViewById(R.id.ramka03);
        klikniecia = findViewById(R.id.licznik);
        tlo = findViewById(R.id.tlo);
        losuj();
        sprawdz();
        dodajSluchacza();
    }

    private void dodajSluchacza() {
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licznik++;
                klikniecia.setText(String.valueOf(licznik));
                int id = v.getId();
                switch (id)
                {
                    case R.id.ramka01:
                        poz_1++;
                        if(poz_1>=obrazki.length) poz_1=0;
                        ramka01.setImageResource(obrazki[poz_1]);
                        sprawdz();
                        break;
                    case R.id.ramka02:
                        poz_2++;
                        if(poz_2>=obrazki.length) poz_2=0;
                        ramka02.setImageResource(obrazki[poz_2]);
                        sprawdz();
                        break;
                    case R.id.ramka03:
                        poz_3++;
                        if(poz_3>=obrazki.length) poz_3=0;
                        ramka03.setImageResource(obrazki[poz_3]);
                        sprawdz();
                        break;
                }
            }
        };
        ramka01.setOnClickListener(sluchacz);
        ramka02.setOnClickListener(sluchacz);
        ramka03.setOnClickListener(sluchacz);
    }

    private void sprawdz() {
        int t1 = getResources().getColor(R.color.tlo1);
        int t2 = getResources().getColor(R.color.tlo2);
        if(poz_1 == poz_2 && poz_2==poz_3)
        {
            tlo.setBackgroundColor(t2);
        }
        else
        {
            tlo.setBackgroundColor(t1);
        }
    }

    private void losuj() {
        poz_1 = random.nextInt(obrazki.length);
        ramka01.setImageResource(obrazki[poz_1]);
        poz_2 = random.nextInt(obrazki.length);
        ramka02.setImageResource(obrazki[poz_2]);
        poz_3 = random.nextInt(obrazki.length);
        ramka03.setImageResource(obrazki[poz_3]);
    }
}