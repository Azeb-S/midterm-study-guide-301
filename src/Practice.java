import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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

    public static int secondLargestNumber(ArrayList<Integer> nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }
        return secondLargest;
    }

    public static int secondLargestNumberSet(HashSet<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }

        return secondLargest;
    }

    public static int secondLargestNumberMap(HashMap<Integer, Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : nums.values()) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }

        return secondLargest;
    }

    // Find the difference between the how many odd and even numbers there are in:

    public static int diffBetweenOddAndEvenArrayList(ArrayList<Integer> nums) {

        int diff = 0;
        int oddNum = 0;
        int evenNum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNum += 1;
            } else if (num % 2 != 0) {
                oddNum += 1;
            }

        }
        diff = oddNum - evenNum;

        return diff;

    }

    // Count how many words are longer than n characters and shorter than m

    public static int longerThanNCharactersShorterThanMMap(HashMap<Integer, String> words, int n, int m) {

        int count = 0;

        for (String word : words.values()) {
            if (word.length() > n && word.length() < m) {

                count += 1;
            }
        }

        return count;
    }

    // Question 1

    public static int practice(ArrayList<Integer> scores) {

        // ArrayList<Integer> scores = new ArrayList<>(List.of(85, 90,75,95));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > largest) {
                largest = score;
            } else if (score > secondLargest && secondLargest < largest) {
                secondLargest = score;
            }
        }
        return secondLargest;

    }

    // Question 2 – HashSet Uniqueness

    public static HashSet<String> unique(String[] words) {

        HashSet<String> result = new HashSet<>();
        for (String word : words) {
            result.add(word);
        }

        return result;

    }

    // Question 3 – HashMap Counting
    // I need to know how to add values to hasmap and map it with key

    public static HashMap<Integer, Integer> appears(int[] numbers) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : numbers) {
            if (count.containsKey(n)) {
                count.put(n, count.get(n) + 1);
            } else {
                count.put(n, 1);
            }
        }

        return count;
    }
    // Question 4 – Conversion

    public static void convert() {
        String[] names = { "Azeb", "Maya", "Liam" };
        ArrayList<String> namesinArrayList = new ArrayList<>(List.of(names));

    }

    // Question 5 – Contains Check
    public static void containes() {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));

        if (numbers.contains(25)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
    // Question 6 – HashSet Membership

    public static void check() {
        HashSet<Integer> codes = new HashSet<>(Set.of(100, 200, 300));

        if (codes.contains(200)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String text = "Apple banana apple! BANANA, banana.";

        String[] words = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");

    }

    // Find the difference between the largest and smallest integer in:

    public static int diffArray(int[] numberes) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int diff = 0;

        for (int n : numberes) {

            if (n > maxValue) {
                maxValue = n;
            } else if (n > minValue) {
                minValue = n;
            }
        }
        diff = maxValue - minValue;

        return diff;
    }

    public static int diffArrayList(ArrayList<Integer> numberes) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int n : numberes) {
            if (n < maxValue) {
                maxValue = n;
            } else if (n > minValue) {
                minValue = n;
            }
        }
        int diff = maxValue - minValue;
        return diff;

        // Find the longest word that starts with a specific character letter in:

    }
    // Find the longest word that starts with a specific character letter in:

    public static String longestwordStartswithc(String[] words, char a) {

        int max_lenth = 0;
        String theOne = "";

        for (String word : words) {
            if (word.length() > max_lenth && word.charAt(0) == a) {
                max_lenth = word.length();
                theOne = word;

            }
        }

        return theOne;
    }

    public static String longestWordStartsWithcArrayList(ArrayList<String> words, char a) {

        int max_length = 0;
        String theOne = "";

        for (String word : words) {
            if (word.length() > max_length && word.charAt(0) == a) {
                max_length = word.length();
                theOne = word;
            }
        }

        return theOne;
    }

    public static String longestWordStartsWithcHasSet(HashSet<String> words, char a) {

        int max_length = 0;
        String theOne = "";
        for (String word : words) {
            if (word.length() > max_length && word.charAt(0) == a) {
                max_length = word.length();
                theOne = word;
            }
        }
        return theOne;
    }

    public static String longestWordStartsWithcHasMap(HashMap<String, String> words, char a) {

        int max_length = 0;
        String theone = "";
        for (String word : words.values()) {
            if (word.length() > max_length && word.charAt(0) == a) {
                max_length = word.length();
                theone = word;
            }
        }

        return theone;
    }

}