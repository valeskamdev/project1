package coursejava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Data2 {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-10"));
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));  // 2021-03-15

        calendar.add(Calendar.MONTH, 2);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));  // 2021-05-15

        calendar.add(Calendar.YEAR, 3);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));  // 2024-05-15
    }
}
