public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;

        int[] res = new int[l * 2];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[l + i] = nums[i];
        }

        return res;
    }
}
