class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int x=0;
        List<Boolean> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            x=(x*2+nums[i])%5;
            arr.add(x==0);
        }
        return arr;
    }
}