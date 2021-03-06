package lesson14_tostring;

public class ToStringMethodExample_2 {

    public static void main(String[] args) {

        ToStringMethodExample_2 test1 = new ToStringMethodExample_2();

        System.out.println(test1);

    }
}

//If I run the above example (and try to print the object reference 'test1'), I am presented with a hashcode.
//I do not have an overriding toString() method and so the compiler writes here test1.toString()



//In the below class (which is totally separate to the above) I will add an overriding toString() method.

class Richard {

    private int age;
    private String name;

    public Richard(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.age + " " + this.name;
    }

    //BUT the above is not great from a memory efficiency perspective (I could use StringBuilder instead
    //- see ToStringMethodExample_1 class)

    public static void main(String[] args) {
     Richard richard = new Richard(6, "John");

        System.out.println(richard);
    }

}

//In the above example, I have created an overriding toString() method which is invoked when I try to print out the
//object reference 'richard'. Rather than printing a hashcode, it prints something that allows me to identify the object
//reference in question. Very useful for debugging.