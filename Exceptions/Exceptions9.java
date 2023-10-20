/**
 *9. Write a program to generate ArrayIndexOutOfBoundException
 *
 */
public class Exceptions9 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=9;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
    }
}
