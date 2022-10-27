package coursejava.classes;


import coursejava.interfaces.PermitirAcesso;

// SUBCLASSE
/*
   criando uma classe chamada "Secretário" que herda da classe "Pessoa"
   e implementa a interface "PermitirAcesso"
 */
public class Secretario extends Pessoa implements PermitirAcesso {

    // atributos específico da classe Secretario
    private String registro;
    private String nivelCargo;
    private String experiencia;
    private String login;
    private String senha;



    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretario() {
    }


    // fazendo referências aos atributos
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    //  método que retorna uma representação de string do objeto
    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNasciemnto='" + dataNasciemnto + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    // salário do secretário
    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }

    // método que recebe dois parâmetros e retorna um valor booleano
    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    // verificando se o login e senha é igual à admin
    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }
}
