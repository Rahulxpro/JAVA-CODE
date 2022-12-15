public class Mutual_fund extends ShareAsset implements   Asset {
    private  double  TotalShare;


    public Mutual_fund(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        TotalShare= 8696;
    }


    @Override
    public double getMarketValue() {return TotalShare*getCurrentPrice();}

    public double getTotalShare(){return TotalShare;}

    @Override
    public double getProfit() {return getMarketValue()-getTotalCost(); }

    // Record purchase of the given share at the given price
    public void Purchase(double  share , double PricePerShare ){
        TotalShare += share;
        addCost(share*PricePerShare);
    }
}
