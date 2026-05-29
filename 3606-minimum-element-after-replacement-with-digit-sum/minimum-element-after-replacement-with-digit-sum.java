class Solution {
    public int minElement(int[] nums) {
        int min=nums[0];
        for(int i:nums){
            int sum=0;
            if(i>9){
                while(i>0){
                    sum+=i%10;
                    i=i/10;
                }
            }
            else{
                sum=i;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}