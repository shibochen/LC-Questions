<<<<<<< HEAD
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
=======
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
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
