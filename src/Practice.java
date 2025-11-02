public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
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

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}