package coursejava.threads;

import java.util.Objects;

public class ObjetoFilaThread {

    private String nome;
    private String email;

    // criando referências (set e get)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // diferenciando objetos na memoria
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoFilaThread that = (ObjetoFilaThread) o;
        return nome.equals(that.nome) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
