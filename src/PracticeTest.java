import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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

}
