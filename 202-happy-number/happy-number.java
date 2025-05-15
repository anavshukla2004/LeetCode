import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();

        while (n != 1 && !res.contains(n)) {
            res.add(n);
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
