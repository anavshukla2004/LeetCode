class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int len = 0;

            for (int j = i; j < s.length(); j++) {
                if (sb.indexOf(String.valueOf(s.charAt(j))) != -1) { 
                    break;
                }
                sb.append(s.charAt(j));
                len++;
            }
            count = Math.max(count, len);
        }
        return count;
    }
}
