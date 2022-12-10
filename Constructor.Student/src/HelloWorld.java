public class HelloWorld {
    public static void main(String[] args) {
        /*
        // object and classes

        // Creating the student object
        Student Student1 = new Student();

        //creating the behaviour of object
        Student1.sex='M';
        Student1.Name="Rahul";
        Student1.age= 25;
        Student1.colour="Fair";

        Student1.Drinking();
        Student1.Eating();
        Student1.Runing();
        */
        // or
        //constructor
        // This constructor simply initialized all filled of the object with their default value
        // String are initialized to null and the integer to zero
        //Creating an object with empty constructor
        Student student1 =  new Student();
        System.out.println("Student1 Name " + student1.Name);
        System.out.println("Student1 Sex " + student1.sex);
        System.out.println("Student1 age " + student1.age);
        System.out.println("Student1 colour " + student1.colour);
        //Creating an object with full state constructor
        Student student2 = new Student("Rahul",25,'M',"Fair");
        System.out.println("Student2 Name " + student2.Name);
        System.out.println("Student2 sex " + student2.sex);
        System.out.println("Student2 colour " + student2.colour);
        System.out.println("Student2 age " + student2.age);
    }
}
