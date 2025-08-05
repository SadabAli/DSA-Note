public class Switch {
    public static void main(String[] args) {
        int days = 3 ;
        switch (days) {
            case 1:
                System.out.println("Sunday");
                
                break;
            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;
        
            default:
                System.out.println("Invalid Input");
        }
    }
}
