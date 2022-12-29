// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * EX-OR operation in duplicate numbers will always result in 0. Hence, only the single number will be left.
 */

public class SingleNum {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        
        for(int num: nums)
        {
            bitmask ^= num;
        }
        
        return bitmask;
    }
}
