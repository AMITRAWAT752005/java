import java.util.Scanner;
class q3{
 public static void main(String args[]){
 @SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number 1 : ");
 int number1 = sc.nextInt();
 System.out.println("Enter the number 2 : ");
 int number2 = sc.nextInt();
int sum1=0;
int sum2=0;
for(int i=1;i<=number1/2;i++){
if(number1%i==0){
sum1+=i;
}
}
for(int i=1;i<=number2/2;i++){
if(number2%i==0){
sum2+=i;
}
}
if(sum1==number1 && sum2==number2){
  System.out.println("Abundant Numbers");
}
else{
  System.out.println("Not Abundant Numbers");
} } } 
