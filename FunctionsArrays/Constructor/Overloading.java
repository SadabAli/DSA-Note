package FunctionsArrays.Constructor;

public class Overloading {
    String name ;
    int age ;
    Overloading(){ // default Constructor
        name = "Sadab Ali";
        age = 20 ;
    }

    Overloading(String name , int age){
        this.name = name ;
        this.age = age ;

    }

    void display(){
        System.out.println(name + "----" + age);
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Bitch",20);

        obj1.display();
        obj2.display();
    }
}
