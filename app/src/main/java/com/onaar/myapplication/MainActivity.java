package com.onaar.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nazwa;

    RadioGroup group;

    SeekBar seekBar;

    Button button;

    EditText numb;

    ListView lista;

    ArrayList<String> ryba;

    ArrayAdapter<String> arrayAdapter;

    RadioButton roslino;

    RadioButton wszystko;

    RadioButton drapiezne;

    Spinner spinner;

    CheckBox czy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        czy = findViewById(R.id.checkBox);
        lista = findViewById(R.id.lista);
        ryba= new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ryba);
        nazwa = findViewById(R.id.text8);
        //group = findViewById(R.id.group);
        seekBar = findViewById(R.id.seekBar);
        button = findViewById(R.id.dodaj);
        numb = findViewById(R.id.number);

        spinner = findViewById(R.id.spinner);

        //roslino = findViewById(R.id.radioButton);
        //wszystko = findViewById(R.id.radioButton2);
        //drapiezne = findViewById(R.id.radioButton3);
        lista.setAdapter(arrayAdapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String radioWynik;
                boolean sprawdz = czy.isChecked();
                String czyy;
                if(sprawdz ==true){
                    czyy = "Tak";
                }
                else{
                    czyy = "Nie";
                }

                int dlugosc = seekBar.getProgress() + 1;

                /*if(roslino.isChecked()){
                    radioWynik = "Roslino";
                }
                else if(wszystko.isChecked()){
                    radioWynik = "Wszytsko";
                }
                else{
                    radioWynik = "Drapiezne";
                }*/

                String wynik = "Nazwa " + nazwa.getText().toString() + ", Sposob " + spinner.getSelectedItem() + ", Długość " + dlugosc+ ", Czy okres ochronny " + czyy + ", Waga "+ numb.getText().toString();
                ryba.add(wynik);
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}