package coursejava.executavel;

public class ArrayVetor {

    public static void main(String[] args) {

        // criando um array de 4 elementos do tipo double
        double[] notas = new double[4];

        // atribuindo valores nas posicoes do array
        notas[0] = 7.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

        for (int pos = 0; pos < notas.length; pos++) {  // loop que itera pelo array, iniciando em 0 por conta da primeira posisicao do array
            System.out.println("Nota " + (pos + 1) + ": " + notas[pos]);  // imprimindo os valores do array
        }
    }
}
