import java.util.Scanner;

public class q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[]=new int[n];
        int l=arr.length;
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();       
            }

        for(int i=0;i<l-1;i++){
            if(i%2==0&&arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else if(i%2!=0&&arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
          
        }

            for(int i:arr){
                System.out.print(i+" ");       
                }

    
}
}
