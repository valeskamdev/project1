package coursejava.threads;

public class AulaThread {

    // maneira de dizer ao compilador que o método pode lançar uma exceção do tipo "InterruptedException"
    public static void main(String[] args) throws InterruptedException {

        // transformando thread's em objetos manipulaveis, usando "Runnable"
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();

    }

    // processo paralelo envio de nota fiscal
    // criando uma nova thread
    private static final Runnable thread1 = () -> {

        for (int pos = 0; pos < 10; pos++) {

            System.out.println("Executando rotina, envio de nota fiscal");

            try {
                Thread.sleep(2000);  // fazendo o programa esperar 1 segundo antes de executar a próxima linha
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    };

    // processo paralelo envio de e-mail
    // criando uma nova thread
    private static final Runnable thread2 = () -> {

        for (int pos = 0; pos < 10; pos++) {

            System.out.println("Executando rotina, envio de e-mail");

            try {
                Thread.sleep(2000);  // fazendo o programa esperar 1 segundo antes de executar a próxima linha
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    };

}

