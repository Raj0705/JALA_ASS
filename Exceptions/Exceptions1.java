/**
 *1.Write a program to generate Arithmetic Exception without exception handling
 *2.Handle the Arithmetic exception using try-catch block
 
 */
public class Exceptions1 {
    public static void main(String[] args) {
        try{
           int a=30,b=0;
           int c=a/b;
            System.out.println("Result c = "+c);
        }
        catch(Exception e)
        {
            System.out.println("Can't divide number by 0");
        }
    }
}
