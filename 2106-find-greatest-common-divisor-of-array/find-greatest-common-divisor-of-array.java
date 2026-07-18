class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[n-1];

        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}