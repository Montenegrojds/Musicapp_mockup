package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        TextView home_principalfavorites = (TextView) findViewById(R.id.principal_pagefavorites);
        home_principalfavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(Favorites.this, MainActivity.class);
                startActivity(favorites);
            }
        });

        TextView buscar_canciones = (TextView) findViewById(R.id.pagina_busquedafavorites);
        buscar_canciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Favorites.this, Search.class);
                startActivity(numbersIntent);
            }
        });

        TextView cancionesFavoritas = (TextView) findViewById(R.id.canciones_favoritasfavorites);
        cancionesFavoritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Favorites.this, Favorites.class);
                startActivity(numbersIntent);
            }
        });

        TextView listaDeMusica = (TextView) findViewById(R.id.lista_demusicafavorites);
        listaDeMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Favorites.this, List.class);
                startActivity(numbersIntent);
            }
        });

    }
}
