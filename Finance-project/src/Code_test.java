public class Code_test {
    public static void main(String[] args) {
/***
 * lsts consider a problem  of gathering info about a person's of a financial investment
 * we have a stock , Dividend stocks , Mutual Funds, Real state and Cash....
 *
 * how would you design a complete PortFolio System ?
 * what new type of object would you write ?
 *  **/


        // 1-  Classes : stocks , DividendStock,MutualFunds , Cash
        // 2-  Relations : Dividend is a Stocks
        // 3 - Because Different assets  compute their Market Value in Different ways :
        // 4-  Similarity between MutualFunds and Stocks ??
        //      both store asset there are based on share

        Asset asset1 = new Mutual_fund("RKS", 300);
        System.out.println( "Asset1 Share value is =  " +asset1.getMarketValue() + " $");
        Asset asset2 = new Mutual_fund("RK", 691);
        System.out.println( "Asset2 Share value is =  " +asset2.getMarketValue()+ " $" ) ;


    }

}
