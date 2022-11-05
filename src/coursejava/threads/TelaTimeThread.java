package coursejava.threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* estendendo a classe principal (JDialog) para criar uma janela de diálogo. Você pode usar essa classe
   para criar uma caixa de diálogo personalizada ou invocar os vários métodos de classe em JOptionPane */
public class TelaTimeThread extends JDialog {

    public TelaTimeThread() {

        JPanel painel = new JPanel(new GridBagLayout());  // criando um painel de componentes

        JLabel hora = new JLabel(" Time da thread 1");  // criando uma etiqueta com o texto "Time da thread 1"
        JTextField tempo = new JTextField();  // criando um campo de texto com o nome "tempo"

        JLabel hora2 = new JLabel(" Time da thread 2");
        JTextField tempo2 = new JTextField();

        // criando dois botões, start e stop
        JButton botao = new JButton("Start");
        JButton botao2 = new JButton("Stop");

         Runnable thread1 = new Runnable() {
            @Override
            public void run() {

                // o comentário abaixo diz a IDE para ignorar o aviso de que o loop é infinito
                //noinspection InfiniteLoopStatement
                while (true) {
                    // configurando o campo de texto para data e hora atuais
                    tempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));

                    // fazendo o thread parar de executar por um intervalo de 1 segundo

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            };

        final Thread[] thread1Time = new Thread[1];

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
        tempo.setEditable(false);  // tornando o campo de texto não editável
        painel.add(tempo, gerenciadorLayout);  // adicionando "tempo" e o gerenciador de layout ao painel

        // definindo o tamanho da etiqueta, incrementando a coordenada e adicionando ao painel
        hora2.setPreferredSize(new Dimension(200, 25));
        gerenciadorLayout.gridy++;
        painel.add(hora2, gerenciadorLayout);

        // definindo o tamanho do campo, incrementando a coordenada e adicionando ao painel
        tempo2.setPreferredSize(new Dimension(200, 25));
        gerenciadorLayout.gridy++;
        tempo2.setEditable(false);
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
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time[0] = new Thread(thread1);
                thread1Time[0].start(); // iniciando a thread
            }
        });

        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time[0].stop();  // parando a thread
            }
        });

        add(painel, BorderLayout.WEST);

        // configuracao final
        setVisible(true);  // tornando a janela visível

    }
}
