package sorting.insertion;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > temp){
                nums[j + 1] = nums[j--];
            }

            nums[j + 1] = temp;
        }

        return nums;
    }
}
