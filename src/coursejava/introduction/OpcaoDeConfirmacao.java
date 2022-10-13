package coursejava.introduction;

import javax.swing.*;

public class OpcaoDeConfirmacao {
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

        //convertendo String para double
        double carroNumero = Double.parseDouble(carros);
        double pessoaNumero = Double.parseDouble(pessoas);
        int divisao = (int) (carroNumero / pessoaNumero); // "(int)" está convertendo a divisão para inteiro, ex: 4.5 == 4
        double resto = carroNumero % pessoaNumero; // resto da divisão

        //retorna int(inteiro)
        // ".showConfirmDialog" = Faz uma pergunta de confirmação, como sim/não/cancelar.
        // Perguntar ao usuário se ele deseja ver o resultado da divisão e resto
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

        if (resposta == 0) { // "0" exibe o resultado da divisão  (encontrado na documentação de "JOptionPane")
            JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
        }else {
            System.out.println("Não quis ver o resultado.");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?"); // usando a mesma variável, pois ira fazer a mesma coisa, mas com outra pergunta

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto);
        }else {
            System.out.println("Não quis ver o resto.");
        }
    }
}
