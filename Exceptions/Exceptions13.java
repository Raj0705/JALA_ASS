import java.lang.reflect.*;


/**
 *13.Write a program to generate NoSuchFieldException
 * @author shruti
 */
public class Exceptions13 {
      public static void main(String[] args) {  
   
      Exceptions13  obj = new Exceptions13();  
      Class class1 = obj.getClass();  //gets the class  
  
      System.out.println("Field got  =");  
      try {  
          
         Field Flds = class1.getField("str");  
         System.out.println(" field found: " + Flds.toString());  
      } catch(NoSuchFieldException e) {  
         System.out.println(e.toString());  
      }  
   }  
  
   public Exceptions13() {        
   }  
  
   public Exceptions13(String str) {         
      this.str = str;  
   }  
     public String str = "Raj Srivastava";  
}