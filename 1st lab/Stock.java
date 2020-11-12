
public class Stock {
    String symbol,name;
    double previousClosingPrice = 56.23,currentPrice = 78.93;
    Stock(String nSymbol, String nName) {
        symbol = nSymbol;
        name = nName;
    }
    public double getChangePercent() {
       return ((currentPrice - previousClosingPrice) / previousClosingPrice) *100;
    }
}
