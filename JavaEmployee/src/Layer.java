public class Layer extends Employee{
    String NameLawyer;

    // add this method only for layers
    public char getLayerPosition(){
        return 'm'; // m =  master position
    }
    // super class
    @Override
    public double getSalary() {
        return 6000;
    }
 // default constructor
    public Layer(String nameLawyer) {
        this.NameLawyer= nameLawyer;
    }

    public Layer() {
    }
}
