package javacore.Bintroducao_metodos.test;

import javacore.Bintroducao_metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Mari";
        funcionario.idade = 35;
        funcionario.salarios = new double[]{1500, 2500, 5000};

        funcionario.imprimeFuncionario();
    }
}
