class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10+(x%10);
            x/=10;
        }
        if(rev>Integer.MIN_VALUE&&rev<Integer.MAX_VALUE){
            return (int)rev;
        }
        return 0;
        
    }
}