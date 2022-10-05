package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextPrzyklad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPrzyklad = findViewById(R.id.editText);

    }

    public void przepisz(View view) {
        if(editTextPrzyklad.getText().toString()!="") {
            String tekst = editTextPrzyklad.getText().toString();
            Toast.makeText(MainActivity.this,
                    tekst,
                    Toast.LENGTH_SHORT).show();
        }
        RadioGroup radioGroupEgzamin = findViewById(R.id.egzaminRadioGroup);
        int odpowiedzId = radioGroupEgzamin.getCheckedRadioButtonId();
        if(odpowiedzId == R.id.radioButton){
            Toast.makeText(MainActivity.this,
                    "To nie Twój zawód",
                    Toast.LENGTH_SHORT
                    ).show();
        }
        else if(odpowiedzId == R.id.radioButton2){
            Toast.makeText(MainActivity.this,
                    "Ten egzamin już zdany",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,
                    "Powodzenia", Toast.LENGTH_SHORT).show();
        }

    }
}