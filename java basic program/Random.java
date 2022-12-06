import java.util.Scanner;

public class Random {  
public static void main( String args[] )   { 
    Scanner s=new Scanner(System.in);
    System.out.println("enter the min and max number to generate");
    int min=s.nextInt();
    int max=s.nextInt();
    //Generate random int value from 200 to 400   
    System.out.println("Random value of type int between "+min+" to "+max+ ":");  
    int b = (int)(Math.random()*(max-min+1)+min);  
    System.out.println(b); 
    s.close(); 
}  
}
//output
// enter the min and max number to generate
// 100
// 200
// Random value of type int between 100 to 200:
// 170