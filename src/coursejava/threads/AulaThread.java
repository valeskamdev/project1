package coursejava.threads;

import javax.swing.*;

public class AulaThread {

    // maneira de dizer ao compilador que o método pode lançar uma exceção do tipo "InterruptedException"
    public static void main(String[] args) throws InterruptedException {

        // processo paralelo envio de email
        new Thread(() -> {  // função run() é chamada quando o thread é iniciado

            for(int pos = 0; pos < 10; pos++) {

                System.out.println("Executando rotina, envio de e-mail");

                try {
                    Thread.sleep(1000);  // fazendo o programa esperar 1 segundo antes de executar a próxima linha
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // processo paralelo envio de nota fiscal
        new Thread(() -> {  // função run() é chamada quando o thread é iniciado

            for(int pos = 0; pos < 10; pos++) {

                System.out.println("Executando rotina, envio de nota fiscal");

                try {
                    Thread.sleep(2000);  // fazendo o programa esperar 1 segundo antes de executar a próxima linha
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
