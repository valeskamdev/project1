package coursejava.classesauxiliares;

// receber somente alguem que tenha o contrato da interface de "PermitirAcesso"
import coursejava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    // objeto que implementa a interface PermitirAcesso"
    private PermitirAcesso permitirAcesso;

    // retorna a função autenticar() do objeto permitirAcesso
    public boolean autenticar() {
        return permitirAcesso.autenticar();
    }

    // construtor
    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }

}
