class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < strs[0].length(); i++) {
            int j=0;
            for (; j < strs.length - 1; j++) {
                if (i >= strs[j].length() || i >= strs[j + 1].length() || strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    break;
                }
            }
            if (j + 1 == strs.length) {
                str.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        
        return str.toString();
    }
}
