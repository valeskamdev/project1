package coursejava.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formatoSimples = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatoSimples.format(calendar.getTime()));

        System.out.println("Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hora : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto : " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundos : " + calendar.get(Calendar.SECOND));
        System.out.println("Ano : " + calendar.get(Calendar.YEAR));
    }
}
