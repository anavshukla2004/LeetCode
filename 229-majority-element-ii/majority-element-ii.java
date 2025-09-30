class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3)
                list.add(entry.getKey());
        }
        return list;
    }
}