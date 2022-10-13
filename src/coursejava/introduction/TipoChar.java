package coursejava.introduction;

public class TipoChar {
    public static void main(String[] args) {

        //"char" representa um letra ou um caracter (colocar em aspas simples = '')
        char pessoaFisica = 'F';
        char pessoaJuridica = 'J';
        char pessoaMaculino = 'M';

        if(pessoaMaculino == 'F') {
            System.out.println("Maculino");
        }else {
            System.out.println("Feminino");
        }
    }
}
