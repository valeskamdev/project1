package coursejava.threads;

import javax.swing.*;
import java.awt.*;

/* estendendo a classe principal (JDialog) para criar uma janela de diálogo. Você pode usar essa classe
   para criar uma caixa de diálogo personalizada ou invocar os vários métodos de classe em JOptionPane */
public class TelaTimeThread extends JDialog {

    public TelaTimeThread() {

        // configuracoes iniciais
        setTitle("Tela time com thread");  // configurando o título da janela
        setSize(new Dimension(240, 240));  // configurando o tamanho da janela
        setLocationRelativeTo(null);  // configurando a localização da janela no centro da tela
        setResizable(false);  // impedindo que o usuário redimensione a janela


        // configuracao final
        setVisible(true);  // tornando a janela visível

    }


}
