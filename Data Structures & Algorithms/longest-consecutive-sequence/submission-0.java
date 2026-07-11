class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> allNumbers = new HashSet<>();
        for (int num : nums) {
            allNumbers.add(num);
        }
        int longestSeq = 0;
        for (int num : allNumbers) {
            int currentSeq = 1;
            if (!allNumbers.contains(num-1)) {
                int j = 1;
                while (allNumbers.contains(num+j)) {
                    currentSeq++;
                    j++;
                }
            }
            longestSeq = Math.max(longestSeq, currentSeq);
        }
        return longestSeq;
    }
}
