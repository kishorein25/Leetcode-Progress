        int start = 0;
        int end = 0;

        for(int i=0;i<k;i++){
            start = start + cardPoints[i];
        }

        for(int j = cardPoints.length-1;j >= cardPoints.length-k;j--){
        int max = 0;
            end = end + cardPoints[j];
        } 
    }

        max = start < end ? end : start;
        return max;
}

    public int maxScore(int[] cardPoints, int k) {
class Solution {
