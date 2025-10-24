import java.util.HashMap;

class Solution {
    public int nextBeautifulNumber(int n) {
        while (true) {
            n++;
            if (isBeautiful(n)) return n;
        }
    }

    public boolean isBeautiful(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int temp = n;
        while (temp > 0) {
            int r = temp % 10;
            mp.put(r, mp.getOrDefault(r, 0) + 1);
            temp /= 10;
        }
        for (int k : mp.keySet()) {
            if (k == 0 || mp.get(k) != k) {
                return false;
            }
        }
        return true;
    }
}
