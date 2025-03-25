public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = 1;

        while (r < nums.length){
            if(nums[l] == val && nums[r] != val){
                nums = swap(nums, l, r);
                l++;
            }

            r++;
        }

        return l;
    }

    int[] swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

        return nums;
    }
}
