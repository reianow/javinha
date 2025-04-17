package javacore.Aintroducao_classes.test;

import javacore.Aintroducao_classes.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fulano";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
        System.out.println(professor);
    }
}
