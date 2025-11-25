class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int x=0;
        List<Boolean> arr=new ArrayList<>();
        for(int num:nums){
            x=((x*2)+num)%5;
            arr.add(x==0);
        }
        return arr;
    }
}