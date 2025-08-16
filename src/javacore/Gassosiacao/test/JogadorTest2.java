package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Jogador;
import javacore.Gassosiacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Kaká");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
    }
}
