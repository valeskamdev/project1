package coursejava.classes;

import coursejava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/*
    Herança (extends), criar classes que herdam atributos e métodos de outras classes
    evitando rescrita de código chamado HERANÇA. Para representarmos esse tipo na linguagem
    ultilizamos a palavra reservada >>extends<<
 */

// SUBCLASSE (filha)
// criando uma classe chamada "Aluno" que herda da classe "Pessoa"
public class Aluno extends Pessoa {

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    // criando uma nova lista de objetos Disciplina, a classe Aluno tem uma lista de disciplinas
    // instânciando o objeto Disciplina (lista), colocar a classe entre os operdores de maior e menor
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();


    /*
        Métodos SETTERS e GETTERS do objeto (modificadores de acesso)

     acessa atributos, métodos e contrutures do objeto. Servem para pegarmos
     informações de variáveis da classe definidas como >>private<<

     SET = recebe/define/altera valores
     GET = retorna valores

     */

    // fazendo referências aos atributos
    public void setNome(String nome) {
        super.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        super.idade = idade;
    }

    public String getDataNasciemnto() {
        return dataNasciemnto;
    }

    public void setDataNasciemnto(String dataNasciemnto) {
        super.dataNasciemnto = dataNasciemnto;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        super.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        super.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        super.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        super.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    // fazendo referêndcia ao objeto lista Disciplina
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // método que retorna a média das quatro notas do aluno que está na lista de objetos Disciplinas
    public double getMediaNota() {

        double somaNotas =0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas +=  disciplina.getNota();  // adicionando o valor das notas que se encontra no objeto Disciplina para "somaNotas"
        }
        return somaNotas / disciplinas.size();  // as notas sarão divididas pela quantidade de objetos dentro da lista
    }

    // definindo se o aluno está aprovado, em recuperação ou reprovado
    public String getAlunoAprovado() {
        double media = this.getMediaNota();
        if(media >= 5) {
            if(media >= 7) {
                return StatusAluno.APROVADO;
            }else {
                return StatusAluno.RECUPERACAO;
            }
        }else {
            return StatusAluno.REPROVADO;
        }
    }

    //  método que retorna uma representação de string do objeto
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNasciemnto='" + dataNasciemnto + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                '}';
    }

    // para diferenciar objetos na memória (nesse caso nome e cpf)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getNome().equals(aluno.getNome()) && getNumeroCpf().equals(aluno.getNumeroCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroCpf());
    }

    /*
    @override = indentifica método sobrescrito da superclasse (annotation), usado
    para informar ao compilador que o método está substituindo um método na superclasse
     */

    // retorna true se a pessoa tiver 15 anos ou mais, false caso contrário.

    @Override
    public boolean pessoaMaiorIdade() {
        return super.pessoaMaiorIdade();
        /*
        poderiamos colocar:  return idade >= 15;
        nesse caso não teria @override, porque NÃO estaria subescrito
         */
    }

    public String msgMaiorIdade() {
        return this.pessoaMaiorIdade() ? "Aluno maior de idade!" : "Aluno menor de idade!";
    }
}

