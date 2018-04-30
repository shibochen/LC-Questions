	class Solution {
	    public int lengthOfLastWord(String s) {
	        String[] strs = s.split("\\s+");
	        return strs.length == 0 ? 0 : strs[strs.length - 1].length();
	    }
	}

	/*
	思路：首先将String转化成array，然后找到array的最后一个element并取其长度

	Time: O(1)  Space: O(1)
	
	薄弱点： Java's regular expression

	*/