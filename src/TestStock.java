public class TestStock {
    public static void main(String[] args) {
       /* Stock stock = new Stock("ORCL", "OracleCooperation");
        Stock.printThePriceChangePercentage(stock);
        stock.setPreviousClosingPrice(110.00);
       stock.setCurrentPrice(50.00);
        Stock.printThePriceChangePercentage(stock);
       m(new Integer[50]);
       m(new String[50]);
       m(new Object[50]);*/
        char[] source = {'H', 'a', 'p', 'p', 'y', 'l', 'e', 'a', 'r', 'n', 'i', 'n', 'g'};
        char[] destination = new char[7];
        char[] theDestination = new char[13];

        System.arraycopy(source, 0, destination, 1, 5);
        System.out.println(new String(destination));
        System.out.println(source.length);

        int flag = 3;
        for (int i = 0; i < source.length - 1; i++) {
            if (i == 5) {
                System.arraycopy(source,1,theDestination,0,12);
            }

        }        System.out.println(new String(theDestination));
        System.out.println(source.length);
        //ublic static void m(Object[] x){
        //System.out.println(x.toString());
        //
    }
}
