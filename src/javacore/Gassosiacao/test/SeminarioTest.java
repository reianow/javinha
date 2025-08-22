package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Aluno;
import javacore.Gassosiacao.dominio.Local;
import javacore.Gassosiacao.dominio.Professor;
import javacore.Gassosiacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("USP");
        Professor professor = new Professor("Fulano", "Filósofo");
        Aluno aluno = new Aluno("Siclano", 18);
        Aluno aluno2 = new Aluno("Siclano2", 17);
        Aluno aluno3 = new Aluno("Siclano3", 16);
        Aluno aluno4 = new Aluno("Siclano4", 20);
        Aluno[] alunosParaSeminario = {aluno, aluno2, aluno3, aluno4};
        Seminario seminario = new Seminario("Filosofia", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
