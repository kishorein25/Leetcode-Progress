import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        int count = 0;
        int j=0;
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char cur=s.charAt(i);
            while(hs.contains(cur)){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(cur);
            count=Math.max(count,i-j +1);
        }
        return count;
    }
}
