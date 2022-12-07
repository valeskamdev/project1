package coursejava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dataVencimento = simpleDateFormat.parse("2021-10-10");
        Date dataAtual = simpleDateFormat.parse("2021-10-10");

        // comprarando datas e imprimindo resultados
        if (dataVencimento.after(dataAtual)) {
            System.out.println("O boleto não foi vencido");
        } else if (dataVencimento.equals(dataAtual)) {
            System.out.println("Ultimo dia do pagamento");
        } else {
            System.out.println("Boleto vencido");
        }
    }
}
