 	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
        	//if found, indexOf return the index, if not found, it returns -1;
            while(strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
        }
        return prefix;
    }

    //Note: Key point for solving this question
    //		1. indexOf()  method
    //      2. substring() method
    //      Time: O(s)  Space: O(1)