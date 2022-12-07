package coursejava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data4 {
    public static void main(String[] args) throws ParseException {

        Date dataInicial = new SimpleDateFormat("yyyy-MM-dd").parse("2021-04-08");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicial);

        for (int parcela = 1; parcela <= 12; parcela++) {
            calendar.add(Calendar.MONTH, 1);
            System.out.println("Parcela numero: " + parcela + ", vencimento: " + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        }

    }
}
