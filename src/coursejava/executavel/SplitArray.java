package coursejava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String[] args) {

        String texto = "Eliseu, Java, 8, 7, 9, 8.9";

        // dividindo a String em um array(split), separando-os por vírgulas
        String[] valoresArray = texto.split(",");

        // imprimindo os valores do array
        System.out.println("Nome: " + valoresArray[0]);
        System.out.println("Curso: " + valoresArray[1]);
        System.out.println("Nota 1: " + valoresArray[2]);
        System.out.println("Nota 2: " + valoresArray[3]);
        System.out.println("Nota 3: " + valoresArray[4]);
        System.out.println("Nota 4: " + valoresArray[5]);

        System.out.println("\n");

        // convertendo um array em uma lista
        List<String> lista = Arrays.asList(valoresArray);
        for (String valorString : lista) {
            System.out.println(valorString);
        }

        System.out.println("\n");

        //convertendo lista para array
        String[] conversaoArray = lista.toArray(new String[6]);
        System.out.println(Arrays.toString(conversaoArray));  // imprimindo um array
    }
}
