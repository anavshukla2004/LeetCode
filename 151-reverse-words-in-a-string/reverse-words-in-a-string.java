class Solution {
    public String reverseWords(String s) {
        if(s.isEmpty()){
            return s;
        }
        String[] words=s.split("\\s+");//s+ is used split the string between spaces.
        StringBuilder reversed=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i>0){
                reversed.append(" ");
            }
        } 
        return reversed.toString().trim();      
    }
}