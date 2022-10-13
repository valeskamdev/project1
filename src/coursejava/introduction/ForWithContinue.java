package coursejava.introduction;

public class ForWithContinue {
    public static void main(String[] args) {

        // imprimindo os números de 0 a 10, mas quando encontra os números 6, 7 e 9
        for (int numero = 0; numero <= 10; numero++) {
            if (numero == 6 || numero == 7 || numero == 9) {
                System.out.println("Obaaa, encontrei o número " + numero);
                //"continue" não executa códigos abaixo dele ,e sim, retorna para o "for"
                continue;
            }
            System.out.println("Processando laço de repetição do número: " + numero);
        }
    }
}
