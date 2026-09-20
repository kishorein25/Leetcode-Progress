        int count = 0;
    public int majorityElement(int[] nums) {
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

class Solution {
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
         return candidate;
    }
