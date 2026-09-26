        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid=(left+right)/2;

            if(mid % 2 == 1){
                mid = mid-1;
            }
    public int singleNonDuplicate(int[] nums) {
class Solution {

            if(nums[mid] == nums[mid+1]){
                left = mid+2;
            }

            else{
                right = mid-1;
            }
        }
        return nums[left];
    }
}
