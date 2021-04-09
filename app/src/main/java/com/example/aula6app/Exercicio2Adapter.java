package com.example.aula6app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Exercicio2Adapter extends ArrayAdapter {

    private int[] cores;

    public Exercicio2Adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List objects, int[] cores) {
        super(context, resource, textViewResourceId, objects);
        this.cores = cores;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view = super.getView(position, convertView, parent);

        TextView tvCor = view.findViewById(R.id.tvCor);
        if (cores[position] != R.color.white){
            tvCor.setTextColor(view.getResources().getColor(R.color.white, null));
        }

        view.setBackgroundColor(view.getResources().getColor(cores[position], null));

        return view;
    }
}
