package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3}; // Um array de 3 posições fazendo referencia a 3 objetos.
        // ou Jogador[] jogadores = new Jogador[3];
        // ou Jogador[] jogadores new Jogador[3] {jogador1, jogador2, jogador3}

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
