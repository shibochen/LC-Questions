class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Time: O(n)  Space: O(1)

http://www.pythontutor.com/visualize.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20boolean%20canConstruct%28String%20ransomNote,%20String%20magazine%29%20%7B%0A%20%20%20%20%20%20%20%20int%5B%5D%20arr%20%3D%20new%20int%5B26%5D%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20magazine.length%28%29%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20arr%5Bmagazine.charAt%28i%29%20-%20'a'%5D%2B%2B%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20ransomNote.length%28%29%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%28--arr%5BransomNote.charAt%28i%29%20-%20'a'%5D%20%3C%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20return%20false%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20true%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20String%20a%20%3D%20%22aa%22%3B%0A%20%20%20%20%20%20%20%20String%20b%20%3D%20%22aab%22%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20System.out.println%28canConstruct%28a,%20b%29%29%3B%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
