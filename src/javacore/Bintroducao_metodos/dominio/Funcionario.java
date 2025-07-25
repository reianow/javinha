package javacore.Bintroducao_metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios; // 3 salários
    private double media;

    public void imprimeFuncionario() {
        if (salarios == null) {
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) { // ou: for (int i = 0; i < salario.length; i++)
            System.out.print(salario + " - ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) { // ou: for (int i = 0; i < salario.length; i++)
            media += salario; // media = 0 + salarios.
        }
        media /= salarios.length; // media = somatória dos salarios / tamanho do array (3).
        System.out.println("\nMédia salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
