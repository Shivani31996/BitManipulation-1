// Time Complexity :O(log)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Left shifting divides the number by 2
 * Right shifting multiples the number by 2
 */

public class Divide {
    public int divide(int dividend, int divisor) {
        if(divisor == 0)
            return Integer.MAX_VALUE;
        
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;
        
        while(ldividend >= ldivisor)
        {
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts))
            {
                shifts++;
            }
            
            shifts--;
            result += 1 << shifts;
            ldividend = ldividend - (ldivisor << shifts);
        }
        if((divisor < 0 && dividend < 0) || (divisor > 0 && dividend > 0))
            return result;
        return -result;
    }
}
