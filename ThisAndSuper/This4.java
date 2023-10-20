/*    
 *4.Call argument constructor of current class using this()
 */
public class This4 {
    int a;
    int b;
 
    //Default constructor
    This4()
    { 
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
     
    //Parameterized constructor
    This4(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
 
    public static void main(String[] args)
    {
        This4 object = new This4();
    }
}

