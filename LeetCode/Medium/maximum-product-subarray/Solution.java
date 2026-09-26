        for (int i = 0; i < n; i++) {

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix = prefix * nums[i];

        int ans = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
class Solution {
    public int maxProduct(int[] nums) {
