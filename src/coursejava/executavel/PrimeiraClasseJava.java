package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Diretor;
import coursejava.classes.Disciplina;
import coursejava.classes.Secretario;
import coursejava.classesauxiliares.FuncaoAutenticacao;
import coursejava.constantes.StatusAluno;
import coursejava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PrimeiraClasseJava {
        public static void main(String[] args) {  // método auto executávavel

            try {  // bloco try catch, é usado para capturar exceções.

                // simples validação de permissão de acesso
                String login = JOptionPane.showInputDialog("Informe o login");
                String senha = JOptionPane.showInputDialog("Informe a senha");

            /* criando uma nova instância da classe "FuncaoAutenticacao" e passando uma nova instância da classe
              "Diretor" como parâmetro. Então está chamando o método "autenticar()" da classe "FuncaoAutenticacao" */
                if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

                    // instânciando uma lista de objetos Aluno (colocar a classe entre os operdores de maior e menor)
                    List<Aluno> alunos = new ArrayList<Aluno>();

                    // criando um novo HashMap com uma String como chave e uma Lista de Aluno como valor
                    HashMap<String, List<Aluno>> map = new HashMap<String, List<Aluno>>();

                    // loop que será executado 5 vezes, representando quantidade de alunos
                    for (int quantidade = 1; quantidade <= 1; quantidade++) {

                        // solicitando ao usuário para que insira as informações
                        String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + " ?");
                        String idade = JOptionPane.showInputDialog("Qual a idade?");
                        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
                        String rg = JOptionPane.showInputDialog("Registro Geral?");
                        String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
                        String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
                        String nomePai = JOptionPane.showInputDialog("Nome do pai?");
                        String nomeEscola = JOptionPane.showInputDialog("Nome da escola?");
                        String serieMatriculado = JOptionPane.showInputDialog("Qual a série?");
                        String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");

                        // criando um novo objeto da classe "Aluno" e atribuindo-o à variável "aluno1"'
                        Aluno aluno1 = new Aluno();

                        // atribuindo os valores da entrada de dados
                        aluno1.setNome(nome);
                        aluno1.setIdade(Integer.parseInt(idade));  // convertendo a String(idade) para um Integer
                        aluno1.setDataNasciemnto(dataNascimento);
                        aluno1.setRegistroGeral(rg);
                        aluno1.setNumeroCpf(cpf);
                        aluno1.setNomeMae(nomeMae);
                        aluno1.setNomePai(nomePai);
                        aluno1.setNomeEscola(nomeEscola);
                        aluno1.setSerieMatriculado(serieMatriculado);
                        aluno1.setDataMatricula(dataMatricula);

                        // adiconando disciplina na lista
                        for (int pos = 1; pos <= 1; pos++) {  //  loop que será executado 4 vezes

                            // pedindo ao usuário para inserir o nome da disciplina e nota
                            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
                            Disciplina disciplina = new Disciplina();    // novo objeto da classe "Disciplina"
                            disciplina.setDisciplina(nomeDisciplina);    // definindo o nome da disciplina
                            disciplina.setNota(Double.parseDouble(notaDisciplina));    // convertendo "String" para um "Double"
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
                                continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");  // pergunta ao usuário se ele quer continuar removendo, se sim, a repetição while continuará
                            }
                        }
                        alunos.add(aluno1);  // adicionando o objeto "aluno1" à lista "alunos" até o loop for terminar
                    }

                    // criando uma nova lista de alunos para cada status, com chaves e valores
                    map.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
                    map.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
                    map.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

                    // iterando sobre a lista de alunos
                    for (Aluno aluno : alunos) {

                        //alunos separados em listas

                        // verificando se o aluno está aprovado, se for, está adicionando o aluno na lista de aprovados
                        if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                            map.get(StatusAluno.APROVADO).add(aluno);  // retornando apenas a chave

                            // verificando se o aluno está em recuperação e se estiver, está adicionando o aluno à lista de recuperação
                        } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                            map.get(StatusAluno.RECUPERACAO).add(aluno);  // retornando apenas a chave

                            // Adicionando o aluno à lista de reprovados
                        } else {
                            map.get(StatusAluno.REPROVADO).add(aluno);  // retornando apenas a chave
                        }
                    }

                    //  loop for que está iterando sobre a lista de alunos de acordo com seu status
                    System.out.println("-------Lista dos aprovados-------");
                    for (Aluno aluno : map.get(StatusAluno.APROVADO)) { // retornando apenas a chave
                        System.out.println("Nome: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado() + ", Média: " + aluno.getMediaNota());
                    }

                    System.out.println("\n");
                    System.out.println("-------Lista em recuperação-------");
                    for (Aluno aluno : map.get(StatusAluno.RECUPERACAO)) {  // retornando apenas a chave
                        System.out.println("Nome: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado() + ", Média: " + aluno.getMediaNota());
                    }

                    System.out.println("\n");
                    System.out.println("-------Lista dos reprovados-------");
                    for (Aluno aluno : map.get(StatusAluno.REPROVADO)) {  // retornando apenas a chave
                        System.out.println("Nome: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado() + ", Média: " + aluno.getMediaNota());
                    }
                    // mensagem se o usuário não estiver autenticado
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso não permitido!");
                }
            }catch (NumberFormatException e) { // exceção expecifica

                /* StringBuilder = permite criar e manipular dados de Strings dinamicamente,
                 quando concatena strings com StringBuilder é invocado o método append */

                StringBuilder saida = new StringBuilder();
                e.printStackTrace(); // imprime erro no console (IMPORTANT!)
                System.out.println("Mensagem: " + e.getMessage());  // imprimindo a mensagem de erro/causa no console

                // um loop for que itera sobre o rastreamento de pilha
                // e.getStackTrace() é uma array
                // e.getStackTrace().length = obtendo o comprimento do rastreamento de pilha
                for (int pos = 0; pos < e.getStackTrace().length; pos++) {
                    // [pos] = na posicao do array, assim, retornando os métodos get sobre
                    saida.append("\n Classe de erro: ").append(e.getStackTrace()[pos].getClassName()); // obtendo o nome da classe do erro
                    saida.append("\n Método de erro: ").append(e.getStackTrace()[pos].getMethodName()); // recebendo o nome do método do erro
                    saida.append("\n Linha de erro: ").append(e.getStackTrace()[pos].getLineNumber()); // recebendo o número da linha do erro
                    saida.append("\n Classe de erro: ").append(e.getClass().getName()); // obtendo o nome da classe que está lançando o erro
                }
                JOptionPane.showMessageDialog(null, "Erro de conversão de número " + saida.toString());  // caixa de mensagem para o usuário
            }catch(NullPointerException e){  // exceção expecifica
                JOptionPane.showMessageDialog(null, "NullPointerException: " +e.getClass());
            }catch(Exception e){ //todas exceções que não prevemos
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
            }finally {  //  permite que você execute código, depois try e catch, independentemente do resultado
                JOptionPane.showMessageDialog(null, "Duvidas? Envie um email para testeste@gmail.com ");
            }
        }
}
