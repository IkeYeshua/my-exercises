import java.util.Date;

public class TestCount {
    private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];
        System.out.println(dates[0]);

        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println("i + j is " + i + j);
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
       // System.out.println(dates[0].toString());
       // Count myCount = new Count();
        //int times = 0;
        //for (int i = 0; i < 100; i++) {
          //  increment(myCount, times);

           // System.out.println("count is "+myCount.count);
           // System.out.println("times is " +times);

       // }


    }
    public static void increment(Count c, int times){
        c.count++;
        times++;


    }
}
