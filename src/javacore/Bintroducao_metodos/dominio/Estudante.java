package javacore.Bintroducao_metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // this: palavra reservada que refere-se a variável declarada que está dentro do objeto.
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
