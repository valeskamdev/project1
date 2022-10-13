package coursejava.introduction;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        int numero =0;

        //estrutura de repetição while(enquanto for verdadeiro)
        //repetir a condição até que execute false
        //verifica e depois executa
        // loop while imprimirá o número até chegar a 10
        while (numero <= 4) {
            System.out.println("O número atual é : " + numero);
            // Incrementando o valor de "numero" em 1
            numero++;
        }

        int numero2 = 0;

        //primeiro executa depois verifica
        do {
            System.out.println("O número atual é : " + numero2);
            numero2++;
        }while(numero2 <= 4);
    }
}
