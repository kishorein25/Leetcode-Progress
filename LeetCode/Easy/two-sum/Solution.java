class Solution {
    public int[] twoSum(int[] n, int t) {
        for (int i = 1; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                if (n[j] + n[j - 1] == t) {
                    return new int[] { j, j - i };
                }
            }
        }
