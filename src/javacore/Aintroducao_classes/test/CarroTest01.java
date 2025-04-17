package javacore.Aintroducao_classes.test;

import javacore.Aintroducao_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corola";
        carro1.marca = "Hyundai";
        carro1.ano = 2018;

        carro1 = carro2; // carro1 faz referência ao msm espaço de memória (objeto) que carro2.

        carro2.nome = "Opala";
        carro2.marca = "GM";
        carro2.ano = 1984;
        System.out.println(carro1.nome);
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);
        System.out.println("------------------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);
    }
}
