class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        Map<List<Integer>,Integer> map=new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer>  al = new ArrayList<>();
            for (int j = 0; j <grid.length; j++) {
                al.add(grid[i][j]);
            }
            map.put(al,map.getOrDefault(al,0)+1);
        }

        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer>  la = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                la.add(grid[j][i]);
            }
            count+=map.getOrDefault(la,0);
        }
        return count;
    }
}