package coursejava.arquivoTexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entradaArquivo = new FileInputStream(new File("/Users/valeskamarques/IdeaProjects/project1/src/coursejava/arquivoTexto/arquivo.csv"));
        Scanner scanner = new Scanner(entradaArquivo, StandardCharsets.UTF_8);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        // verificando se existe uma próxima linha no arquivo
        while (scanner.hasNext()) {
            String linha = scanner.nextLine();

            // verificando se a linha não é nula e se não está vazia.
            if (linha != null && !linha.isEmpty()) {
                String[] dados = linha.split(";");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0]);
                pessoa.setEmail(dados[1]);
                pessoa.setIdade(Integer.parseInt(dados[2]));

                pessoas.add(pessoa);
            }
        }
        pessoas.forEach(System.out::println);
    }
}
