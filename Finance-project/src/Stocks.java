public class Stocks extends ShareAsset implements Asset {

   private  int TotalShare;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        TotalShare = 0;
    }


    @Override
    public double getMarketValue() {return getTotalShare()*getCurrentPrice(); }

    @Override
    public double getProfit() {return getMarketValue() - getTotalCost() ;  }
    public int getTotalShare() {return TotalShare; }

    // record a purchase of the given number of share of the stock at the given price per share
    public void purchase (int Share , double PricePerShare ){
        TotalShare +=Share;
        addCost(Share*PricePerShare);
    }



}
