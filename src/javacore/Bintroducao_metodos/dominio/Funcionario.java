package javacore.Bintroducao_metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios; // 3 salários

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
        double media = 0; // inicializa a variável.
        for (double salario : salarios) { // ou: for (int i = 0; i < salario.length; i++)
            media += salario; // media = 0 + salarios.
        }
        media /= salarios.length; // media = somatória dos salarios / tamanho do array (3).
        System.out.println("\nMédia salarial: " + media);
    }
}
