
import javax.xml.crypto.Data;
import java.util.*;

public class Date {


    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        printDate(date);
       // Random random = new Random();
       // for (int i = 0; i < 50; i++) {
           // System.out.print(random.nextInt(100) + " ");


       // }
        System.out.println();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) +"-"+
                gregorianCalendar.get(GregorianCalendar.MONTH) + "-"
                + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));



    }

    public static void printDate(java.util.Date d) {
        d.setTime(1000);System.out.println(d.toString());
        d.setTime(100000);
        System.out.println(d.toString());
        d.setTime(1000000);
        System.out.println(d.toString());
        d.setTime(10000000);
        System.out.println(d.toString());
        d.setTime(1000000000);
        System.out.println(d.toString());

    }

}
