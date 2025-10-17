class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double.NEGATIVE_INFINITY;
        int n=nums.length;
        for (int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            max=Math.max(max,(double)sum/k);
        }
        return max;
    }
}