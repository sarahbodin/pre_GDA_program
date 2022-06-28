import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Given a sequence of numbers, output the largest number from this sequence
        Scanner scan = new Scanner(System.in);

        // store nums in array, except first num
        int lengthNum = scan.nextInt();
        int i = 0;
        int[] arr = new int[lengthNum];
        for (i = 0; i < lengthNum; i++) {
            arr[i] = scan.nextInt();
        }

        // Initialize maximum element
        int max = arr[1];

        // Loop over array nums from second and
        // compare every element with current max
        for (i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
