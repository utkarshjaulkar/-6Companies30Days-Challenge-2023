package Microsoft;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int sum = 0;
        helper(1, 9, k, n, sum, ans, subset);
        return ans;
    }

    void helper(int start, int end, int k, int n, int sum, List<List<Integer>> ans, List<Integer> subset) {

        if (k == 0) {
            if (sum == n) {
                ans.add(new ArrayList(subset));
                return;
            }
            return;
        }

        if (start > end)
            return;

        if (sum > n)
            return;

        sum += start;
        subset.add(start);
        helper(start + 1, end, k - 1, n, sum, ans, subset);

        sum -= start;
        subset.remove(subset.size() - 1);
        helper(start + 1, end, k, n, sum, ans, subset);
    }
}