public class Loop6 {

//6.Write a program to print even number between 10 and 100 using while
    public static void main(String[] args) {
        int i=10;
        while(i<=100)
        {
            if(i%2==0)
                System.out.print(i+"\t");
            i++;
        }
    }
    
}
