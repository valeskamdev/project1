package coursejava.introduction;

public class IfAndElse {
    public static void main(String[] args) {

        int mediaAluno = 9;
        String nome = "Valeska";

        // Verifica se o aluno é aprovado ou não 
        if(mediaAluno >= 7 && nome.equals("Valeska")) {
            System.out.println("PARABÉNS, você está aprovado!");
        }else if(mediaAluno == 6) {
            System.out.println("Você ficará de recuperação!");
        }else {
            System.out.println("Infelizmente você foi reprovado!");
        }

        int nota1 = 5;
        int nota2 = 10;
        int nota3 = 7;
        int nota4 = 8;
        int media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verifica se o aluno está aprovado, em recuperação ou reprovado 
        if(media >= 7) {
            System.out.println("Aluno aprovado! Sua nota foi: " + media);
        }else if(media >= 5 && media <= 6) {
            System.out.println("Aluno em recuperação! Sua nota foi: " + media);
        }else {
            System.out.println("Aluno reprovado! Sua nota foi: " + media);
        }
    }
}
