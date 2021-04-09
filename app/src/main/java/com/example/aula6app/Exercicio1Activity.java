package com.example.aula6app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercicio1Activity extends AppCompatActivity {

    ListView lvLista;
    String[] index = {"logo", "nome", "pontos"};
    int[] campos = {R.id.ivLogo, R.id.tvNome, R.id.tvPontos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        lvLista = findViewById(R.id.lvLista);

        Exercicio1Adapter adapter = new Exercicio1Adapter(this, dados(), R.layout.item_row, index, campos);
        lvLista.setAdapter(adapter);
        lvLista.setOnItemClickListener(onItemClickListener);
    }

    private ArrayList<HashMap<String, Object>> dados(){
        String[] clubes = {"Palmeiras", "Flamengo", "Atlético Mineiro", "Corinthians", "Santos", "Grêmio", "Ponte Preta", "Fluminense", "Atlético Paranaense", "Chapecoense", "Botafogo", "São Paulo", "Sport", "Cruzeiro", "Vitória", "Coritiba", "Internacional", "Figueirense", "Santa Cruz", "América Mineiro"};
        int[] pontos = {43, 40, 39, 37, 36, 36, 34, 34, 33, 30, 29, 28, 27, 26, 26, 26, 24, 24, 19, 13};
        int[] img = {R.drawable.pal, R.drawable.fla, R.drawable.cam, R.drawable.cor, R.drawable.san, R.drawable.gre, R.drawable.pon, R.drawable.flu, R.drawable.cap, R.drawable.cha, R.drawable.bot, R.drawable.sao, R.drawable.spt, R.drawable.cru, R.drawable.vit, R.drawable.cfc, R.drawable.inter, R.drawable.fig, R.drawable.sta, R.drawable.ame};

        ArrayList<HashMap<String, Object>> dados = new ArrayList<>();
        for (int x = 0; x < clubes.length; x++){
            HashMap<String, Object> itens = new HashMap<>();
            itens.put("logo", img[x]);
            itens.put("nome", clubes[x]);
            itens.put("pontos", pontos[x]);
            dados.add(itens);
        }
        return dados;
    }

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            HashMap<String, Object> item = dados().get(position);
            String nome = (String) item.get("nome");
            int pontos = (int) item.get("pontos");
            Toast.makeText(Exercicio1Activity.this, nome + " - " + pontos, Toast.LENGTH_SHORT).show();
        }
    };
}