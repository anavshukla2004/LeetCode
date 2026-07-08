class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] next = new int[n];
        int[] prev = new int[n];

        // next non-zero
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') last = i;
            next[i] = last;
        }

        // previous non-zero
        last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') last = i;
            prev[i] = last;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                digits.add(s.charAt(i) - '0');
                pos.add(i);
            }
        }

        int m = digits.size();

        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        long[] prefixValue = new long[m + 1];
        int[] prefixSum = new int[m + 1];

        for (int i = 0; i < m; i++) {
            prefixValue[i + 1] = (prefixValue[i] * 10 + digits.get(i)) % MOD;
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
        }

        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < m; i++)
            index.put(pos.get(i), i);

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            int l = queries[k][0];
            int r = queries[k][1];

            int leftPos = next[l];
            int rightPos = prev[r];

            if (leftPos == -1 || rightPos == -1 || leftPos > rightPos) {
                ans[k] = 0;
                continue;
            }

            int L = index.get(leftPos);
            int R = index.get(rightPos);

            int len = R - L + 1;

            long x = (prefixValue[R + 1]
                    - prefixValue[L] * pow10[len] % MOD
                    + MOD) % MOD;

            long sum = prefixSum[R + 1] - prefixSum[L];

            ans[k] = (int) (x * sum % MOD);
        }

        return ans;
    }
}