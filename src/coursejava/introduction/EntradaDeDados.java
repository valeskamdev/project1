package coursejava.introduction;

import javax.swing.*;

public class EntradaDeDados {

    public class EntrandaDeDados {
        public static void main(String[] args) {
          /*
          Um programa que pede ao usuário para inserir o número de carros e pessoas,
          então divide o número de carros pelo número de pessoas e exibe o resultado
          */

            // para usar "JOptionPane" temos que importar primeiro o pacote "javax.swing."
            //caixa de entrada
            // ".showInputDialog" = exibe uma caixa solicitando a entradada de dados
            // "JOptionPane" uma classe que nos permite criar caixas de diálogo (retorna String)
            String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
            String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

            //convertendo String para double
            double carroNumero = Double.parseDouble(carros);
            double pessoaNumero = Double.parseDouble(pessoas);
            int divisao = (int) (carroNumero / pessoaNumero); // "(int)" está convertendo a divisão para inteiro, ex: 4.5 == 4
            double resto = carroNumero % pessoaNumero; // resto da divisão

            //caixas de saída
            // ".showMessageDialog" = Informa ao usuário com uma caixa de diálogo de mensagem de informação
            if (resto > 1) {
                JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobraram " + resto + " carros");
            } else if (resto == 1) {
                JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carro");
            } else {
                JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carro e sem sobras");
            }
        }
    }
}
