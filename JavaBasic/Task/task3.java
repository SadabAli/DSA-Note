package Task;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether a number in even or odd");
        int user = sc.nextInt();

        if (user % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("Odd number");
        }
    }
}
