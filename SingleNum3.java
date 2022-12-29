// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * 1 - Idea is to find the least significant bit. 
 */

public class SingleNum3 {
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;
        
        for(int num:nums)
        {
            bitmask1 ^= num;
        }
        
        int temp = bitmask1 & (-bitmask1);
        int bitmask2 = 0;
        
        for(int num: nums)
        {
            if((temp & num) != 0)
            {
                bitmask2 ^= num;
            }
        }
        
        return new int[]{bitmask2, bitmask2^bitmask1};
    }
}
