package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Disciplina;


public class ArrayVetor {

    public static void main(String[] args) {

        // criando dois arrays(double) que vao ser as notas das diciplians
        double[] notasJava = {5.5, 4.6, 5.8, 8.8};
        double[] notasLogica = {2.4, 4.2, 7.1, 3.1};

        // criando uma nova instância da classe Aluno e definindo o nome e o nome da escola
        Aluno aluno = new Aluno();
        aluno.setNome("Allan");
        aluno.setNomeEscola("Jdev Treinamentos");

        /* criando duas instâncias da classe Disciplina, definindo o nome da disciplina
          e as notas, e então adicionando-o à lista de disciplinas do aluno  */

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        disciplina.setNota(notasJava);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programacao");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);

        // criando um array de Aluno, e então está adicionando o aluno no array
        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;
        for (int pos = 0; pos < arrayAlunos.length; pos++) {
            System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());

            // loop for que itera sobre o array de objetos Disciplina
            for (Disciplina disci : arrayAlunos[pos].getDisciplinas()) {
                System.out.println("Nome da disciplina: " + disci.getDisciplina());

                double notaMax = 0.0;
                double notaMin = 0.0;

                // iterando sobre o array de notas
                for(int i = 0; i < disci.getNota().length; i++) {
                    System.out.println("Suas notas são: " + disci.getNota()[i]);

                    // obtendo o maior valor do array
                    if (i == 0) {
                        notaMax = disci.getNota()[i];
                    }else if (disci.getNota()[i] > notaMax) {
                        notaMax = disci.getNota()[i];
                    }

                    // obtendo o menor valor do array
                    if (i == 0) {
                        notaMin = disci.getNota()[i];
                    }else if (disci.getNota()[i] < notaMin) {
                        notaMin = disci.getNota()[i];
                    }
                }
                System.out.println("A maior nota dessa disciplina foi: " + notaMax);
                System.out.println("A menor nota dessa disciplina foi: " + notaMin);
            }
        }
    }
}
