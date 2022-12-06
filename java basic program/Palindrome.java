import java.util.Scanner;
// Palindrome Program in Java
// hear we have two program in single progrom
// revers a string 
// string palinndrome
// watch carefully comments 
public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
            // revers a string we need one more empty string variable 
            var em="";
            //use for loop to go through the user input string
            for(int i=str.length()-1;i>=0;i--)
            {
                /*we use "charAt() " in built fuction  to fetch every single charecter in the user input string */
                em+=str.charAt(i);
            }
            System.out.println(em+" it is the rever string ");
           
            /* up to hear it is a program for revers a string */
            //complet program is to check given string is palindrome are not 
            // to check we use if and else condition 
            if(str.equals(em))
            {
                System.out.println("yes it is a palindrome");
            }else{
                System.out.println("no it is not palindrome");
            }
            s.close();
            // enter program is for palindrome program
    }
}


/*
scube
// revers  a String
ebucs it is the rever string
// check palindrome 
no it is not palindrome

scubeebucs
// revers  a String
scubeebucs it is the rever string 
// check palindrome
yes it is a palindrome
 */