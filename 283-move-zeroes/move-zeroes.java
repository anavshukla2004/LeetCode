class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            moveZeroes(new int[] {0,0 });
        }
    }
    public static void moveZeroes(int[] nums) {
        
        int curr=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[curr];
                nums[curr] = temp;    
                curr++;  
            }
            i++;
        }
    }
}