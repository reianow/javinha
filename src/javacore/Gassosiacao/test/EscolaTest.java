package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Escola;
import javacore.Gassosiacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Guy Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
