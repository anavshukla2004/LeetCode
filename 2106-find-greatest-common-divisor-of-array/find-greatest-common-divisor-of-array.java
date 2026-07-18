class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return gcd(min,max);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}