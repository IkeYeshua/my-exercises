public class Stock {
    private  String symbol;
    private String name;
    private  double previousClosingPrice = 34.5;
    private double currentPrice = 34.35;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        double result;
        result = (getPreviousClosingPrice() - getCurrentPrice()) / (getPreviousClosingPrice()) * 100;
        return result;

    }

    public static void printThePriceChangePercentage(Stock s){
        System.out.println("The symbol:" + s.symbol + "," + "the name: "
        + s.name + "," + "the Price Change Percentage is " + s.getChangePercent() + ".");

    }

}
