/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set <Integer> set = new HashSet<>() ; 
        for (int i = 0 ; i < nums.length ; i ++){
            if(set.contains(nums[i])) return true ; 
            set.add(nums[i]) ; 
            if (set.size() > k ) {
                set.remove(nums[i-k]) ; 
                
            }
        }
        return false ;
    }
}
// @lc code=end

