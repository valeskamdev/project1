package coursejava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Data5 {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Dia: " + dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora: " + horaAtual);

        LocalDateTime  dataAtualEHoraAtual = LocalDateTime.now();
        System.out.println("Hora e data: " + dataAtualEHoraAtual);
    }
}
