package Task;

import java.util.Scanner;

// Print sum of first N natural numbers (take N from user)
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number N");
        int user = sc.nextInt();
        int sum=0; 

        for(int i = 0 ; i <= user;i++){
            sum += i;
            
        }
        System.out.println(sum);


    }
}
