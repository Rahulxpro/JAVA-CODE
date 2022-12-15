public class Student {
    /*

        //state
        String Name;
        int age;
        char sex; //f or m
        String colour;
        // behaviour = methods
        // method: is a block of code
        // which only run when it is call

    public void Eating() { // private class not access
        System.out.println("Eating"); //  Access modifier to create private class
    }

    public void Drinking() {
        System.out.println("Drinking");
    }

    public void Runing() {
        System.out.println("Runing");
    }
    //Constructor

// default constructor
// alt + insert
    public Student() {
    }
    // Full state constructor
   public Student(String name, int age, char sex, String colour) {
        Name = name;
        this.age = age;
        this.sex = sex;
        this.colour = colour;
    }
    */
    /*
    //Encapsulation

    // State
    private String name;
    private char sex; // F or M
    private String colour;
    private int age;

    private void Eating(){ System.out.println("Eating");}
    private void Drinking(){ System.out.println("Drinking");}
    private void Running(){ System.out.println("Running");}

    //Constructor
    //default constructor


    public Student() {
    }
    // full state constructor

    public Student(String name, char sex, String colour, int age) {
        this.name = name;
        this.sex = sex;
        this.colour = colour;
        this.age = age;
    }
    //getter
    // The get method return the variable value

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    //setter
    //The set method set the value

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

     */
    //3 static vs non static
    // State
    private String name;
    private char sex; // F or M
    private String colour;
    private int age;
    private static int id=0;

    private void Eating(){ System.out.println("Eating");}
    private void Drinking(){ System.out.println("Drinking");}
    private void Running(){ System.out.println("Running");}

    //Constructor
    //default constructor


    public Student() {
        id++;  // increase by 1 every time i create an object from Student
    }
    // full state constructor

    public Student(String name, char sex, String colour, int age) {
        this.name = name;
        this.sex = sex;
        this.colour = colour;
        this.age = age;

    }
    //getter
    // The get method return the variable value

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getColour() {
        return colour;
    }

    public static int getId() {
        return id;
    }

    public int getAge() {
        return age;

    }

    //setter
    //The set method set the value

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public void setAge(int age) {
        this.age = age;


    }
}

