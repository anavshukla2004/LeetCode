class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int x=0;
        int y=n-1;
        int result=0;
        while(x<y){
            int area=(y-x)*Math.min(height[x],height[y]);
            if(result<area){
                result=area;
            }
            if(height[x]<height[y]){
                x++;
            }
            else{
                y--;
            }
        }
        return result;
    }
}