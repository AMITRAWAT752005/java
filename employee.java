import java.util.Scanner;
class invalidDetail extends Exception {
    invalidDetail(String s) {  
        super(s);
    }
}
public class employee {    
    static void printDetails(int employeeID, String name, int deptid) {
        System.out.println("Emp id : " + employeeID);
        System.out.println("Name : " + name);
        System.out.println("Department Id : " + deptid);
    }
    public static void check(int empid, String name, int deptid) throws invalidDetail {
        if ((name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') &&
            (empid >= 2001 && empid <= 5001) &&
            (deptid >= 1 && deptid <= 5)) {
            System.out.println("Valid Details");
        } else {
            throw new invalidDetail("Invalid Details");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Empid : ");
        int employeeID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Dept id : ");
        int deptid = sc.nextInt();
        try {
            check(employeeID, name, deptid);
            printDetails(employeeID, name, deptid);
        } catch (invalidDetail e) {   
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
