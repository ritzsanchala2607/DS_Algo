class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // Pointer for placing non-zero elements

        // Move non-zero elements to the front
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill the rest with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
