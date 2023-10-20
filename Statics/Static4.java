public class Static4 {

    //Call instance methods in static methods

    static int a = 10; 
    //instance method need object
   void display() 
   { 
      System.out.println("This is an instance method");
  
   } 
  static void show()
  { 
     System.out.println("This is a Static method"); 
     Static4 obj=new Static4();
     obj.display();
   } 
  public static void main(String[] args) 
  { 
   Static4.show(); 
    } 
    
}
