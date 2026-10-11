
        for(int i=0;i<n;i++){

            char cur = s.charAt(i);

            while(hs.contains(cur)){
                hs.remove(s.charAt(j));
            }
                j++;

            hs.add(cur);
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
            max = Math.max(max , i-j +1);
        }
        return max;        
    }
}
