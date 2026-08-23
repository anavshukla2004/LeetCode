class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long start=lower;
        List<List<Integer>> ans=  new ArrayList<>();
        for(int num:nums){
            if(num<start) continue;
            if(num>upper) break;
            if(num>start){
                ans.add(Arrays.asList((int)start,num-1));
            }
            start=(long)num+1;
        }
        if(start<=upper){
            ans.add(Arrays.asList((int)start,upper));
        }
    
        return ans;
    }
}