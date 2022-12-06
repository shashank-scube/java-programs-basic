import java.util.Scanner;
//Fibonacci Series in Java

class Fibonacci{
    public static void main(String[] args) {
        //initial we have two number 
        int f1=0;
        int f2=1;
        int f3=0;
        System.out.println("enter the number to get nth fibonacci number");
        Scanner s=new Scanner(System.in);
        int nth=s.nextInt();
        int n=nth-2;
        while(n>0)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
        System.out.println(f3+"is the"+nth+" fibonocci number");
        s.close();
    }
}