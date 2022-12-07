package coursejava.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data3 {
    public static void main(String[] args) throws ParseException {

        // calculando a quantidade de dias entre essas datas
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
        System.out.println(dias);
    }
}
