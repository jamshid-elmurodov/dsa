public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
//        [1, 2, 3, 4, 5, 6] n = 3
//        [1, 4, 2, 5, 3, 6]
        int l = 0;
        int r = n;

        int[] res = new int[n + n];

        for (int i = 0; i < n; i++) {
            res[l++] = nums[i];
            res[r++] = nums[i + n];
        }

        return res;
    }
}
