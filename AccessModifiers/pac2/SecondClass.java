package pac2;

import pac1.*;

public class SecondClass extends FirstClass {

    public static void main(String[] args) {
        SecondClass s=new SecondClass("Inheritance");
    }
    public SecondClass(String name) {
        super(name);
        System.out.println("SecondClass name is " + this.getName());

    } 
   
    
}
