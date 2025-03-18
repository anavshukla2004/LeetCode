class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        for(int i=0;i<=s.length()-1;++i){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
        
    }
}