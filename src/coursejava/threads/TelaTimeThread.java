package coursejava.threads;

import javax.swing.*;
import java.awt.*;

/* estendendo a classe principal (JDialog) para criar uma janela de diálogo. Você pode usar essa classe
   para criar uma caixa de diálogo personalizada ou invocar os vários métodos de classe em JOptionPane */
public class TelaTimeThread extends JDialog {

    public TelaTimeThread() {

        JPanel painel = new JPanel(new GridBagLayout());  // criando um painel de componentes

        JLabel hora = new JLabel("Time da thread 1");  // criando uma etiqueta com o texto "Time da thread 1"
        JTextField tempo = new JTextField();  // criando um campo de texto com o nome "tempo"

        JLabel hora2 = new JLabel("Time da thread 2");
        JTextField tempo2 = new JTextField();

        // configuracoes iniciais
        setTitle("Tela time com thread");  // configurando o título da janela
        setSize(new Dimension(240, 240));  // configurando o tamanho da janela
        setLocationRelativeTo(null);  // configurando a localização da janela no centro da tela
        setResizable(false);  // impedindo que o usuário redimensione a janela

        // gerenciador de layout
        GridBagConstraints gerenciadorLayout = new GridBagConstraints();  // controlar posionamento de componentes
        gerenciadorLayout.gridx = 0;  // configurando a coordenada da posicao em x
        gerenciadorLayout.gridy = 0;  // configurando a coordenada da posicao em y

        // definindo o tamanho da etiqueta "hora" e adicionando ao painel
        hora.setPreferredSize(new Dimension(200, 25));
        painel.add(hora, gerenciadorLayout); // adicionando "hora" e o gerenciador de layout ao painel

        // definindo o tamanho do campo, incrementando a coordenada e adicionando ao painel
        tempo.setPreferredSize(new Dimension(200, 25));  // configurando o tamanho do rótulo "tempo"
        gerenciadorLayout.gridy++;  // incrementando a coordenada y do gerenciador de layout
        painel.add(tempo, gerenciadorLayout);  // adicionando "tempo" e o gerenciador de layout ao painel

        // definindo o tamanho da etiqueta, incrementando a coordenada e adicionando ao painel
        hora2.setPreferredSize(new Dimension(200, 25));
        gerenciadorLayout.gridy++;
        painel.add(hora2, gerenciadorLayout);

        // definindo o tamanho do campo, incrementando a coordenada e adicionando ao painel
        tempo2.setPreferredSize(new Dimension(200, 25));
        gerenciadorLayout.gridy++;
        painel.add(tempo2, gerenciadorLayout);

        add(painel, BorderLayout.WEST);  // colocando o texto(painel) no lado esquerdo

        // configuracao final
        setVisible(true);  // tornando a janela visível

    }


}
