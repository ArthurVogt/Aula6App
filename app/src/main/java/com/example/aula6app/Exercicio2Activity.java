package com.example.aula6app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.Arrays;

public class Exercicio2Activity extends AppCompatActivity {

    Spinner spCores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        int[] cores = {R.color.black, R.color.white, R.color.green, R.color.yellow, R.color.blue, R.color.orange, R.color.red};
        String[] texto = {"preto", "branco", "verde", "amarelo", "azul", "laranja", "vemelho"};

        spCores = findViewById(R.id.spCores);

        Exercicio2Adapter adapter = new Exercicio2Adapter(this, R.layout.spinner_item, R.id.tvCor, Arrays.asList(texto), cores);
        spCores.setAdapter(adapter);

    }
}