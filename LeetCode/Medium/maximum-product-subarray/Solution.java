class Solution {
    public int maxProduct(int[] nums) {
        int maxv = 0;
        for(int i=1;i<nums.length;i++){
            int product = nums[i] * nums[i-1];
            if(product > maxv){




        if(nums.length==1){
            return nums[0];
        }
