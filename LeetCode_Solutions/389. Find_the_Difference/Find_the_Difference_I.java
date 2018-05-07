class Solution {
    public char findTheDifference(String s, String t) {
        char letter = 0;
        for(char c : s.toCharArray()){
             letter ^= c;
        }
        for(char c: t.toCharArray()){
             letter ^= c;
        }
        return letter;
    }
}


/*
Method: Bit Manipulation

Time: O(t)  Space: O(1)
*/
