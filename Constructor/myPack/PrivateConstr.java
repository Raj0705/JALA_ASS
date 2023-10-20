package myPack;

/**
 *If you make any class constructor private, 
 * you cannot create the instance of that class from outside the class.
 */

 class Private{
    private Private(){}
    void msg(){
        System.out.println("Hello Java");
    }
 }
public class PrivateConstr {

    public static void main(String args[]){

    }
    
}
