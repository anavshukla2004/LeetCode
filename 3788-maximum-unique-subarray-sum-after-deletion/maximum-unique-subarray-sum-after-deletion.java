
class Solution {
    public int maxSum(int[] nums) {
        int maxNeg=Integer.MIN_VALUE;
        boolean visited[]=new boolean[101];
        int sum=0;
        for(int val:nums){
            if(val<=0){
                maxNeg=Math.max(maxNeg,val);
            }
            else if(!visited[val]){
               sum+=val;
               visited[val]=true;
            }
        }
        return sum==0?maxNeg:sum;
    }
}