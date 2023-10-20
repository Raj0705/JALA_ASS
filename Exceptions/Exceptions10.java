/**
 * 10.Write a program to generate ClassNotFoundException
 * 
 */

public class Exceptions10 {
    public static void main(String[] args) {
        try{
            Class.forName("mango");
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}

