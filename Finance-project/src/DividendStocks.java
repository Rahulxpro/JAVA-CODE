public class DividendStocks extends Stocks {

    public double dividends ; // amount of dividend paid
    public DividendStocks(String symbol, double currentPrice, double dividends) {
        super(symbol, currentPrice);
        dividends = 0.0;
    }

    @Override
    public double getMarketValue() {return super.getMarketValue()+dividends  ;}

    // records a dividends of the given amount per share
    public void payDividend(double AmountPerShare ){ dividends +=  AmountPerShare * getTotalShare(); }
}
