package com.example.android.appmusica;

public class Word {

    private String Autor;

    private String Cancion;

    public Word(String AutorEnviado, String CancionEnviada) {
        Autor = AutorEnviado;
        Cancion = CancionEnviada;
    }

    public String getAuthorName() {
        return Autor;
    }

    public String getSongName() {
        return Cancion;
    }

}
