public class RemoveElement {
    public int removeElement(int[] nums, int val) {
//        [1, 1, 2, 1, 3]
//        [2, 3]

        int currPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[currPos] = nums[i];
                currPos++;
            }
        }

        return currPos + 1;
    }
}
