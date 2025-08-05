package Task;
// Use switch-case to print day name (Mon–Sun) based on user input (1–7)

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day number between 1-7");
        int day= sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break ;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thrusday");
            break;

            case 6:
            System.out.println("Friday");

            case 7:
            System.out.println("Saturday");
        
            default:
            System.out.println("Invalid Input");
            
        }

    }
}
