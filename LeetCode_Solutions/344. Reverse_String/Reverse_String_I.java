	class Solution {
	    public String reverseString(String s) {
	        if(s == null || s.length() == 0) return s;
	        StringBuilder sb = new StringBuilder(s);
	        return sb.reverse().toString();
	    }
	}



	/*
	思路：利用stringbuilder 里的内置method来解决

	Time: O(1)  Space: O(1)
	*/