package lesson24_generics_1;

import java.util.ArrayList;
import java.util.HashMap;
import lesson15_inheritance.Inheritance_Animal;

public class Generics_1 {

    //Just an introduction tutorial
    //A generic class is a class that can work with other objects
    //You specify what type(s) of object(s) it can work with when you instantiate the class (when you create objects
    //from the class)

    //A simple example is as below, using the ArrayList class - John says that this is a key class to learn
    //There are more ArrayList tutorials later on in the java beginners udemy course

    //Below shows the old style of doing generics (before Java 5) + the new style (after Java 5)

    public static void main(String[] args) {

        /************ BEFORE JAVA 5 (BEFORE GENERICS) *************/

        ArrayList list = new ArrayList();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //If i want to get an item from this list, I have to use downcasting...

        String fruit = (String) list.get(0);

        System.out.println(fruit);

        /************ AFTER JAVA 5, MODERN STYLE GENERICS *************/

        //Generics were introduced

        //Parametrised classes

        //You can add type parameters that specify what kind of object(s) you want that class to work with
        //This is done in diamond brackets when the object is being instantiated

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("Dog");
        strings.add("Cat");
        strings.add("Lion");

        String animal = strings.get(0);

        //I don't have to downcast because I have already declared that the ArrayList 'strings' can work with String objects
        //(in this case, as return objects)

        //And you can iterate through the ArrayList as per usual (using a for loop and .size)

        System.out.println("Start of for loop");

        for(int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        System.out.println("End of for loop");

        System.out.println("Start of alternative for loop - doesn't matter which one you use");

        for(String values : strings){
            System.out.println(values);
        }

        System.out.println("End of alternative for loop - doesn't matter which one you use");

        /************ THERE CAN BE MORE THAN 1 TYPE ARGUMENT *************/

        //A brief example below...the type parameters are separated by a comma:

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //More information on hashmaps to come in later java beginners course videos

        /************ JAVA 7 STYLE *************/

        //In Java 7, you don't have to re-type the type parameters when you create / instantiate a new object.
        //For example:

        ArrayList<Integer> someList = new ArrayList<>();

        //In the above, Java infers that the new ArrayList object is still an ArrayList of Integers (you don't have to
        //declare the type parameters again, after the '=')
        //This is very useful as it reduces repetition

        //And just for reference, note that the classes declared in the diamond brackets can be any class (including
        //one I have created)
        //For example...

        ArrayList<Inheritance_Animal> test = new ArrayList<Inheritance_Animal>();

        //I can access Inheritance Animal in this class because it is a public class and I have imported it at the top

        //One really good thing to note as this caught me out at the time.....Classes in the default package cannot
        //be imported by classes in packages. This is why you should not use the default package.
        //Above is from Stack Overflow and I have saved an article to my Evernote

    }
}
