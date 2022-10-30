package coursejava.excecao;

// criando uma nova classe de exceção.
public class ExcecaoProcessarNota extends Exception {

    public ExcecaoProcessarNota(String erro) { // construtor
        super("Erro ao processar as notas dos alunos: " + erro); // chamando o construtor da superclasse
    }
}
