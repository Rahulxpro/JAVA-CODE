public abstract class ShareAsset implements Asset  {
    // This is a  redundant coding
    private  String Symbol;
    private  double totalCost;
    private double CurrentPrice;

    public ShareAsset(String symbol, double currentPrice) {
        Symbol = symbol;
        CurrentPrice = currentPrice;
        totalCost=0.0;
    }
    // add a cost of given amount to the asset
    public void addCost(double cost){totalCost += cost; }

    // Return the price per share of the asset
    public double getCurrentPrice() {return CurrentPrice; }

    public  double getTotalCost(){return  totalCost;}


    public void  SetCurrentPrice(double currentPrice) {this.CurrentPrice = CurrentPrice; }


}
