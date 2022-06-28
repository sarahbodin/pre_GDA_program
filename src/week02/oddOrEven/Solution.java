import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        // Given an integer number, output Odd if it is odd, or Even if it is even.
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
