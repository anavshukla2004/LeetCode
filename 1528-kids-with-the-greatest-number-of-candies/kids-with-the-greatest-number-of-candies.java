class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max=candies[0];
       for(int candy:candies){
        if(candy>max){
            max=candy;
        }
       }
       List<Boolean> list=new ArrayList<>();
       for(int i:candies){
        list.add((i+extraCandies)>=max);
       }
       return list;
    }
}