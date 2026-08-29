class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOfAnagrams = new HashMap<>();
        for (String str : strs) {
            char[] stringArray = str.toCharArray();
            Arrays.sort(stringArray);
            if (!mapOfAnagrams.containsKey(new String(stringArray))) {
                mapOfAnagrams.put(new String(stringArray), new ArrayList<String>());
            }
            mapOfAnagrams.get(new String(stringArray)).add(str); 
        }

        return new ArrayList<>(mapOfAnagrams.values());
    }
}
