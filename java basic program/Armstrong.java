import java.util.Scanner;
//Armstrong Number in Java
//check wether the number is palindrom are not
class Armstrong{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int num1=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem*rem*rem;//cube the remander
            num=num/10;
        }
        System.out.println(sum);
        s.close();
        if(num1==sum)
        {
            System.out.println(num1+"yes it sis Armstrong number");
        }else{
            System.out.println(num1+"no it sis Armstrong number");
        }
    }
}

// output 
/* 
156
342
156no it sis Armstrong number

153
153
153yes it sis Armstrong number
*/