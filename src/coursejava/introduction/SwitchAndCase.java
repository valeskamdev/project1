package coursejava.introduction;

public class SwitchAndCase {
    public static void main(String[] args) {

        // "switch case" serve para operações exatas, variavel dentro do parenteses
        //valor da variável passada no switch é comparado com os valores fornecidos em cada case
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            //código será executado se todos os cases não forem aceitos
            default:
                System.out.println("Outro dia qualquer");
                break;
        }

    }
}
