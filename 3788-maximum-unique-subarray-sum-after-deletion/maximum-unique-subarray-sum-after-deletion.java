class Solution {
    public int maxSum(int[] nums) {
        int maxneg=Integer.MIN_VALUE;
        int sum=0;
        boolean[] visited=new boolean[101];
        for(int val:nums){
            if(val<=0){
            maxneg=Math.max(maxneg,val);
            }
            else if(!visited[val]){
                sum+=val;
                visited[val]=true;
            }

        }
        return sum==0?maxneg:sum;

    }
}

