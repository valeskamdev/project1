package coursejava.introduction;

public class BreakInFor {
    public static void main(String[] args) {

        // estrutura de repetição "for" usando "break(parada)"
        //  loop "for" imprimirá quando o número for 7 e ao encontrar ira parar a execução
        for (int numero = 0; numero <= 10; numero++) {
            if (numero == 7) {
                System.out.println("Obaaa, encontrei o número " + numero);
                System.out.println("Parando de executar..");
                break;
            }
        }
    }
}
