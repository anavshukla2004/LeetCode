class Solution {

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;

        while (candies > 0) {
            int give = Math.min(candies, i + 1);
            res[i % num_people] += give;
            candies -= give;
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ans = s.distributeCandies(10, 3);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
