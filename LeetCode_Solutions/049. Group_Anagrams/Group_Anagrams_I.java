class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create an empty arraylist
        List<List<String>> result = new ArrayList<List<String>>();
        //boundary check
        if(strs == null || strs.length == 0) return result;
        //create an emtpy hashmap
        HashMap<String, Integer> map = new HashMap<>();
        //iterate the array, strs[]
        for(String str : strs){
            //convert each element of array,strs[] to array
            char[] letter = str.toCharArray();
            //sort each character
            Arrays.sort(letter);
            //convert array to string
            String s = new String(letter);
            //check whether map contains key
            if(map.containsKey(s)){
                //if it has, find the corresponding list
                List<String> list = result.get(map.get(s));
                //add element to the list
                list.add(str);
            }else{
                //create an empty arraylist
                List<String> list = new ArrayList<>();
                //add element to the List
                list.add(str);
                //store element as key and size as value to the map;
                map.put(s, result.size());
                result.add(list);
            }
        }
        return result;
    }
}

/*
思路：将array里的string重新sort再判定element是否是相同，相同就放在每组sublist里，然后在把所有sublist
    放到一个总List里面
*/

