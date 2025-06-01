class Solution {
    public int findClosestNumber(int[] nums) {
        int pos = Integer.MAX_VALUE; 
        int neg = Integer.MIN_VALUE; 
        
        for (int num : nums) {
            if (num >= 0) {
                pos = Math.min(pos, num);
            } else {
                neg = Math.max(neg, num);
            }
        }
        if (pos == Integer.MAX_VALUE) return neg;
        if (neg == Integer.MIN_VALUE) return pos;
        return (pos == Math.abs(neg)) ? pos : (pos < Math.abs(neg) ? pos : neg);
    }
}