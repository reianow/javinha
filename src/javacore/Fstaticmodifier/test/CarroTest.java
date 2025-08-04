package javacore.Fstaticmodifier.test;

import javacore.Fstaticmodifier.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.velocidadeLimite = 180;
        Carro carro1 = new Carro("BMW", 260);
        Carro carro2 = new Carro("Porsche", 280);
        Carro carro3 = new Carro("Ferrari", 300);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
