

import java.io.*;
import java.io.IOException;
import java.util.*;


public class fileHandling{
public static void main(String args[]) throws IOException,FileNotFoundException{
FileInputStream fis = new FileInputStream("D:\\demo.txt");
Scanner sc = new Scanner(fis);
int x=0;
while(sc.hasNext()){
String name = sc.next();
StringBuilder sb  = new StringBuilder(name);
String revS = sb.reverse().toString();
if(name.equals(revS)) {
   System.out.println(name); 
   x++; 
}
}

System.out.println(x);
}

}