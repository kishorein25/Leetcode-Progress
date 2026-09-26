class Solution {
    public int maxProduct(int[] nums) {
        int maxv = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            int product = nums[i] * nums[i-1];
            if(product > maxv){
