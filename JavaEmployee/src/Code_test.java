public class Code_test {
    public static void main(String[] args) {

        //Creation of object
        Employee employee= new Employee();
        Layer layer = new Layer();
        Marketer marketer = new Marketer();
        Secretary secretary= new Secretary();
        Legal_Secretary legal_secretary= new Legal_Secretary();
        /*

        System.out.println(employee.getVacation());
        System.out.println(layer.getLayerPosition());
        System.out.println(secretary.getVacation());
        System.out.println(legal_secretary.getVacation());
        System.out.println(marketer.insideMarket());

        // for super class
        System.out.println("The working hour of marketer are = " +marketer.getHours()+ " H" );
        System.out.println("The vacation days  of marketer are = " +marketer.getVacation() +" Days");
        System.out.println("The salary  of marketer are = " +marketer.getSalary() );
        System.out.println("The Salary of layer = "  + layer.getSalary());



        //16 object a closer look
        System.out.println("for  16 object a closer look ");
        Layer layer1 = new Layer( "Rahul");
        Layer layer2 = new Layer( "Rahul");
        Layer layer3 = layer2;
        //Comparing the references of the object
        System.out.println(layer2==layer3);

        // Comparing the  object state
        System.out.println(layer1.equals(layer2));

         */


        //polymorphism
        Employee[] employees = new Employee[10];
        employees[0]=layer;
        employees[1]=secretary;
        employees[2]=marketer;
        employees[3]=legal_secretary;

        Employee employee1=new Layer();
        Employee employee2=new Secretary();
        Employee employee3=new Marketer();
        Employee employee4=new Legal_Secretary();

        System.out.println( "Salary of Marketer = " + employee3.getSalary()); //

        //Employee3.insideMarket();
        System.out.println(((Marketer)employee3).insideMarket());


    }
}
