package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Diretor;
import coursejava.classes.Secretario;

public class ClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setNomeEscola("Jdev - Treinamentos");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123456788");
        diretor.setNome("Paulo");
        diretor.setIdade(48);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("9876543211");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());
    }
}
