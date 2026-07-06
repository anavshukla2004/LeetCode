class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int f=i+1;
            int l=n-1;
            while(f<l){
                int sum=nums[i]+nums[f]+nums[l];
                if(sum>0) l--;
                else if(sum<0) f++;
                else{
                    List<Integer> list=Arrays.asList(nums[i],nums[f],nums[l]);
                    result.add(list);
                    f++;
                    l--;
                    while(f<l &&nums[f]==nums[f-1])f++;
                    while(f<l && nums[l]==nums[l+1])l--;
                }
            }
        }
        return result;
    }
}