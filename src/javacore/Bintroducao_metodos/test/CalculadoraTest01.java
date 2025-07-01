package javacore.Bintroducao_metodos.test;

import javacore.Bintroducao_metodos.dominio.Calculadora;

//private: visto somente pela classe criada.
//protected: é visto a nivel de pacote, classe e sub-classe.
//default: visto somente dentro do mesmo pacote.

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); //
        calculadora.somaDoisNumeros();
    }
}
