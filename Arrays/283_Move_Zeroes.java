class Solution {
    public void moveZeroes(int[] nums) {
        int Index = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[Index] = nums[i];
                Index++;
            }
        }
        for (int i = Index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
