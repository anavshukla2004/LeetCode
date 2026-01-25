class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        int max=0,i=0,j=n-1;
        Arrays.sort(nums);
        while(i<j){
            int sum=nums[i]+nums[j];
            max=Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}