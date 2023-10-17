package abstractclass;

import java.math.BigInteger;
import java.util.Arrays;

public class MainParents {
    public static void main(String[] args) {
        Son son = new Son(12, "John");
        son.parentsFirstSon();
        son.parentsFirstDaughter();

        Daughter daughter = new Daughter(14, "Lucia");

        daughter.parentsFirstDaughter();
        daughter.parentsFirstSon();

        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("11", 2));
        Integer[] intArray = {1, 2, 3};
        System.out.println(intArray);
        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]);

        System.out.println(factorial(50));
        System.out.println(BigInteger.ONE.multiply(new BigInteger(49 + "")));

        System.out.println("welcome".replace("e", "a"));
        System.out.println("welcome".replaceAll("welcome", "unicorn"));
        System.out.println("welcome".replaceFirst("e", "a"));

        String[] token = "Java#HTML#Perl".split("#HTML#");
        for (int i = 0; i < token.length; i++)
            System.out.print(token[i] + " ");
        System.out.println();

        System.out.println("java".matches("java"));
        System.out.println("java".equals("java"));
        System.out.println("java is fun".matches("java.*"));
        System.out.println("444-02-4014".matches("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println("a+b$#c".replaceAll("[$+#]", "NNN"));
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println();
        char[] chars = "java".toCharArray();
        for (int i = 0; i < chars.length; i++)
            System.out.print(chars[i]);
        System.out.println();
        String str = new String(new char[]{'j', 'a', 'v', 'a'});
        System.out.println(str);
        String strr = String.valueOf(new char[]{'j', 'a', 'v', 'a'});
        System.out.println(strr);

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 'b');
        System.out.println((char) ('a' + 5));
        System.out.println(String.valueOf(5.44));
        alphabet();

        char[] dst = {'J', 'a', 'v', 'a', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 1);
        System.out.println(dst);

        String s1 = "welcome".replace('e', 'E');
        System.out.println(s1);
        String s2 = s1;
        System.out.println(s2);

        String[] tokenss = "Welcome To Java And HTML".split("Java And HTML");
        for (int i = 0; i < tokenss.length; i++)
            System.out.print(s1 = tokenss[i] + " ");
        System.out.println();
        System.out.print(s2 = s1);
        System.out.println();


        String test = "ABC";
        System.out.println(test.toLowerCase());

        String text = "Hi, ABC, good";
        System.out.println(text.matches(".*ABC.*"));


        String s = "Hi, Good Morning";
        System.out.println(m(s));

        Integer[] list1 = {1, 2, 3, 4,};
        Double[] list2 = {7.0, 8.0, 9.0};
        String[] list3 = {"5", "3", "4"};

        printArray(list1);
        printArray(list2);
        printArray(list3);



    }


    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        return result;
    }

    public static void alphabet() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);

    }

    public static int m(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;

        return count;

    }

    public static void printArray(Object[] list) {

        for (Object o : list)
            System.out.print((o + ""));
        System.out.println();
    }

}


