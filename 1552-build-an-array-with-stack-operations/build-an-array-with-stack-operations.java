class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> lst=new ArrayList<>();
        int i=0;
        for(int a=1;a<=n&&i<target.length;a++){
            lst.add("Push");
            if(a==target[i]){
                i++;
            }
            else{
                lst.add("Pop");
            }
        }
        return lst;
    }
}