//main class 
public class CreateObject {
    public static void main(String[] args) {
        //  creat a object of Onemore class
        // syntax of object creat
        // new classname();
        //new is the keyword used to creat a object

        Onemore o=new Onemore();
        o.more();
    }
}
// onemore class
class Onemore{
    public void more()
    {
        System.out.println("creat object sucess");
    }
}

//output:
//creat object sucess