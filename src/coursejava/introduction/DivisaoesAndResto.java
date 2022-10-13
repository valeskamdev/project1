package coursejava.introduction;

public class DivisaoesAndResto {
    public static void main(String[] args) {

        double carro = 9;
        double pessoa = 2;
        double resto = carro % pessoa;  // retornará o resto/MOD

        System.out.println("Sobraram exatamente: " + resto + " carros");  // result = 1.0

        int numero1 = 9;
        int numero2 = 2;
        int divisao = 9 / 2;  // retornará s divisão e não o resto

        System.out.println("divisão entre esses números é: " + divisao);  // result = 4
    }
}
