class Solution {
    public int findDuplicate(int[] nums) {
        int ans=-1;
        HashMap<Integer,Integer>  mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int key:mp.keySet()){
            if(mp.get(key)>1){
                ans=key;
                break;
            }
        }
        return ans;
    }
}