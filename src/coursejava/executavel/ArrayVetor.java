package coursejava.executavel;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        // perguntando ao usuário quantas posições o array deve ter
        String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter?");

        // criando um array de doubles com o tamanho do valor da variável "posicoes", convertendo a variavel "posicoes"(String) para "int"
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int pos = 0; pos < notas.length; pos++) {
            String valor = JOptionPane.showInputDialog("Qual o valor da posicao " + (pos + 1) + " ?"); // pedindo ao usuário que insira um valor para o array
            notas[pos] = Double.valueOf(valor); // convertendo o valor da variável "valor" para um double e atribuindo-o ao array
        }

        for (int pos = 0; pos < notas.length; pos++) {  // loop que itera pelo array, iniciando em 0 por conta da primeira posisicao do array
            System.out.println("Nota " + (pos + 1) + ": " + notas[pos]);  // imprimindo os valores do array
        }
    }
}
