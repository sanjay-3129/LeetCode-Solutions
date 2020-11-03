/*
Question Link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have. 
You want to know how many of the stones you have are also jewels. The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/

  // T - O(n), S - O(1) but in worst case T - O(n^2) bcs contains() time comp is O(n).
	public static int numJewelsInStones(String J, String S) {
		int count = 0;

		if (J.length() == 0 || S.length() == 0)
			return 0;

		for (int i = 0; i < S.length(); i++) {
			if (J.contains(S.substring(i, i + 1)))
				count++;
		}

		return count;
	}

	// more efficient than the above, T- O(n), S - O(n)
	public static int numJewelsInStones1(String J, String S) {
		int count = 0;

		if (J.length() == 0 || S.length() == 0)
			return 0;
		
		int[] arr = new int[128];
		
		for (int i = 0; i < J.length(); i++) {  
			char a = J.charAt(i);
			arr[a & 127] = a;
		}
		
		for(int i=0; i<S.length(); i++) {
			char a = S.charAt(i);	
			if(arr[a & 127] == a) count++;
		}

		return count;
	}
