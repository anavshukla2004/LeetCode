class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minindex]){
                minindex=i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }
        int a =Math.min(minindex,maxindex);
        int b=Math.max(minindex,maxindex);
        int front=b+1;
        int back=n-a;
        int both=(a+1)+(n-b);
        return Math.min(both,Math.min(front,back));
    }
}