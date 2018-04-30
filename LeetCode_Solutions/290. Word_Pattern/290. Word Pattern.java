    public boolean wordPattern(String pattern, String str) {
        //create an empty hashmap
        HashMap<Character, String> map = new HashMap<>();
        //split string and convert it to array;
        String[] strs = str.split(" ");
        //check if both length are equivalent or not
        if(strs.length != pattern.length()) return false;
        
        for(int i = 0; i < strs.length; i++){
            //check if the keys contained in map or not
            if(!map.containsKey(pattern.charAt(i))){
                //if does not contain, check if it contains value
                if(map.containsValue(strs[i])) return false;
                //if no, add the corresponding character and string to the map
                else map.put(pattern.charAt(i), strs[i]);
            }else{
                //true, compare the content of string 
                if(!map.get(pattern.charAt(i)).equals(strs[i])) return false;
            }
        }
        
        return true;
    }

    //Hint: hashMap