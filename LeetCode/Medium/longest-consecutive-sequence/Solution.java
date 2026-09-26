
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]-1 == smallest){

                cnt++;
                smallest = nums[i];
            }
            else if(nums[i] != smallest){

                cnt = 1;
                smallest = nums[i];
            }
            }

            streak = Math.max(cnt,streak);
                            
        int smallest = nums[0];
        int streak = 1;
        int cnt = 1;


        Arrays.sort(nums);

class Solution {
    public int longestConsecutive(int[] nums) {
