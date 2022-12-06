public class Compare2Object {
    public static void main(String[] args) {
        //How to Compare Two Objects in Java

        String first=new String("hello");
        String second=new String("hello");

        
        if(first==second)// is is used to compare two object address
        {
                System.out.println("false");
        }else  if(first.equals(second))// it is used to copare two object value
        {
                System.out.println("true");
        }

        String firsss=new String("hello");
        String secondd=firsss;

        
        if(firsss==secondd)// is is used to compare two object address
        {
                System.out.println("false");
        }else  if(firsss.equals(secondd))// it is used to copare two object value
        {
                System.out.println("true");
        }

        // see the diffrence b/w two output
    }
}
