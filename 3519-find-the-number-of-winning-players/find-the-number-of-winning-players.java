class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int winners = 0;
        Map<Integer, Map<Integer, Integer>> playerBallCount = new HashMap<>();
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            playerBallCount.putIfAbsent(player, new HashMap<>());
            Map<Integer, Integer> colorCount = playerBallCount.get(player);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        for (Map.Entry<Integer, Map<Integer, Integer>> entry : playerBallCount.entrySet()) {
            int player = entry.getKey();
            Map<Integer, Integer> colorCount = entry.getValue();
            
            for (int count : colorCount.values()) {
                if (count > player) {
                    winners++;
                    break;
                }
            }
        }

        return winners;

    }
}