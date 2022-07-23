import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    // this function takes in a string and returns the most common letter in that string

    public static void main(String[] args) {

        // scan input
        Scanner scan = new Scanner(System.in);
        int numOfCases = scan.nextInt();

        // initialize variables
        int i = 0;
        int caseNum = 1;

        // read inputs for as the number of cases
        while (i < numOfCases) {
            // scan in word
            String word = scan.next();

            //split word int letter array
            String[] arr = word.split("");

            // create empty hashmap
            HashMap<String, Integer> letterCounts = new HashMap<>();
            int count = 1;

            // loop over letter array, add letter to hashmap & count appearances of letter in word
            int j;
            String letter;
            for (j = 0; j < arr.length; j++) {
                letter = arr[j];
                if (letterCounts.containsKey(letter)) {
                    int value = letterCounts.get(letter);
                    value++;
                    letterCounts.put(letter, value);
                } else {
                    count = 1;
                    letterCounts.put(letter, count);
                }
            }

            // loop over letter array, for each letter check hashmap for count & track max count
            int max = 0;
            String maxLetter = arr[0];
            for (int k = 0; k < arr.length; k++) {
                int currentValueCount = letterCounts.get(arr[k]);
                if (currentValueCount > max) {
                    max = currentValueCount;
                    maxLetter = arr[k];
                }
            }

            // loop over hashamp and if map contains value, that's your highest occurring letter
            if (letterCounts.containsValue(max) && letterCounts.containsKey(maxLetter)) {
                System.out.println("Case #" + caseNum + ": " + maxLetter);
            }
            i++;
            caseNum++;
        }
    }
}
