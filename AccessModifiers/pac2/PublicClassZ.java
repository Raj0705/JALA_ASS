package pac2;
import pac1.*;


public class PublicClassZ {
    public static void main(String args[]) {
        System.out.println("Different Package...");
        PublicClassX obj = new PublicClassX();
        System.out.println("sum " + obj.addTwoNumbers(100, 200));
    }
    
}
