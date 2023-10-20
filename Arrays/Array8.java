import java.util.Arrays;
//8.Write a function to find the minimum and maximum value of an array

public class Array8 {
    
    public static int findMax(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
     public static int findMin(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
       int[] arr={100,220,465,778,655,144,845,253,401,905,1002};
        System.out.println("Array is : "+Arrays.toString(arr));
        int max=findMax(arr);
        int min=findMin(arr);
        System.out.println("Maximum Value : "+max+" and Minimum Value : "+min);
    }
  
          
}
