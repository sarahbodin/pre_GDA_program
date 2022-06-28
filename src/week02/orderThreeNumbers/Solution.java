import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        // Given three different integer numbers, output them in the ascending order.
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // need to store nums in ARRAY
        int[] arr = {num, num2, num3};

        // sort in ascending order
        Arrays.sort(arr);

        // loop over array and print nums
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
