package course;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stackOfIntegers.push(i);
        System.out.println(Arrays.toString(stackOfIntegers.getElements()));


        while (!stackOfIntegers.empty())
            System.out.print(stackOfIntegers.pop() + " ");
        System.out.println();
        System.out.println(Arrays.toString(stackOfIntegers.getElements()));

           Integer x = 3 + new Integer(5);
        System.out.println(x);
        Double  y = 3.5;
        System.out.println(y.doubleValue());
        System.out.println(y.compareTo(4.5));
        Double doubleInteger =  Double.valueOf("12.4");
        Integer integerInt = Integer.valueOf("12");
        System.out.println(integerInt);
        System.out.println(doubleInteger);
        System.out.println(Integer.parseInt("11", 2));
        BigInteger a = new BigInteger("92919394959697949393");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b);
        System.out.println(c);
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        BigDecimal bigDecimal3 = bigDecimal1.divide(bigDecimal2, 10, BigDecimal.ROUND_UP);
        System.out.println(bigDecimal3);
        java.math.BigInteger d = new java.math.BigInteger("3");
        java.math.BigInteger f = new java.math.BigInteger("7");
        java.math.BigInteger z = d.add(f);
        System.out.println(d);
        System.out.println(f);
        System.out.println(z);
        System.out.println("50! is \n" + factorial(50));

        String message = "Welcome";
        System.out.println( message.replaceAll(message, "weldone"));
        System.out.println(message.replaceFirst("W", "r"));
        System.out.println(message.replace("e","ab"));

        String[] token = "Java#Html#Perl".split("#Html#");
        for (int i = 0; i < token.length; i++)
            System.out.print(token[i] + " ");
        System.out.println();

        String aPhrase = "Java is fun";
        System.out.println(aPhrase.matches("Java.*"));
        System.out.println("java".equals("java"));

        String numericString = "440-02-4534";
        System.out.println(numericString.matches("\\d{3}-\\d{2}-\\d{4}"));
        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s);
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println();
        char[] chars = "java".toCharArray();
        for (int i = 0; i < chars.length; i++)
         System.out.print(chars[i]);
        System.out.println();
        System.out.println(chars[0]);

        char[] dst = {'j','a','v','a','1','3','0','1'};
        "CS3720".getChars(2,6,dst,4);
        System.out.println(dst);
        char[] chars1 = {'b','i','g','g','u','y'};
        "boy".getChars(0,3,chars1,3);
        System.out.println(chars1);
        String s1 = new String(new char[]{'m','e','n'});
        System.out.println(s1);



        String words = new String(new char[]{'g','u','y'});
        System.out.println(words);
        String word = String.valueOf("Market");
        System.out.println(word);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome To Java");
        System.out.println(stringBuilder);


        //stringBuilder.insert(11, "HTML and ");
       // System.out.println(stringBuilder);
        //stringBuilder.insert(11,30);
        //stringBuilder.delete(8,11);
        stringBuilder.replace(11, 15, "HTML" );
        stringBuilder.setCharAt(11,'h');
        System.out.println(stringBuilder);

        Integer[] list1 = {7,8,9};
        Double[] list2 = {7.0,8.0,6.8};
        int[] list3 = {7,5,6};

       Calendar calendar = new GregorianCalendar(2001, 8, 11);
       String[] dayNameOfweek ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
        System.out.println("September 11, 2001 is a " +
                dayNameOfweek[calendar.get(Calendar.DAY_OF_WEEK)-1]);
        


    }

    public static void printArray(Object[] list){
        for (Object o: list)
            System.out.print(o + " ");
        System.out.println();
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
             result = result.multiply(new BigInteger(i + ""));
        return result;
    }


}
