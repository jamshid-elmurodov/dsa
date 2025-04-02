public class MaximumValueOfAnOrderedTripletI {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        int l = nums.length;

        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    max = Math.max(max, (long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }

        return max;
    }
}
