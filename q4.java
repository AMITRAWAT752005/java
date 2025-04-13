import java.util.Scanner;

public class q4{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = sc.nextInt();
    
    int place=1;
    int modified_number=0;
    
    while(number>0){
        int value=number%10;
        if(value==0){
            value=1;
        }
        modified_number+=value*place;
        place*=10;
        number/=10;
    }
    System.out.println(modified_number);
 }
}