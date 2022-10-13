package coursejava.introduction;

public class OperadorTernarioSimples {
    public static void main(String[] args) {

        int nota1 = 5;
        int nota2 = 10;
        int nota3 = 7;
        int nota4 = 8;
        int media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        String saidaResultado;
        // um operador ternário, é uma maneira curta de escrever uma instrução if/else
        //  ? = if     : = else
        saidaResultado = media >= 7 ? "Aluno aprovado" : "Aluno reprovado";
        System.out.println(saidaResultado);

    }
}
