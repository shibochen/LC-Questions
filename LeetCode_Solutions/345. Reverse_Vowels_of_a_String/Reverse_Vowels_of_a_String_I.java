class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0, end = s.length() - 1;

        while(start < end) {
            while(start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }

            while(start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
}

/*
Two pointer methods;
String method---boolean contains(CharSequence s): It checks whether the string contains the specified sequence of char values.
If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.
*/
