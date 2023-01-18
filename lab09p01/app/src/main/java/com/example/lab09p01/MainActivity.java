package com.example.lab09p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button01;
    ListView listView01;
    EditText editText01;
    List<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 =  findViewById(R.id.button01);
        listView01 = findViewById(R.id.listView01);
        editText01 = findViewById(R.id.editTex01);
        lista = new ArrayList<String>();

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dodajElement();
            }
        });
        pokazListView();

    }

    private void dodajElement() {
        if(editText01.getText().toString().isEmpty()) return;
        lista.add(editText01.getText().toString());
        editText01.setText("");
        pokazListView();
    }

    private void pokazListView() {
        String[] elementy =  new String[lista.size()];
        lista.toArray(elementy);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,elementy);
        listView01.setAdapter(adapter);
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Wybrano pozycje "+ lista.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}