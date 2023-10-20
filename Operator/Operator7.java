import java.util.Scanner;

public class Operator7 {
    public static void main(String[] args) {
        int smallest = 0;
        int large = 0;
        int num;
        int small = 0;
        System.out.println("enter the number");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            num = input.nextInt();
            if (i == 0 && num > 0) {
                small = num;
            }
            if (num < small) {
                small = num;
            }
            System.out.println("The smallest number is"+small);
            //gives the smallest number in n numbers

        }
    }
    
}
