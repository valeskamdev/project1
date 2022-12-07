package coursejava.datas;

import java.time.LocalDate;

public class Data6 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do mes: " + date.getDayOfMonth());
        System.out.println("Dia do ano: " + date.getDayOfYear());
        System.out.println("Nome do mes: " + date.getMonth());
        System.out.println("Ano: " + date.getYear());
    }
}