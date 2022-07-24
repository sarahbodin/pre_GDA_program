import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/** Starter code for the Anagrams problem. */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The first number is the number of test cases.
        int numTests = in.nextInt();

        // Read in the next line, which is the comma-separated list of words to put in the anagram
        // grouper. Create an AnagramGrouper for this list of words.
        String[] words = in.next().split(",");
        AnagramGrouper anagrams = new AnagramGrouper(words);

        // For each test case, read in the word and print how many anagrams it has.
        for (int i = 1; i <= numTests; i++) {
            String word = in.next();
            System.out.printf("Case #%d: %d\n", i, anagrams.getNumberOfAnagrams(word));
        }

        in.close();
    }

    /**
     * Takes a list of words and groups them into anagram groups. An anagram group is a set in which
     * all words are anagrams of each other. For example, "tan, ant, nat" is an anagram group.
     */
    public static class AnagramGrouper {

        HashMap<String, String> anagramMap = new HashMap<>();

        /** Constructs an AnagramGrouper from the given array of Strings. */
        public AnagramGrouper(String[] words) {
            // the key is the letters of those words alphabetized. Populate it with the given words.

            for (int i = 0; i < words.length; i++) {
                char charArr[] = words[i].toCharArray();
                Arrays.sort(charArr);
                String sortedWord = String.valueOf(charArr);

                if (!anagramMap.containsKey(sortedWord)) {
                    anagramMap.put(sortedWord, words[i]);
                } else if (!anagramMap.containsValue(words[i])) {
                    anagramMap.put(sortedWord, anagramMap.get(sortedWord) + "," + words[i]);
                }
            }
        }

        /**
         * Given a string word, return the number of valid anagrams it has. An anagram is valid if it
         * appears in this AnagramGrouper.
         */
        public int getNumberOfAnagrams(String word) {
            String sortedWord = createKey(word);

            if (anagramMap.containsKey(sortedWord)) {
                String[] anagrams = anagramMap.get(sortedWord).split(",");
                return anagrams.length;
            } else {
                return 0;
            }
        }

        /**
         * Creates a key for the given word. The key is a string consisting of the letters in the word
         * in alphabetical order.
         */
        private String createKey(String s) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            return new String(letters);
        }
    }
}
