class Solution {
    public String decodeString(String s) {
        Stack<Integer> intstack=new Stack<>();
        Stack<StringBuilder> strstack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int d=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                d=d*10+(c-'0');
            }
            else if(c=='['){
                intstack.push(d);
                strstack.push(current);
                current=new StringBuilder();
                d=0;
            }
            else if(c==']'){
                int num=intstack.pop();
                StringBuilder prev=strstack.pop();
                for(int i=0;i<num;i++){
                    prev.append(current);
                }
                current=prev;
            }
            else{
                current.append(c);
            }
        }
        return current.toString();
    }
}