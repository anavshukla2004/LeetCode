class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>  mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Set<Integer> st=new HashSet<>();
        for(int key:mp.keySet()){
            if(!st.add(mp.get(key))){
                return false;
            }
        }
        return true;
    }
}