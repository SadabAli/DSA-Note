package FunctionsArrays.Modifiers;

public class access {
    private String name = "Mir Sadab Ali";
    protected int roll = 241;
    public String coll= "CUTM";

    void display(){
        System.out.println(name+roll+coll);
    }

    public static void main(String[] args) {

        access obj = new access();
        obj.display();
    }
}
