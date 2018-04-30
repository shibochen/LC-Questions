    class Solution {
        public boolean isPalindrome(String s) {
            //define empty string as valid pallindrome
            if(s.length() == 0) return true;
            //replace all non-word characters and make all character lowercase
            String str = s.replaceAll("\\W+","").toLowerCase();
            int left = 0, right = str.length() - 1;
            //Use two pointers to check whether the character 
            //on both left and right side are equal or not
            while(left < right){
                //not equal, it means invalid palindrome
                if(str.charAt(left) != str.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
    }

    /*
    解放：two pointers   

    思路：1.取代s里的所有非word的字并且转化整个string为小写
            2. 运用两指针确认string的左右两边的字母是否相等

    Time: O(1)  space: O(1)
    */