package FunctionsArrays.Constructor;

public class Parameterized {
    String name;
    int age ;

    Parameterized(String name , int age){
        this.name = name ;
        this.age = age ;
    }

    void display(){
        System.out.println("Name: "+name+ " Age"+age);
    }

    public static void main(String[] args) {
        Parameterized obj = new Parameterized("Sadab", 20);

        obj.display();
    }

}
