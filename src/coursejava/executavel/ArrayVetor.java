package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Disciplina;


public class ArrayVetor {

    public static void main(String[] args) {

        // criando dois arrays(double) que vao ser as notas das diciplians
        double[] notasJava = {8.8, 5.5, 4.6, 5.1};
        double[] notasLogica = {5.5, 2.4, 4.2, 3.1};

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

        System.out.println("O aluno " + aluno.getNome() + " está inscrito na escola " + aluno.getNomeEscola());
        System.out.println("Disciplinas do " + aluno.getNome() + ":");

        // iterando sobre a lista de disciplinas do aluno e imprimindo o nome da disciplina e as notas
        for (Disciplina disci : aluno.getDisciplinas()) {
            System.out.println(disci.getDisciplina());
            System.out.println("As notas das diciplinas sao: ");

            for (int pos = 0; pos < disci.getNota().length; pos++) {
                System.out.println("Nota " + (pos + 1) + ": " + disci.getNota()[pos]);
            }
        }
    }
}
