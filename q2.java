import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose 1 For Term Deposit");
            System.out.println("Choose 2 For Recurring Deposit"); 
            System.out.println("Choose 3 To Terminate");
            System.out.print("Enter your Choice: "); 
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Your Principle: "); 
                    int principle = sc.nextInt();
                    System.out.print("Enter Your Rate: "); 
                    double rate = sc.nextDouble();
                    System.out.print("Enter Time Period (in years): "); 
                    int year = sc.nextInt();
                    double a = principle * Math.pow((1 + rate / 100), year);
                    System.out.println("Term Deposit = " + a);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Enter Your Monthly Installment: "); 
                    int p = sc.nextInt();
                    System.out.print("Enter Your Rate of Interest: "); 
                    double r = sc.nextDouble();
                    System.out.print("Enter Time (in months): "); 
                    int n = sc.nextInt();
                    double b = p * n + p * n * (n + 1) / 2 * r / 100 * 1.0/12.0 ;
                    System.out.println("Recurring Deposit = " + b); 
                    break;
                case 3:
                    System.out.println("Terminating..."); 
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again."); 
                    break;
            }
        } while (choice != 3);
    }
}
