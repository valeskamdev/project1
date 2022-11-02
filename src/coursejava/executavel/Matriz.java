package coursejava.executavel;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {

        // criando uma matriz com 2 linhas e 3 colunas
        int[][] notas = new int[2][3];

        notas[0][0] = 8; // primeira linha e primeira coluna, valor 8
        notas[0][1] = 9; // primeira linha e segunda coluna, valor 9
        notas[0][2] = 7; // primeira linha e terceira coluna, valor 7

        notas[1][0] = 4; // segunda linha e primeira coluna, valor 4
        notas[1][1] = 6;
        notas[1][2] = 3;

        for (int posLinha = 0; posLinha < notas.length; posLinha++) {  // percorrendo linhas
             System.out.println("Na linha " + (posLinha + 1) + " temos os valores:");  // imprimindo o número de linhas

            for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {  // percorrendo colunas
                System.out.println(notas[posLinha][posColuna]);  // imprimindo o valor do array na posição de cada coluna pelas linhas
            }
        }
    }
}
