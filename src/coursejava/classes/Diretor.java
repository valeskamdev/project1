package coursejava.classes;

import coursejava.interfaces.PermitirAcesso;

// SUBCLASSE (filha)
// criando uma classe chamada "Diretor" que herda da classe "Pessoa"
// implementando a interface "PermitirAcesso"
public class Diretor extends Pessoa implements PermitirAcesso {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;
    private String login;
    private String senha;

    public Diretor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // construtor para classe  "ClassesFilhas"
    public Diretor() {
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    //  método que retorna uma representação de string do objeto
    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNasciemnto='" + dataNasciemnto + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    // salário do diretor
    @Override
    public double salario() {
        return 3900.78;
    }

    // método que recebe dois parâmetros, login e senha, e retorna um booleano
    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    // verificando se o login e senha é igual à admin
    @Override
    public boolean autenticar() {
        return login.equals("leska") && senha.equals("123");
    }
}
