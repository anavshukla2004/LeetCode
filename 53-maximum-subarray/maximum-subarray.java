class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int currsum=0;
        for( int i : nums){
            if( currsum<0)
            currsum=0;
            currsum+=i;
            res=Math.max(currsum, res);
        }        
        return res;
        
    }
}