public class Static1{

    /*1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method.
*/


    static int a=10;
    static int b=40;
    double x=500.12;
    double y=526.56;
    static void show()
    {
       
        System.out.println("values of a and b : "+a+" "+b);
    }
    static int add()
    {
        int c=a+b;
        return c;
    }
    public void showinstance()
    {
        System.out.println("values of x and y is "+x+" "+y);
    }
    public double diff()
    {
        double z=y-x;
        return z;
    }
    public static void main(String[] args) {
        Static1 obj1=new Static1();
        System.out.println("Instance Variabes and methods");
        obj1.showinstance();
        System.out.println("Difference of Instance Variables : "+obj1.diff());
        System.out.println("Static Variables and methods");
        Static1.show();
        System.out.println("Sum of Static variables : "+add());
    }
}