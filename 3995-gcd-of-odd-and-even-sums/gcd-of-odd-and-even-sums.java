class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a =0;
        int b=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0)
                a+=i;
            else
                b+=i;
        } 
        return gcd(b,a);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
             b=a%b;
            a=temp;
        }
        return a;
    }
}