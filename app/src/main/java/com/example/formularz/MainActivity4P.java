package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4P extends AppCompatActivity {
    ArrayList<Integer> loga = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4p);
        loga.add(R.drawable.obraz1);
        loga.add(R.drawable.obraz2);
        loga.add(R.drawable.obraz3);
        loga.add(R.drawable.obraz5);
        loga.add(R.drawable.obraz5);
        Spinner jezykiSpinner = findViewById(R.id.spinner);
        AdapterView.OnItemSelectedListener wybrany=
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String jezyk = adapterView.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity4P.this,
                                jezyk,
                                Toast.LENGTH_SHORT).show();
                        ImageView symbolImageView = findViewById(R.id.imageView);
                        symbolImageView.setImageResource(loga.get(i));

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                };
        jezykiSpinner.setOnItemSelectedListener(wybrany);
        /*ArrayAdapter<String> jezykiAdapter = new ArrayAdapter<>(

        )

         */
    }
}