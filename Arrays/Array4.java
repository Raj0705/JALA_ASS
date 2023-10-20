import java.util.Scanner;


//4.Write a function to test if array contains a specific value
public class Array4 {
    public static void isContains(int[] arr,int n)
    {
        boolean f=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                f=true;
                break;
            }
           
        }
        if(f)
        {
             System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
     public static void main(String[] args) {
        int a[]={55,66,44,22,44,18,46,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("Search : ");
        int n=sc.nextInt();
        isContains(a,n);
        
       
}


    
}
