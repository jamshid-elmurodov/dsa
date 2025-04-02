public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;

        int[] res = new int[l * 2];

        for (int i = 0; i < l; i++) {
            res[i] = nums[i];
            res[i + l] = nums[i];
        }

        return res;
    }
}
