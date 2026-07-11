class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i<nums.length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int R = 1;
        for (int j = nums.length - 1; j>=0; j--) {
            output[j] = output[j] * R;
            R = R * nums[j];
        }
        return output;
    }
}  
