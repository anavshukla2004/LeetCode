class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int f=i+1;
            int l=n-1;
            while(f<l){
                int sum=nums[i]+nums[f]+nums[l];
                if(sum==0){
                   List<Integer> list=Arrays.asList(nums[i],nums[f],nums[l]);
                    f++;
                    l--;
                    while(f<l&& nums[f]==nums[f-1]){
                        f++;
                    }
                    while(f<l&& nums[l]==nums[l+1]){
                        l--;
                    }
                    set.add(list);
                }
                else if(sum<0){
                    f++;
                }
                else{
                    l--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}