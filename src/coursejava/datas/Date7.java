package coursejava.datas;

import java.time.LocalDate;
import java.time.Period;

public class Date7 {
    public static void main(String[] args) {

        LocalDate dataAntiga  = LocalDate.of(2020, 2, 7);
        LocalDate dataNova = LocalDate.of(2021, 7, 4);

        System.out.println("Data antiga maior que da nova? " + dataAntiga.isAfter(dataNova));
        System.out.println("Data antiga eh anterior a nova? " + dataAntiga.isBefore(dataNova));
        System.out.println("Data antiga eh igual a nova? " + dataAntiga.equals(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);
        System.out.println(periodo.getYears() + " ano, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
    }
}
