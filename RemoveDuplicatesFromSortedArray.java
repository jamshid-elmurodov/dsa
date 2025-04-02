public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
//        [0,1,2,3,c2,3,3,i4]
//        [0,1,2,3,4,...]

        int currPos = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[currPos] < nums[i]) {
                currPos++;
                nums[currPos] = nums[i];
            }
        }

        return currPos;
    }
}
