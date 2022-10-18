package principio.responsabilidade;

public class ContaBancaria {

    private String descricao;
    private double saldo = 8000;

    // essa função adiciona 100 reais à variável saldo
    public void soma100Reais() {
        saldo += 100;
    }

    // essa função diminui o valor da variável saldo em 100 reais
    public void diminui100Reais() {
        saldo -= 100;
    }

    // parametro (saque) = a quantia de dinheiro para retirada da conta
    // esta função subtrai o valor do parâmetro do valor da variável saldo
    public void sacarDinherio(double saque) {
        saldo -= saque;
    }

    // parametro (deposito) = o valor para ser depositado
    // essa função adiciona o valor do parâmetro deposito à variável saldo
    public void depositoDinheiro(double deposito) {
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
