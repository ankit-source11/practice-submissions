class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList());
            } 
            map.get(temp).add(str);
        }
        return new ArrayList(map.values());
    }
}
