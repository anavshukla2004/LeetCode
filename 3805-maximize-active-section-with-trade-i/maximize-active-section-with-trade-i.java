class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        List<Character> type = new ArrayList<>();
        List<Integer> len = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (type.isEmpty() || type.get(type.size() - 1) != c) {
                type.add(c);
                len.add(1);
            } else {
                len.set(len.size() - 1, len.get(len.size() - 1) + 1);
            }
        }

        int gain = 0;

        for (int i = 1; i < type.size() - 1; i++) {
            if (type.get(i) == '1' &&
                type.get(i - 1) == '0' &&
                type.get(i + 1) == '0') {

                gain = Math.max(gain,
                        len.get(i - 1) + len.get(i + 1));
            }
        }

        return ones + gain;
    }
}