class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int peakindex=0;
        int f=0;
        int l=n-1;
        while(f<l){
            if(nums[f]<nums[l]){
                peakindex=l;
                f++;
            }
            else if(nums[f]>nums[l]){
                peakindex=f;
                l--;
            }
            else{
                peakindex=f;
                l--;
            }
        }
        return peakindex;
    }
}