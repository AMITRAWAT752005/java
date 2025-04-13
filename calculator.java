import java.util.*;
class nonNegative extends Exception{
    nonNegative(String s){
        super(s);
    }
}
public class calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values of p and n: ");
    int n = sc.nextInt();
    int p = sc.nextInt();   
        try{
           power(n,p);
        } catch (Exception e){
            System.out.println(e);
        }
}
    public static void power(int n,int p) throws nonNegative{
        if(n<0 || p<0){
            throw new nonNegative("p and n cannot be non Negative");
        }
        else if(n==0 && p==0) {
            throw new nonNegative("p and n cannot be 0");
        }
        else if(n==0){
            throw new nonNegative("n Cannot be 0");
        } 
        else{
            System.out.println(Math.pow(n, p));
        }
    }
}

