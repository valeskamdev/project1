package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {
        public static void main(String[] args) {  // método auto executávavel

            // instânciando/criando uma lista de objetos Aluno, colocar a classe entre os operdores de maior e menor
            List<Aluno> alunos = new ArrayList<Aluno>();

            for(int quantidade = 1; quantidade <= 2; quantidade++) {


                // Pedindo para o usuário inserir o nome do aluno
                String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade+ " ?");
                // Pedindo para o usuário inserir informações e então está criando um objeto do tipo `Aluno` e definindo os valores do objeto "aluno1"
                //entrada de dados
              /* String idade = JOptionPane.showInputDialog("Qual a idade?");
                String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
                String rg = JOptionPane.showInputDialog("Registro Geral?");
                String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
                String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
                String nomePai = JOptionPane.showInputDialog("Nome do pai?");
                String nomeEscola = JOptionPane.showInputDialog("Nome da escola?");
                String serieMatriculado = JOptionPane.showInputDialog("Qual a série?");
                String dataMatricula = JOptionPane.showInputDialog("Data da matricula?"); */

                //  a variável "aluno1" é uma >>referência<< para o objeto "Aluno"
                Aluno aluno1 = new Aluno();  // >>intanciando<< o objeto aluno1 (criação de objeto)

                // atribuindo os valores da entrada de dados
                aluno1.setNome(nome);
              /*  aluno1.setIdade(Integer.valueOf(idade));
                aluno1.setDataNasciemnto(dataNascimento);
                aluno1.setRegistroGeral(rg);
                aluno1.setNumeroCpf(cpf);
                aluno1.setNomeMae(nomeMae);
                aluno1.setNomePai(nomePai);
                aluno1.setNomeEscola(nomeEscola);
                aluno1.setSerieMatriculado(serieMatriculado);
                aluno1.setDataMatricula(dataMatricula); */


                // adiconando disciplina na lista
                for (int pos = 1; pos <= 1; pos++) {  //  loop que será executado 4 vezes.

                    // pedindo ao usuário para inserir o nome da disciplina e nota
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                    String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
                    Disciplina disciplina = new Disciplina();    // novo objeto da classe "Disciplina", atribuindo a variável "disciplina" (dando referência)
                    disciplina.setDisciplina(nomeDisciplina);    // definindo o nome da disciplina.
                    disciplina.setNota(Double.valueOf(notaDisciplina));    // convertendo double para string
                    aluno1.getDisciplinas().add(disciplina);   //  adicionando a "disciplina" à lista de "disciplinas" do "aluno1"
                }

                /* perguntando ao usuário se ele quer remover alguma disciplina
                   se ele quiser, ele vai perguntar qual e depois removê-lo */

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
                if (escolha == 0) {  //opção SIM é zero, se o usuário clicar em sim, entra nessa condição

                    int continuarRemover = 0;  // opção SIM(remover), também zero(0)
                    int posicao = 1;

                    while (continuarRemover == 0) {   // enquanto o usuário quiser remover, o loop continuará
                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");  // pergunatndo ao usuário qual disciplina ele quer remover

                    /* removendo a disciplina da lista,  "Integer.valueOf" está convertendo a variável para "Integer"
                     e então "intValue()" está convertendo o "Integer" para um "int", para usar o ".remove(int)" */
                        aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                        posicao++;
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");  // perguntar ao usuário se ele quer continuar removendo, se sim, a repetição while continuará
                    }
                }
                alunos.add(aluno1);  // adicionando o objeto "aluno1" à lista "alunos" até o loop for terminar
            }

            // percorrendo lista pelas posições e imprimindo as informações dos alunos


            for(int pos = 0; pos < alunos.size(); pos++) {
                Aluno aluno = alunos.get(pos);

                // substituindo o objeto "aluno" pelo objeto "trocar" (novo aluno) e alterando suas disciplinas.
                if(aluno.getNome().equalsIgnoreCase("Allan")) {
                    Aluno trocar = new Aluno();
                    trocar.setNome("Aluno foi trocado");
                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina("Matematica"); // alterando sua disciplina
                    disciplina.setNota(9);  // alterando sua nota
                    trocar.getDisciplinas().add(disciplina);  // adicionando as disciplinas do novo aluno à lista "Disciplinas"
                    alunos.set(pos, trocar);  // para substituir pegamos a posição(indice) e o novo aluno(novo elemento)
                    aluno = alunos.get(pos);  // pegando a antiga variável "aluno" e substituindo na lista pela posição do aluno novo
                }

                System.out.println("Posição: " + pos);
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Média do aluno: " + aluno.getMediaNota());
                System.out.println("Resultado: " + aluno.getAlunoAprovado());

                // imprimindo as disciplinas e notas do aluno
                for(int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {  //  posd = posição disciplina, discip = disciplina
                    Disciplina discip = aluno.getDisciplinas().get(posd);
                    System.out.println("Matéria: " + discip.getDisciplina() + " , Nota: " + discip.getNota());
                }
                System.out.println("---------------------------------------");
            }
        }
}