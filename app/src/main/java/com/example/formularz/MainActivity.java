package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView userListView;
    ArrayList<String> uzytkownicy = new ArrayList<>();
    EditText editText;
    ArrayAdapter<String> adapterUzytkownicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userListView = findViewById(R.id.userListView);
        uzytkownicy.add("Jan Kowalski");
        uzytkownicy.add("Dawid Nowak");
        uzytkownicy.add("Anna Nowak");
        adapterUzytkownicy = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                uzytkownicy
        );
        userListView.setAdapter(adapterUzytkownicy);
        editText = findViewById(R.id.editText);
    }


    public void dodaj(View view) {
        String uzytkownik = editText.getText().toString();
        uzytkownicy.add(uzytkownik);
        adapterUzytkownicy.notifyDataSetChanged();
    }
}