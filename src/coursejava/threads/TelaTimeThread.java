package coursejava.threads;

import javax.swing.*;
import java.awt.*;

/* estendendo a classe principal (JDialog) para criar uma janela de diálogo. Você pode usar essa classe
   para criar uma caixa de diálogo personalizada ou invocar os vários métodos de classe em JOptionPane */
public class TelaTimeThread extends JDialog {

    public TelaTimeThread() {

        JPanel painel = new JPanel(new GridBagLayout());  // criando um painel de componentes

        JLabel hora = new JLabel(" Nome");  // criando uma etiqueta com o texto "Time da thread 1"
        JTextField tempo = new JTextField();  // criando um campo de texto com o nome "tempo"

        JLabel hora2 = new JLabel(" E-mail");
        JTextField tempo2 = new JTextField();

        // criando dois botões, start e stop
        JButton botao = new JButton("Add lista");
        JButton botao2 = new JButton("Stop");

        // instanciando o objeto fila
        ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

        // configuracoes iniciais
        setTitle("Tela time com thread");  // configurando o título da janela
        setSize(new Dimension(240, 240));  // configurando o tamanho da janela
        setLocationRelativeTo(null);  // configurando a localização da janela no centro da tela
        setResizable(false);  // impedindo que o usuário redimensione a janela

        // gerenciador de layout
        GridBagConstraints gerenciadorLayout = new GridBagConstraints();  // controlar posionamento de componentes
        gerenciadorLayout.gridx = 0;  // configurando a coordenada da posicao em x
        gerenciadorLayout.gridy = 0;  // configurando a coordenada da posicao em y
        gerenciadorLayout.gridwidth = 2;  // definindo a largura do componente para 2
        // Setting the space between the components.
        gerenciadorLayout.insets = new Insets(5, 10, 5, 5);
        gerenciadorLayout.anchor = GridBagConstraints.WEST;  // configurando o alinhamento do componente à esquerda

        // definindo o tamanho da etiqueta "hora" e adicionando ao painel
        hora.setPreferredSize(new Dimension(200, 25));
        painel.add(hora, gerenciadorLayout); // adicionando "hora" e o gerenciador de layout ao painel

        // definindo o tamanho do campo, incrementando a coordenada e adicionando ao painel
        tempo.setPreferredSize(new Dimension(200, 25));  // configurando o tamanho do campo "tempo"
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

        gerenciadorLayout.gridwidth = 1;  // definindo a largura do componente para 1

        // adicionando um botão ao painel
        botao.setPreferredSize(new Dimension(92, 25));
        gerenciadorLayout.gridy++;
        painel.add(botao, gerenciadorLayout);

        // adicionando um botão ao painel
        botao2.setPreferredSize(new Dimension(92, 25));
        gerenciadorLayout.gridx++;
        painel.add(botao2, gerenciadorLayout);

        // executa clique no botao
        botao.addActionListener(e -> {
            ObjetoFilaThread filaThread = new ObjetoFilaThread();
            filaThread.setNome(tempo.getText());
            filaThread.setEmail(tempo2.getText());

            fila.add(filaThread);

        });

        botao2.addActionListener(e -> {

        });

        fila.start();  // iniciando o thread
        add(painel, BorderLayout.WEST);  // adicionando o painel à janela

        // configuracao final
        setVisible(true);  // tornando a janela visível

    }
}
