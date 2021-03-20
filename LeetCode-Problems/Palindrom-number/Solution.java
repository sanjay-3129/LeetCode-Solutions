class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverse = 0;
        while (x > halfReverse) {
            halfReverse = halfReverse * 10 + x % 10;
            x /= 10;
        }
        return x == halfReverse || x == halfReverse / 10;
    }
  
    // Time - O(n), Space - O(1)
    public boolean isPalindrome(int x) {
        int temp = x, res = 0;
        
        if(x < 0) {
            return false;
        }
        
        while(x != 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        
        if(res == temp){
            return true;
        } 
        return false;
    }
  
    // not efficient than the above one
    public boolean isPalindrome1(int x) {
          if(x < 0) {
              return false;
          }
          String num = "" + x;
          int len = num.length();
          for(int i=0; i<len/2; i++) {
              if(num.charAt(i) != num.charAt(len-1-i)) {
                  return false;
              }
          }
          return true;
      }
}
