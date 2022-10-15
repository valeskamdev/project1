package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {
        public static void main(String[] args) {  // método auto executávavel

            //
            List<Aluno> alunos = new ArrayList<Aluno>();  //  // instânciando/criando uma lista de objetos Aluno, colocar a classe entre os operdores de maior e menor

            for(int quantidade = 1; quantidade <= 2; quantidade++) {


                // Pedindo para o usuário inserir o nome do aluno
                String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade+ " ?");
                // Pedindo para o usuário inserir informações e então está criando um objeto do tipo `Aluno` e definindo os valores do objeto "aluno1"
                //entrada de dados
          /*  String idade = JOptionPane.showInputDialog("Qual a idade?");
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
                for (int pos = 1; pos <= 4; pos++) {  //  loop que será executado 4 vezes.

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

        /* estrutura de repetição for each, é um loop para cada aluno
         dentro da lista e imprimindo as informações para cada um*/

            for (Aluno aluno : alunos) {  // (objeto -- variável(representando cada aluno da lista) : lista)

                // está verificando se o nome do aluno é "Allan",  ignorando se tiverem letras maiúsculas e minúsculas
                if(aluno.getNome().equalsIgnoreCase("Allan")) {
                    System.out.println(aluno);  //  imprimindo o método "toString()" da classe "Aluno"
                    System.out.println("Sua média final foi: " + aluno.getMediaNota());  // imprimindo a média do aluno
                    System.out.println("Resultado: " + aluno.getAlunoAprovado());  // imprimindo se o aluno foi aprovado, em recuperação ou reprovado
                    System.out.println("----------------------------------------------------");
                    break;
                }
            }
        }
}
