package coursejava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date8 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2019-10-05");
        System.out.println("Acrescentando 5 dias: " +  (date = date.plusDays(5)));
        System.out.println("Acrescentando 5 semanas: " + (date = date.plusWeeks(5)));
        System.out.println("Acrescentando 5 anos: " + (date = date.plusYears(5)));
        System.out.println("Acrescentando 2 semanas: " + (date = date.plusWeeks(2)));
        System.out.println("Removendo 1 ano: " + (date = date. minusYears(1)));

        System.out.println("\n-------Fazendo parcelas------\n" );

        for (int mes = 1; mes <= 12; mes++) {
            date = date.plusMonths(1);
            System.out.println("Data do vencimento do boleto: " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " do mes " + mes);
        }
    }
}
