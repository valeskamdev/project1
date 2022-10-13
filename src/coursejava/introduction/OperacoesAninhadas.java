package coursejava.introduction;

public class OperacoesAninhadas {
    public static void main(String[] args) {

        int nota1 = 10;
        int nota2 = 10;
        int nota3 = 10;
        int nota4 = 10;
        int media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //operacao aninhada (operações dentro de operações)

         /*
             Se a média do aluno for maior ou igual a 5, então se a média do aluno for maior ou igual a 7,
             então se a média do aluno for maior que 9, imprima "Aluno aprovado imediatamente, PARABÉNS!,
             senão imprimir "Aluno é aprovado diretamente!, senão imprimir "Aluno está em recuperação!
             senão imprimir "Aluno reprovado diretamente!
          */

        if (media >= 5) {
            if (media >= 7) {
                if (media > 9) {
                    System.out.println("Aluno está aprovado imediatamente, PARABÉNS! Sua nota foi: " + media);
                } else {
                    System.out.println("Aluno está aprovado diretamente! Sua nota foi: " + media);
                }
            } else {
                System.out.println("Aluno está em recuperação! Sua nota foi: " + media);
            }
        } else {
            System.out.println("Aluno reprovado direto! Sua nota foi: " + media);
        }
    }
}
