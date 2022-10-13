package coursejava.introduction;

public class OperacoesEntreNumerosInteiros {
    public static void main(String[] args) {

        // "int"  trata-se de um valor inteiro
        int nota1 = 9;
        int nota2 = 7;
        int nota3 = 5;
        int nota4 = 8;
        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média das notas = " + media); //média com número inteiro
        System.out.println("Média das notas = " + nota1 + nota2 + nota3 + nota4); // um número do lado do outro
        System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4)); //soma dos numeros
    }
}
