class Solution {
    public int nextBeautifulNumber(int n) {
       while(true){
        n=n+1;
        if(isBeautiful(n))return n;
       }
        
    }
    public boolean isBeautiful(int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(n>0){
            int r=n%10;
            mp.put(r,mp.getOrDefault(r,0)+1);
            n/=10;
        }
        for(int k:mp.keySet()){
            if(k!=mp.get(k)){
                 return false;
            }
        }
        return true;
    }
}