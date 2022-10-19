package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ArrayList <Jezyk> jezyki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        JezykiRepo.wypelnijTablice();
        jezyki = JezykiRepo.jezyki;
        ArrayAdapter<Jezyk> adapterJezyki = new ArrayAdapter<>(
                MainActivity3.this,
                android.R.layout.simple_list_item_1,
                jezyki
        );
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapterJezyki);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText editText = findViewById(R.id.editTextTextPersonName);
                        String nowyJezyk = editText.getText().toString();
                        jezyki.add(new Jezyk(nowyJezyk,R.drawable.obraz3));
                        adapterJezyki.notifyDataSetChanged();
                        editText.setText("");
                    }
                }
        );
    }
}