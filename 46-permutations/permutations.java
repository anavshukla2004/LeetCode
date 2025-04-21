class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtracking(result,new ArrayList<>(),nums);
        return result;
    }
    static void backtracking(List<List<Integer>> result,ArrayList<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
        
        backtracking(result, temp, nums);
        temp.remove(temp.size()-1);
        }
        
    }
}