class Solution {
    public int specialArray(int[] nums) {
        int i=1;
        do{
            int count=0;
            for(int num:nums){
                if(num>=i){
                    count++;
                }
               
            }
            if(count==i){
                return count;
            }
            i++;
        }while(i<=nums.length);
        return -1;
    }
}