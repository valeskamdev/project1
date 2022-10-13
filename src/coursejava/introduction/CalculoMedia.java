package coursejava.introduction;

import javax.swing.*;

public class CalculoMedia {
    public static void main(String[] args) {

        // pedindo ao usuário para inserir seu nome
        String nomeDoAluno = JOptionPane.showInputDialog("Informe seu nome: ");
        // pedindo ao usuário para inserir o valor da nota para cada variável
        String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
        String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
        String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
        String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");

        // retornará "String" em forma de número, neste caso em "double"
        // usando "double" para número exato da nota
        // Convertendo a string para  double
        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        // calculando a média das quatro notas
        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

        /* verificando se a média é maior ou igual a 5 e se for, está verificando se a média é maior ou igual a 7 se for
           aluno aluno aprovado se não, aluno em recuperação e se não for nenhum dos dois, aluno reprovado */
        if(media >= 5) {
            if(media >= 7) {
                JOptionPane.showMessageDialog(null, nomeDoAluno + " está aprovado(a) com média de: " + media);
            }else {
                JOptionPane.showMessageDialog(null, nomeDoAluno + " está em recuperação com média de: " + media);
            }
        }else {
            JOptionPane.showMessageDialog(null, nomeDoAluno + " está reprovado(a) com média de: " + media);
        }
    }
}
