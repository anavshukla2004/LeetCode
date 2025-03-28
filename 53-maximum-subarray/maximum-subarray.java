class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for( int i : nums){
            if( sum<0)
            sum=0;
            sum+=i;
           max = sum > max ? sum : max;
        }        
        return max;
        
    }
}