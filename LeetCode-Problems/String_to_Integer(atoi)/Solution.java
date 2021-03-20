// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    // Time complexity - O(n), space complexity = O(1)
    public int myAtoi(String s) {
        int n = 0, index = 0, length = s.length(), value;
        boolean isNegative = false;
        
        while(index < length && s.charAt(index) == ' ')
            index++;
        
        if(index < length && s.charAt(index) == '-'){
            isNegative = true;
            index++;
        } else if(index < length && s.charAt(index) == '+') {
            index++;
        }
        
        while(index < length && (s.charAt(index) - '0' >= 0) && (s.charAt(index) - '0' <= 9)) {
            value = n;
            
            n = n * 10 + (s.charAt(index) - '0');
            
            if(n / 10 != value) 
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            index++;    
        }
        
        return isNegative ? n * -1 : n;
    }
}
