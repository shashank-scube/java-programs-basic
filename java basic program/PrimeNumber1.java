// Prime Number Program in Java
//check wether the give number is prime or not
import java.util.*;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int Prime=s.nextInt();
        boolean check=true;
        //check wether this is a prime number are not
        if(Prime%2==0)
        {
            System.out.println("number is not a prime number");
        }else{
            for(int i=2;i<Prime;i++)
            {
                if(Prime%i==0)
                {
                    check=false;
                }
            }
        }
        if(check)
        {
            System.out.println("yes ' number is prime number ");
        }else{
            System.out.println("no ' number is not a prime numebr");
        }
        s.close();
    }
}
// output 
/*
7
yes ' number is prime number
15
no ' number is not a prime numebr
 */