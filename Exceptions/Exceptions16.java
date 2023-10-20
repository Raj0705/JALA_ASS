/**
 *16.Write a program to generate NumberFormatException
 * 
 */
public class Exceptions16 {
    public static void main(String[] args) {
        try{
           int num=Integer.parseInt("shruti");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception..");
        }
    }
 
}
