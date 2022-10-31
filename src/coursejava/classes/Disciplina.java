package coursejava.classes;

import java.util.Arrays;
import java.util.Objects;

// essa classe Disciplina servirá para todos os objetos e instâncias de notas e matérias
public class Disciplina {

    // criando um array de doubles com 4 elementos
    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // soma todos os valores no array e divide o resultado pelo número de elementos no array
    // retornando a média das notas
    public double getMediaNotas() {
        double somaTotal = 0;
        for(int pos = 0; pos < nota.length; pos++) {
            somaTotal += nota[pos];
        }
        return somaTotal / nota.length;
    }

    // para diferenciar/comparar objetos na memória
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Arrays.equals(nota, that.nota) && disciplina.equals(that.disciplina);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(disciplina);
        result = 31 * result + Arrays.hashCode(nota);
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}

