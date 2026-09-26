class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans[0]=nums[i];
                ans[1]=nums[i]+1;
            }
        }
        return ans;
