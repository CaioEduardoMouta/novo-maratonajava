package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Fatal Fury","TV",12, "Luta");
        anime.imprime();
    }
}
