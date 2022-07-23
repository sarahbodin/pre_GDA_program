import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution {
    // this function takes an array of integers nums and an integer target and
    // returns true if there are two numbers in the array that sum to the target value
    // returns false otherwise

    // helper function
    public static AtomicBoolean sumTwo(int targetValue, String input) {

        HashMap<Integer, Integer> inputMap = new HashMap<>();

        // split input into string array of string nums
        String [] inputNumsArr = input.split(",");

        // convert array of strings to array of integers
        for (String s : inputNumsArr) {
            int inputInt = Integer.parseInt(s);

            // add ints to hashmap as keys, values equal num of times int appears
            if (inputMap.containsKey(inputInt)) {
                inputMap.put(inputInt, inputMap.get(inputInt) + 1);
            } else {
                inputMap.put(inputInt, 1);
            }
        }

        AtomicBoolean result = new AtomicBoolean(false);

        // loop over all key / value pairs in hashmap to see if it contains two keys that add up to target sum
        inputMap.forEach((k,v) -> {
            if (inputMap.containsKey(targetValue - k) && (targetValue - k) != k) {
                result.set(true);
            }
            else if (targetValue - k == k && v > 1) {
                result.set(true);
            }
        });
        return result;
    }

    public static void main(String[] args) {

        // scan input
        Scanner scan = new Scanner(System.in);
        int numOfCases = scan.nextInt();

        // initialize variables
        int i = 0;
        int caseNum = 1;

        // read inputs for as the number of cases
        while (i < numOfCases) {
            // scan in target value
            int targetValue = scan.nextInt();
            System.out.println("Case #" + caseNum + ": " + sumTwo(targetValue, scan.next()));
            i++;
            caseNum++;
        }
    }
}
