import java.util.ArrayList;
import java.util.Iterator;

public class Test_code_Arraylist {
    public static void main(String[] args) {
        // 1 -  creating arraylist of string
        ArrayList<String>list= new ArrayList<>();


        //2- Adding arraylist of String
        list.add("element0");
        list.add("element1");
        list.add("element2");
        /*
        System.out.println(list);  // o/p :- [element0, element1, element2]

        //3- Adding element of specific position
        list.add(2,"Rahul");

        //4- print the arraylist
        System.out.println(list);  // o/p [element0, element1, Rahul, element2]
                                   // index:-0 ,         1 ,              2

        // 5- Change an element of arraylist
        list.set(0,"changed");
        System.out.println(list);  // o/p :-  [changed, element1, Rahul, element2]  index 0  element are change

        //6- remove element from Arraylist
        list.remove(1);
        System.out.println(list);  // o/p :-  [changed, Rahul, element2]    index 1 element remove
        //or
        list.remove("element2");
        System.out.println(list);  //  o/p :-  [changed, Rahul]        remove element2

         */

        // 7- Iteration over arraylist element

        // 7.1-Using for-each loop
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));  // o/p :- element0
                                             //         element1
                                             //         element2
        }
        //7.2 Using for-each loop
        for (String s: list){
            System.out.println(s);     // o/p :- element0
                                      //         element1
                                      //         element2

        }

        // 7.3 using Iteration interface
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext());  // o/p :- element0
                                                    //         element1
                                                   //         element2
        }

    }
}
