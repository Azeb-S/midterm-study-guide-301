import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = { 8, -2, 9, -5 };

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    // TODO: Make tests for each problem you solve
    @Test
    void testMaxDiffPositive() {
        int[] numbers = { 8, 9, 12, 54, 20 };
        int actual = Practice.maxDiff(numbers);

        assertEquals(46, actual);
    }

    @Test
    void testMaxDiffNegative() {
        int[] numbers = { -1, -2, -3, -4, 0 };
        int actual = Practice.maxDiff(numbers);

        assertEquals(4, actual);
    }

    @Test
    void testMaxDiffNegativeArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(-1, -2, -3, -4, 0));
        int actual = Practice.maxDiffArrayList(numbers);

        assertEquals(4, actual);
    }

    @Test
    void testlongestWordStartsWith() {
        ArrayList<String> words = new ArrayList<>(List.of("apple", "ant", "banana", "avocado"));
        String actual = Practice.longestWordStartsWith(words);

        assertEquals("avocado", actual);
    }

    @Test
    void testlongestWordStartsWithHasSet() {
        HashSet<String> words = new HashSet<>(Set.of("apple", "ant", "banana", "avocado"));
        String actual = Practice.longestWordStartsWithHashSet(words);

        assertEquals("avocado", actual);
    }

    @Test
    void testLongerThanNCharactersShorterThanM() {
        String[] words = { "hi", "hello", "wonderful", "day" };
        int actual = Practice.longerThanNCharactersShorterThanM(words);

        assertEquals(2, actual);
    }

    @Test
    void testDiffBetweenOddAndEven() {
        HashMap<Integer, Integer> numbers = new HashMap<>(Map.of(
                1, 2,
                2, 1,
                3, 4,
                4, 7,
                5, 8));
        int actual = Practice.diffBetweenOddAndEven(numbers);

        assertEquals(-1, actual);
    }

    @Test
    void testDiffBetweenOddAndEvenPostiveresult() {
        HashMap<Integer, Integer> numbers = new HashMap<>(Map.of(
                1, 2,
                2, 1,
                3, 4,
                4, 7,
                5, 11,
                6, 3,
                7, 13));
        int actual = Practice.diffBetweenOddAndEven(numbers);

        assertEquals(3, actual);
    }

    @Test
    void testsecondLargestNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 9));
        int actual = Practice.secondLargestNumber(numbers);

        assertEquals(4, actual);
    }

    @Test
    void testsecondLargestNumberSet() {
        HashSet<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4, 9));
        int actual = Practice.secondLargestNumberSet(numbers);

        assertEquals(4, actual);
    }

    @Test
    void testsecondLargestNumberSetNegative() {
        HashSet<Integer> numbers = new HashSet<>(Set.of(-11, -2, -3, -4, -9));
        int actual = Practice.secondLargestNumberSet(numbers);

        assertEquals(-3, actual);
    }

}
