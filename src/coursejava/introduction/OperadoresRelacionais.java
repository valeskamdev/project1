package coursejava.introduction;

public class OperadoresRelacionais {
    public static void main(String[] args) {

         /*
             ==   igual
             !=   diferente
             <    menor
             >    maior
             <=   menor ou igual
             >=   maior ou igual
         */

        int nota1 = 9;
        int nota2 = 11;

        // Comparar duas variáveis e imprimir uma mensagem se forem diferentes
        if(nota1 != nota2) {
            System.out.println("As notas são diferentes");  //result = true
        }else {
            System.out.println("As notas não são diferentes");
        }

        // Comparando o valor de "nota1" e "nota2" e imprimindo uma mensagem se são iguais ou não
        if(nota1 == nota2) {
            System.out.println("As notas são iguais");
        }else {
            System.out.println("As notas não são guais");  //result = false
        }

        // Compararndo o valor de "nota1" e "nota2" e imprimir se é menor ou não
        if(nota1 < nota2) {
            System.out.println("Este número é menor");  // result = true
        }else {
            System.out.println("Este número não é maior");
        }

        // Comparando o valor de "nota1" e "nota2" e imprimindo se é maior ou não
        if(nota1 > nota2) {
            System.out.println("Este número é maior");
        }else {
            System.out.println("Este número não é maior");  // result = false
        }

        //  Comparando o valor de "nota1" e "nota2" e imprimindo se for menor ou igual
        if(nota1 <= nota2) {
            System.out.println("Este número é menor ou igual");  // result = true
        }else {
            System.out.println("Este número não é menor ou igual");
        }

        // Comparando o valor de "nota1" e "nota2" e imprimindo se for maior ou igual
        if(nota1 >= nota2) {
            System.out.println("Este número é maior ou igual");
        }else {
            System.out.println("Este número não é maior ou igual");  // result = false
        }
    }
}
