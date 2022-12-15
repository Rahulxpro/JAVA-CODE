public class code_test {
    public static void main(String[] args) {


        // inheritance =  is use to implement the "is -a " relationship
        //composition =  is used to implement the "has-a" relationship
        Engine engine = new Engine(2018, "Banz");

        Car car = new Car(2021, "mercedes", engine);
        System.out.println(car.engine.ProductionYear);
        System.out.println(car.CalculatePrice());
    }
}
