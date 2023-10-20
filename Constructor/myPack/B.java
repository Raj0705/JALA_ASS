package myPack;
import pack.*;

/**
 *The protected access modifier is accessible
 * within package and outside the package but through inheritance only.
 */

public class B extends A{

    public static void main(String[] args){
        B b = new B();
    }
    
}
