import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int maxnum = nums[0];
        int minnum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxnum) {
                maxnum = nums[i];
            } else if (nums[i] < minnum) {
                minnum = nums[i];
            }
        }
        int diff = maxnum - minnum;
        return diff;
    }

    // TODO: Implement the other methods from the study guide AND tests for each one
    public static int maxDiffArrayList(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int diffnum = max - min;
        return diffnum;
    }

    // * Find the longest word that starts with a specific character letter in

    public static String longestWordStartsWith(ArrayList<String> words) {
        char search = 'a';
        String longest = "";
        for (String w : words) {
            if (w.charAt(0) == search && w.length() > longest.length()) {
                longest = w;
            }
        }

        return longest;
    }

    // * Find the longest word that starts with a specific character letter in using
    // Hash set

    public static String longestWordStartsWithHashSet(Set<String> words) {
        char search = 'a';
        String longest = "";
        for (String w : words) {
            if (w.charAt(0) == search && w.length() > longest.length()) {
                longest = w;
            }
        }

        return longest;

    }

    // Count how many words are longer than n characters and shorter than m

    public static int longerThanNCharactersShorterThanM(String[] words) {
        int n = 0;
        int m = 5;
        int count = 0;
        for (String w : words) {
            if (w.length() > n && w.length() < m) {
                count += 1;
            }
        }
        return count;
    }

    // Find the difference between the how many odd and even numbers there are in:

    public static int diffBetweenOddAndEven(HashMap<Integer, Integer> nums) {

        int oddNum = 0;
        int evenNum = 0;
        for (int n : nums.values()) {

            if (n % 2 == 0) {
                evenNum += 1;
            }
            if (n % 2 != 0) {
                oddNum += 1;
            }
        }
        int diff = oddNum - evenNum;
        return diff;
    }

    // Find the second-largest number in:

}