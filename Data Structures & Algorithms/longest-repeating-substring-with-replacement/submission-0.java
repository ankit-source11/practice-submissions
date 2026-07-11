class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int result = 0;
        int l = 0;
        int r = 0;
        while (r<s.length()) {
            frequencyMap.put(s.charAt(r), frequencyMap.getOrDefault(s.charAt(r),0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(s.charAt(r)));
            
            if ((r - l + 1) - maxFrequency > k) {
                frequencyMap.put(s.charAt(l), frequencyMap.get(s.charAt(l)) - 1);
                l++; 
            } 
            result = Math.max(result, r - l + 1);
            r++;
        }
        return result;
    }
}
