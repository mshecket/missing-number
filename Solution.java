/* https://leetcode.com/problems/missing-number/
 * 
 * Submission: https://leetcode.com/submissions/detail/271407559/
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * 
 * Example 1:
 * 
 * Input: [3,0,1]
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 */
 
 class Solution {
    public int missingNumber(int[] nums) {
    
        // To find the missing number, I first calculate the sum of the integer sequence starting
        // with 1 and ending at nums.length + 1 (which would be the length of the sequence if the
        // missing number were present), using the formula:
        //
        // sum of the first n integers = n*(n-1)/2
        //
        // This sum is what the numbers in the array would add up to if all were present.
        // Then I use the helper method sum() from the IntStream class to find the actual
        // sum of the numbers in the nums array. The difference is the missing number.
        
        return (nums.length+1) * nums.length / 2 - IntStream.of(nums).sum();
    }
}
