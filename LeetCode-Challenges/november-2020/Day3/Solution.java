/*

Question Link: https://leetcode.com/explore/featured/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3518/

Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.
Return the power of the string.

*/

class Solution {
    public int maxPower(String s) {
        if(s.length() == 0) {
			    return 0;
		    }
		    int max = 1;
		    int count = 1;
		
		    for(int i=0; i<s.length()-1; i++) {
			    if(s.charAt(i) == s.charAt(i+1)) {
				    count++;
				    if(count > max) {
					    max = count;
				    }
			    } else {
				    count = 1;
			    }
		    }
		  return max;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
