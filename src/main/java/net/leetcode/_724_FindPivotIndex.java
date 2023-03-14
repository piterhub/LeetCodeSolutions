package net.leetcode;

public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter += nums[i];
            leftSum[i] = counter;
        }
        counter = 0;
        for (int i = nums.length -1; i > -1; i--) {
            counter += nums [i];
            rightSum[i] = counter;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i])
                return i;       // Return the pivot index...
        }
        return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }
}
