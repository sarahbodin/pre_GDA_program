import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        // Given the number N, output the first N numbers in the sequence

        // read in num
        Scanner scan = new Scanner(System.in);
        int lengthNum = scan.nextInt();

        // create empty array
        int[] arr = new int[lengthNum];

        // initialize variables
        int currentNum = 1;
        int currentPosition = 0;

        // outer loop
        while (currentPosition < lengthNum) {
            // inner loop
            for (int j = 0; j < currentNum; j++) {
                if (currentPosition < lengthNum) {
                    arr[currentPosition] = currentNum;
                    System.out.print(currentNum + " ");
                    currentPosition++;
                }

            }
            currentNum++;
        }
    }
}
