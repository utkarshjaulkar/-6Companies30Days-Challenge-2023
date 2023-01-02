package Microsoft;

//You are given an integer array nums of length n. Return maximum length of Rotation Function.
//https://leetcode.com/problems/rotate-function/

class Solution {
    public int maxRotateFunction(int[] nums) {
        int F = 0;
        int S = 0;
        for (int i = 0; i < nums.length; i++) {
            F = F + (nums[i] * i);
            S = S + nums[i];
        }

        int max = F; // this is F0
        int n = nums.length;
        for (int i = n - 1; i >= 1; i--) {
            F = F + S - n * nums[i];
            max = Math.max(max, F);
        }
        return max;
    }
}
