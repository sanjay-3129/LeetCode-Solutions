/*
Question Link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. 
You should minimize the number of calls to the API.
*/

  // not efficient, T - O(n), time limit exceeded
	public static int firstBadVersion(int n) {
		for (int i = 1; i < n; i++) {
			if (isBadVersion(i)) {
				return i;
			}
		}
		return n;
	}

	// binary search, T - O(log n), S - O(1)
	public static int firstBadVersion1(int n) {
		int left = 1;
		int right = n;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}
