class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;
            if(nozero(a)&&nozero(b)){
                return new int[]{a,b};
            }
            
        }
        return new int[]{-1,-1};
        
    }
    public boolean nozero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}