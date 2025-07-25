package javacore.Csobrecarga_metodos.test;

import javacore.Csobrecarga_metodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", "Shounen", 200);
        anime.imprime();
    }
}
