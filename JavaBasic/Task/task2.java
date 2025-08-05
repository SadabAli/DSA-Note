package Task;
import java.util.Scanner;
// Print multiplication table of any number
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Munber for multiplication of a table");
        int user = sc.nextInt();
        int result= 0;

        for (int i = 0;i<=10 ;i++){
            result = user * i ;
            System.out.println(user + "*" + i +"=" + result);
        }
    }
}
