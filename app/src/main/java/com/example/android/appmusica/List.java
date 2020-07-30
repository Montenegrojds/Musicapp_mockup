package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView home_principal = (TextView) findViewById(R.id.principal_page);
        home_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(List.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView buscar_canciones = (TextView) findViewById(R.id.pagina_busqueda);
        buscar_canciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(List.this, Search.class);
                startActivity(numbersIntent);
            }
        });

        TextView cancionesFavoritas = (TextView) findViewById(R.id.canciones_favoritas);
        cancionesFavoritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(List.this, Favorites.class);
                startActivity(numbersIntent);
            }
        });

        TextView listaDeMusica = (TextView) findViewById(R.id.lista_demusica);
        listaDeMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(List.this, List.class);
                startActivity(numbersIntent);
            }
        });

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Porter Robinson & Madeon", "Shelter "));
        words.add(new Word("LFZ ", "Popsicle "));
        words.add(new Word("Elektronomia ", "Limitless "));
        words.add(new Word("Jim Yosef", "Link "));
        words.add(new Word("Elektronomia", "Sky High "));
        words.add(new Word("Jim Yosef", "Firefly "));
        words.add(new Word("Elektronomia ", "Energy "));
        words.add(new Word("Janji ", "Heroes Tonight"));
        words.add(new Word("Syn Cole ", "Feel Good"));
        words.add(new Word("Alan Walker", "Spectre "));
        words.add(new Word("Desmeon ", "Hellcat  "));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}