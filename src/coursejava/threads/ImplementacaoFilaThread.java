package coursejava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

// estendendo de uma classe thread para usar os recursos
public class ImplementacaoFilaThread extends Thread{

    // criando uma fila do tipo "ConcurrentLinkedQueue"
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();
    public static void add(ObjetoFilaThread filaThread) {
        pilha_filha.add(filaThread);
    }

    @Override
    // usando um iterador sincronizado para processar uma fila
    public void run() {
        // interagir para percorrer na fila
        Iterator<ObjetoFilaThread> intercao = pilha_filha.iterator();

        // bloqueando o iterador para que apenas um thread possa acessá-lo por  (evitando que outros processos entrem e atrapalhem)
        synchronized (intercao) {

            while (intercao.hasNext()) {  // enquanto tiver dados em fila ira processar
                ObjetoFilaThread processar = intercao.next();  // obtendo o próximo item na fila

                /*
                processos demorados

               -processar 10mil notas fiscais
               -gerar uma lista enorme dw PDF
               -gerar envios em massa de emails
                 */

                System.out.println(processar.getEmail());
                System.out.println(processar.getNome());

                //depois de processar, remove o item atual da fila
                intercao.remove();

                // tempo de descarga de memoria (ESSENCIAL)
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // tempo limpeza de memoria
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
