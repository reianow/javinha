package javacore.Bintroducao_metodos.test;

import javacore.Bintroducao_metodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Reinaldo");
        pessoa.setIdade(24);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
