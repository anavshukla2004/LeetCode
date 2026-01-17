class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int l=0, max=0;
        for(int r=0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                l=Math.max(l,mp.get(s.charAt(r))+1);
            }
            mp.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}