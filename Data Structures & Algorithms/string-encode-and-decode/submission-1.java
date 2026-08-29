class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            int delim = s.indexOf("#", index);
            int length = Integer.parseInt(s.substring(index, delim));
            String str = s.substring(delim+1, delim+1+length);
            decodedStrings.add(str);
            index = delim + 1 + length;
        }
        return decodedStrings;
    }
}
