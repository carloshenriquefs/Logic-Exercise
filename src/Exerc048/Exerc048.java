package Exerc049;


import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Exerc049 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        var mes = Integer.parseInt(firstMultipleInput[0]);
        var dia = Integer.parseInt(firstMultipleInput[1]);
        var ano = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(mes, dia, ano);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.close();
        bufferedReader.close();

    }
}

class Result {
    public static String findDayOne(int mes, int dia, int ano) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH, mes - 1);
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.YEAR, ano);

        String[] da_of_week = {
                "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return da_of_week[cal.get(Calendar.DAY_OF_MONTH) - 2];
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG, Locale.US).toUpperCase();
    }
}
