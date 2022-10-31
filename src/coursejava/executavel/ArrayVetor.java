package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        // criando dois arrays(double) que vao ser as notas das diciplians
        // Creating two arrays of double that will be the grades of the disciplines.
        double[] notasJava = {8.8, 5.5, 4.6, 5.1};
        double[] notasLogica = {5.5, 2.4, 4.2, 3.1};

        // criando uma nova instância da classe Aluno e definindo o nome e o nome da escola
        Aluno aluno = new Aluno();
        aluno.setNome("Allan");
        aluno.setNomeEscola("Jdev");

        /* criando duas instâncias da classe Disciplina, definindo o nome da disciplina
          e as notas, e então adicionando-o à lista de disciplinas do aluno  */

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        disciplina.setNota(notasJava);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programacao");
        aluno.getDisciplinas().add(disciplina2);


    }
}
