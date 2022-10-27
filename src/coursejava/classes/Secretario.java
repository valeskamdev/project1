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

    // método do contrato de autenticação
    // método que retorna um valor booleano, verificando se o login e a senha são iguais a "admin"
    @Override
    public boolean autenticar(String login, String senha) {
        return login.equals("admin") && senha.equals("admin");
    }
}
