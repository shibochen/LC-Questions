class Solution {
    public int[] singleNumber(int[] nums) {
        int[] output = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        int i = 0;
        for(Integer s : set){
            output[i++] = s;
        }
        return output;
    }
}

/*
利用hashset的独一性，然后放到一个新的array
*/
