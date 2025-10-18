class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0, max = 0;
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        max = count;
        for (int i = k; i < n; i++) {
            char in = s.charAt(i);
            char out = s.charAt(i - k);

            if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u')
                count++;
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u')
                count--;

            max = Math.max(max, count);
        }

        return max;
    }
}
