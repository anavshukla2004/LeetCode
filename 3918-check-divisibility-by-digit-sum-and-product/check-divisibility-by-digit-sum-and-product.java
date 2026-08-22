class Solution {
    public boolean checkDivisibility(int n) {
        int dsum=0;
        int dprod=1;
        boolean flag=false;
        int x=n;
        while(x>0){
            int r=x%10;
            dsum+=r;
            dprod=dprod*r;
            x=x/10;            
        }
        int sum=dprod+dsum;
        if(n%sum==0){
            flag=true;
        }
        return flag;
    }
}