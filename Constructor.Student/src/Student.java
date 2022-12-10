public class Student {

        //state
        String Name;
        int age;
        char sex; //f or m
        String colour;
        // behaviour = methods
        // method: is a block of code
        // which only run when it is call




    public void Eating() {
        System.out.println("Eating");
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
}

