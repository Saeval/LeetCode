public class E1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{ -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int next = nums[j];
                if (current + next == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }

            if (result[1] != -1) break;
        }

        return result;
    }

}
