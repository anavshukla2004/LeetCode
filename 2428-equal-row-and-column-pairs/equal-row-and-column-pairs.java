class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <grid.length; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String s=sb.toString();
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]).append(",");
            }
            String sp=sb.toString();
            count+=map.getOrDefault(sp,0);
        }
        return count;
    }
}