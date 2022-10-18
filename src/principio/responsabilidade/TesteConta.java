package principio.responsabilidade;

public class TesteConta {
    public static void main(String[] args) {

        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Conta bancaria do Marques");
        System.out.println(bancaria);

        bancaria.diminui100Reais();
        System.out.println(bancaria);

        bancaria.sacarDinherio(400);
        System.out.println(bancaria);

        bancaria.depositoDinheiro(1000);
        System.out.println(bancaria);
    }
}
