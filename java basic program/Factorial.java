import java.util.Scanner;
//Factorial Program in Java
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to get factorial");
        int num=s.nextInt();
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac*=i;
        }
        System.out.println(fac+" is the factorial of "+num);
        s.close();
    }
}

//out 
/*
 enter the number to get factorial
15
2004310016 is the factorial of 15
enter the number to get factorial
3
6 is the factorial of 3
 */