        for(int i=0;i<k;i++){
            left += cardPoints[i];
        }

        max = left;
        for(int j = k-1;j>= 0;j--){

        int index = cardPoints.length-1;
            right +=cardPoints[index];
            index--;
            left -=cardPoints[j];
            max = Math.max(max , left+right);

        int max = 0;

        }
        return max;
    }
}
