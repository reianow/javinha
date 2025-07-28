package javacore.Dconstrutores.test;


import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", "Shounen", 200, "Bandai Namco");
        anime.imprime();
    }
}
