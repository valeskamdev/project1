package coursejava.executavel;

import coursejava.classes.Aluno;
import coursejava.classes.Diretor;
import coursejava.classes.Pessoa;
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
        secretario.setNome("Nicolas");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("Salário do aluno: " + aluno.salario());
        System.out.println("Salário do diretor: " + diretor.salario());
        System.out.println("Salário do secretário: " + secretario.salario());

       teste(aluno);
       teste(diretor);
       teste(secretario);


       // Pessoa p1 = new Diretor(); ==== POLIMORFISMO
       // Diretor d1 = new Diretor(); ====  SEM POLIMORFISMO

    }


    //
    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa chamado(a) " + pessoa.getNome() + " recebe salário de " + pessoa.salario());
    }
}
