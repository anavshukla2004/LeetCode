class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int i=0;
        int row=0,column=0;
        boolean up=true;
        int arr[]=new int[m*n];
        while(row<m&&column<n){
            if(up){
                while(row>0&&column<n-1){
                    arr[i++]=mat[row][column];
                    row--;
                    column++;
                }
                arr[i++]=mat[row][column];
                if(column==n-1){
                    row++;
                }
                else
                column++;
            }
            else{
                while(row<m-1&&column>0){
                    arr[i++]=mat[row][column];
                    row++;
                    column--;
                }
                arr[i++]=mat[row][column];
                if(row==m-1)
                column++;
                else
                row++;
            }
            up=!up;

        }
        return arr;
       
        
        
    }
}