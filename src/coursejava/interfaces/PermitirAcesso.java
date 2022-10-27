package coursejava.interfaces;

// criando uma interface, será o nosso contarto de autenticação
public interface PermitirAcesso {

    /*
      declarção de método, retornando um valor booleano que indica se
      o usuário está autenticado ou não, parametro com login e senha
     */
    public boolean autenticar(String login, String senha);


}
