package coursejava.classes;

import java.util.Objects;

// essa classe Disciplina servirá para todos os objetos e instâncias de notas e matérias
public class Disciplina {
    // atributos do objeto Displina
    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // para diferenciar/comparar objetos na memória
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(that.getNota(), getNota()) == 0 && getDisciplina().equals(that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNota(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}

