public class Solution {
    public int majorityElement(final int[] A) {
        int n=A.length;
        int count =0;
        int element=0;
        for(int a:A){
            if(count==0){
                element=a;
                count=1;
            }
            else{
                if(a==element){
                 count++;
                }
                else{
                    count--;
                }
            }
        }
        return element;
    }
}
