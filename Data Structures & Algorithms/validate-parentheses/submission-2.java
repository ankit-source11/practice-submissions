class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        Map<Character, Character> map = Map.of('}', '{',')','(', ']','[');
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
