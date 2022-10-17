package coursejava.classes;

import coursejava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//está é nossa classe que representa o Aluno
public class Aluno {
    // por padrão Java, os atributos estão no tipo "private"
    // modificador de acesso "private" só é acessível dentro do próprio projeto
    //modificador de acesso "public" pode ser acessível a outras classes
    // esses são os >>atributos<< do "Aluno"
    private String nome;
    private int idade;
    private String dataNasciemnto;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    // criando uma nova lista de objetos Disciplina, a classe Aluno tem uma lista de disciplinas
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();  // instânciando o objeto Disciplina (lista), colocar a classe entre os operdores de maior e menor


    // métodos SETTERS e GETTERS do objeto

    // acessa atributos, métodos e contrutures do objeto
    // SET = recebe/define/altera valores
    // GET = retorna valores
    // dentro da main não pode se usar "this"
    // "this." é usado para referenciar a um atributo/ fazer chamada a um método ou alguma variável dentro do próprio objeto

    // "nome" se refere ao parâmetro e "this.nome" se refere ao atributo
    // fazendo referências aos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

    @Override
    //  método que retorna uma representação de string do objeto
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

    // para diferenciar objetos na memória (nesse caso o nome e cpf)
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
}

