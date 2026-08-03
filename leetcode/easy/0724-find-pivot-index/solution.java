class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // rightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}