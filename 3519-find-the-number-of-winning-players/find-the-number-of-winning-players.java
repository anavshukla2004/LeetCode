class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        
        int[][] arr = new int[n][11];

        

        for(int i=0;i<pick.length;i++){
            int p = pick[i][0];
            int ch = pick[i][1];

            arr[p][ch]++;

        }
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=10;j++){
                if(arr[i][j]>=(i+1)){
                    count++;
                    break;
                }
            }
        }

        return count;

    }
}