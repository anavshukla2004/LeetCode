class Solution {
    public int specialArray(int[] nums) {
        int count=0;
        for(int i=1;i<=100;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            if(count!=i){
                count=0;
            }
            else 
            return count;
        }
        return -1;
    }
}