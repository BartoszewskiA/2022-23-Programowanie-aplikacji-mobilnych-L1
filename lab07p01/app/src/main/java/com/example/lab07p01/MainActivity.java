package com.example.lab07p01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText01;
    Button button01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText01 = findViewById(R.id.editText01);
        button01 = findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ileWierszy = editText01.getText().toString().length();
                Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                intencja.putExtra("ile",ileWierszy);
                startActivityForResult(intencja, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && requestCode==1)
        {
           String odp = data.getExtras().getString("odp");
           String s = editText01.getText().toString();
           s+="\n";
           s+=odp;
           editText01.setText(s);
        }
    }
}