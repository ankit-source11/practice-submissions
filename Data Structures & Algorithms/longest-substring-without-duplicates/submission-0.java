class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> setOfChar = new HashSet<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (!setOfChar.contains(s.charAt(j))) {
                setOfChar.add(s.charAt(j));
                maxLength = Math.max(maxLength, setOfChar.size());
                j++;
            } else {
                setOfChar.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
