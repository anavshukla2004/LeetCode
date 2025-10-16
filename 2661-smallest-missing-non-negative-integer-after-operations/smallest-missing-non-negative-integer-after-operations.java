class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int freq[]=new int[value];
        for(int i:nums){
            int mod=((i%value)+value)%value;
            freq[mod]++;
        }
        int i=0;
        while(true){
            int mod=i%value;
            if(freq[mod]==0) return i;
            freq[mod]--;
            i++;
        }
    }
}