                return true;
            if (nums[mid] == t) {

            mid = l + (r - l / 2);
            }

            else if(nums[mid] < t){
                l=mid+1;
            }

            else if(nums[mid] > t){
                r = mid-1;

        while (l < r) {

        int mid;
        int r = nums.length - 1;
