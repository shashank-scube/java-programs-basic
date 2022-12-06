/*this is program to swap two number using temprery variable(3rd variable) */
//import java.util.Scanner for ScannerClass
import java.util.Scanner;

class SwapTwoNumber{
    public static void main(String[] args) {
        //scanner class to get input from the user
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=s.nextInt();
        System.out.println("enter 2nd number");
        int num2=s.nextInt();
    System.out.println(num1+" "+num2+" " + "Before swapping");
        //using 3rd variable to swap two numbers

        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1+" "+num2+" " + "After swapping");
        s.close();  
    }
}

//out of the program

/*  
    enter 1st number
    20 
    enter 2nd number
    30
    20 30 Before swapping
    30 20 After swapping
 */