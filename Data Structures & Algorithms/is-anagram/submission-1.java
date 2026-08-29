class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        if (Arrays.equals(sortedS, sortedT)) {return true;}
        return false;
    }
}
