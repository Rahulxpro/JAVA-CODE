public class Marketer extends Employee{
    // This Method only for Marketer
    public boolean insideMarket(){return true;}
// Change the working hour the marketer from 40 to 50
    @Override
    public int getHours() {return 50;}
    @Override
    public int getVacation() {return 20;}
    @Override
    public double getSalary() {return super.getSalary()+1500;}
}
