package coursejava.classes;

// SUPERCLASSE / CLASSE MÃE
/* abstract = para impedir que a superclasse possa ser instanciada,
   apenas herdada, serve apenas como um "modelo" nã podendo trabalhar
   com a classe abstrata (abstração)
 */
public abstract class Pessoa {

     /*
        MODIFICADORES:

        PUBLIC = podendo ser acessado em qualquer classe
        PRIVATE = podendo ser acessado na própria classe
        PROTECTED = acessível a própria classe (mãe) e classes filhas
     */

    /*
        THIS e SUPER

        THIS = faz referência à própria classe
        SUPER = faz referência à classe mãe
        SUPER() = chama o construtor da classe mãe

     */


    protected String nome;
    protected int idade;
    protected String dataNasciemnto;
    protected String registroGeral;
    protected String numeroCpf;
    protected String nomeMae;
    protected String nomePai;


    // fazendo referências aos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNasciemnto() {
        return dataNasciemnto;
    }

    public void setDataNasciemnto(String dataNasciemnto) {
        this.dataNasciemnto = dataNasciemnto;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public boolean pessoaMaiorIdade() {
        return idade >= 18;
    }
}
