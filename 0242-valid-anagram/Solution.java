/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
  if(s.length() != t.length()) return false ;

  int [] count = new int[26] ;
  for(int i = 0 ; i < s.length()  ; i ++){
  count[s.charAt(i) - 'a'] ++ ;
  count[t.charAt(i) - 'a'] -- ;

} 
for(int counnt : count){
if(counnt != 0) return false ;

}
    

        return  true  ; 

    }
}
// @lc code=end

