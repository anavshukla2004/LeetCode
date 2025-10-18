class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int num:nums){
            int lowerbound=num-k;
            int upperbound=num+k;
            if(max<lowerbound){
                max=lowerbound;
                count++;
            }
            else if(max<upperbound){
                max++;
                count++;
            }
        }   
        return count;
    }
}