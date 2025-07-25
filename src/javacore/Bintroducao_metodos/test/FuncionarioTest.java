package javacore.Bintroducao_metodos.test;

import javacore.Bintroducao_metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Mari");
        funcionario.setIdade(35);
        funcionario.setSalarios(new double[]{1500, 2500, 5000});
        funcionario.imprimeFuncionario();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
