package net.leetcode;


public class _1480_RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] array = new int[length];
        int counter = 0;
        for(int i=0; i<nums.length; i++) {
            counter = counter + nums[i];
            array[i] = counter;
        }
        return array;
    }
}