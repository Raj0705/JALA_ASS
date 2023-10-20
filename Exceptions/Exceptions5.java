/**
 *5.Write a program to throw exception with your own message
 */
public class Exceptions5 {
    void div(int a,int b) throws ArithmeticException
    {
        if(b==1)
        {
            throw new ArithmeticException("/ by one");
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Exceptions5 ob=new Exceptions5();
        try{
            ob.div(10,2);
            ob.div(10,1);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

