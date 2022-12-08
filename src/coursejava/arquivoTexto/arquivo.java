package coursejava.arquivoTexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivo {
    public static void main(String[] args) throws IOException {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setEmail("pessoa1@gmail.com");
        pessoa1.setIdade(19);
        pessoa1.setNome("Flora");

        pessoa2.setEmail("pessoa2@gmail.com");
        pessoa2.setIdade(31);
        pessoa2.setNome("Erick");

        pessoa3.setEmail("pessoa3@gmail.com");
        pessoa3.setIdade(25);
        pessoa3.setNome("Jose");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa3);
        pessoas.add(pessoa3);

        File arquivo = new File("/Users/valeskamarques/IdeaProjects/project1/src/coursejava/arquivoTexto/arquivo.txt");

        // verificando se o arquivo existe.
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        for (Pessoa p : pessoas) {
            escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }

        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}
