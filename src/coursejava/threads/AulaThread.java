package coursejava.threads;

public class AulaThread {

    // maneira de dizer ao compilador que o método pode lançar uma exceção do tipo "InterruptedException"
    public static void main(String[] args) throws InterruptedException {

        for(int pos = 0; pos < 10; pos++) {

            // fazendo o programa esperar 1 segundo antes de executar a próxima linha
            Thread.sleep(1000);
            System.out.println("Executando rotinas, envio de e-mail");
        }
    }
}
