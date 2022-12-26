// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * In any number problem, think of the following approach-
 * Only an ugly number can produce another ugly number. For eg, 7 is not an ugly number so it can never produce an
 * ugly number.
 * 1 - Start with 1, multiply it with all the factors i.e. 2,3, & 5 - It will generate 2,3, & 5. Take 2 and multiply with PF.
 * 2 - This will produce 4,6 & 10. Now, take 3 and so on.
 * 3 - To maintain order, use a Priority Queue - the top element will always be minimum and maintain order
 * 4 - To avoid repetitions, use a HashSet.
 */
class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        long curr = (long)1;
        pq.add(curr);
        set.add(curr);
        int count = 0;
        int[] primes = new int[]{2,3,5};
        
        while(count < n)
        {
            curr = pq.poll();
            count++;
            for(int prime: primes)
            {
                Long newUgly = prime*curr;
                if(!set.contains(newUgly))
                {
                    set.add(newUgly);
                    pq.add(newUgly);
                }
            }
        }
        return (int)curr;
    }
}