/*this is program to swap two number without using temprery variable(3rd variable) */
//import java.util.Scanner for ScannerClass
import java.util.Scanner;

class SwapTwoNumber2{
    public static void main(String[] args) {
        //scanner class to get input from the user
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=s.nextInt();
        System.out.println("enter 2nd number");
        int num2=s.nextInt();
    System.out.println(num1+" "+num2+" " + "Before swapping");
        //with out using 3rd variable to swap two numbers

        //login for swap
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1+" "+num2+" " + "After swapping");
        s.close();
    }
}
//output of the program
/*
enter 1st number
20
enter 2nd number
30
20 30 Before swapping
30 20 After swapping
 */