public class cash implements Asset {

    private double amount ;   // amount of money held

    public cash(double amount) {
        this.amount = amount;
    }

    @Override
    public double getMarketValue() {
        return amount;
    }



    // no profit since case is a fixed asset
    @Override
    public double getProfit() {
        return 0;

    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
