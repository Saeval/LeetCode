import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1_TwoSumTest {

    private final E1_TwoSum sum = new E1_TwoSum();

    @Test
    void example1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        var result = sum.twoSum(nums, target);

        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void example2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        var result = sum.twoSum(nums, target);

        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void example3() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        var result = sum.twoSum(nums, target);

        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void notAdjacentIndexes() {
        int[] nums = new int[]{2, 3, 4};
        int target = 6;

        var result = sum.twoSum(nums, target);

        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void negativeNumbers() {
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;

        var result = sum.twoSum(nums, target);

        assertEquals(2, result.length);
        assertEquals(2, result[0]);
        assertEquals(4, result[1]);
    }
}
