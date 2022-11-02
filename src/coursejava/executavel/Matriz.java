package coursejava.executavel;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {

        // criando uma matriz com 1 linha e 3 colunas
        int[][] notas = new int[2][3];

        notas[0][0] = 8; // primeira linha e primeira coluna, valor 8
        notas[0][1] = 9; // primeira linha e segunda coluna, valor 9
        notas[0][2] = 7; // primeira linha e terceira coluna, valor 7

        notas[1][0] = 4;
        notas[1][1] = 6;
        notas[1][2] = 3;

        // imprimindo a matriz
        System.out.println(Arrays.deepToString(notas));
    }
}
