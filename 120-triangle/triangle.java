class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> lastrow=triangle.get(triangle.size()-1);
        List<Integer> mini=new ArrayList<>(lastrow);
        for(int i=triangle.size()-2;i>=0;i--){
            List<Integer> row=triangle.get(i);
            for(int j=0;j<row.size();j++){
                mini.set(j,Math.min(mini.get(j),mini.get(j+1))+row.get(j));
            }
        }
        return mini.get(0);
    }
}