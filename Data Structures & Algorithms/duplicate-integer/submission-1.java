class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uNums.contains(nums[i])) {
                return true;
            }
            uNums.add(nums[i]);
        }
        return false;
    }
}