class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int x=str1.length();
        int y=str2.length();
        
        while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
        }
        return str1.substring(0,x);
        
    }
}