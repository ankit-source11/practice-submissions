class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequency = new List[nums.length+1];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                frequency[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        for (int i = frequency.length - 1; i>0 && index<k; i--) {
            for (int n : frequency[i]) {
                result[index] = n;
                index++;
                if (index == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
