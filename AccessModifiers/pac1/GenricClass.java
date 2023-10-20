package pac1;

import pac1.FirstClass;

/*3. Create a class with PROTECTED fields and methods. Access these fields and methods 
from any other class in the same package.
*/
public class GenricClass {

    public static void main(String[] args) {
        FirstClass first = new FirstClass("random name");
        System.out.println("FirstClass name is " + first.getName());

    }
    
}
