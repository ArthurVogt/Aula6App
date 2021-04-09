package com.example.aula6app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickExercicio1(View view) {
        Intent it = new Intent(this, Exercicio1Activity.class);
        startActivity(it);
    }

    public void onClickExercicio2(View view) {
        Intent it = new Intent(this, Exercicio2Activity.class);
        startActivity(it);
    }
}