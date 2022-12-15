public class Car extends Vehicle{
    // car - has an engian
    Engine engine;

    // car is a vehicle
    public Car(int modelYear, String companyName, Engine engine){
        super(modelYear,companyName);
        this.engine = engine;
    }
    public void  StartCar(){
        System.out.println("Car Start");
    }

    @Override
    public int CalculatePrice() {
        return super.CalculatePrice() +2000;
    }
}
