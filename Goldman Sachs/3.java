// Factorial with Trailing Zeroes
// https://leetcode.com/problems/factorial-trailing-zeroes/

class Solution {
    public int trailingZeroes(int n) {
        
        int sum=0;
        while(n>0)
        {
            n=n/5;
            sum = sum + n;
         
        }
        return sum;

    }
    
}