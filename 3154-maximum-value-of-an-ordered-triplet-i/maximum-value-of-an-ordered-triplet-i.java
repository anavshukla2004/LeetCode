class Solution {
    public long maximumTripletValue(int[] nums) {
        int maxnum=0;
        int maxdiff=0;
        long res=0;
        for(int num:nums){
            res=Math.max(res,(long)maxdiff*num);
            maxdiff=Math.max(maxdiff,maxnum-num);
            maxnum=Math.max(maxnum,num);
        }
        return res;
        
    }
}