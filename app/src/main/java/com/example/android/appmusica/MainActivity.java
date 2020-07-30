package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView home_principal = (TextView) findViewById(R.id.principal_page);
        home_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView buscar_canciones = (TextView) findViewById(R.id.pagina_busqueda);
        buscar_canciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Search.class);
                startActivity(numbersIntent);
            }
        });

        TextView cancionesFavoritas = (TextView) findViewById(R.id.canciones_favoritas);
        cancionesFavoritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Favorites.class);
                startActivity(numbersIntent);
            }
        });

        TextView listaDeMusica = (TextView) findViewById(R.id.lista_demusica);
        listaDeMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, List.class);
                startActivity(numbersIntent);
            }
        });
    }
}
