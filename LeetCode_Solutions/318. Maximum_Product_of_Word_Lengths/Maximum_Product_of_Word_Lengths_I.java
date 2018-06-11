class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length <= 1) {
            return 0;
        }
        int len = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                //words【i】里的所有小写字母存在int里
                value[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((value[i] & value[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }
}

/*
题意：给我们了一个单词数组，让我们求两个没有相同字母的单词的长度之积的最大值
题目中说都是小写字母，那么只有26位，一个整型数int有32位，我们可以用后26位来对应26，如果出现过为 1
将数组里的元素两两进行与（&），如果等到0，说明没有相同字母，具体代码显示在 13-20；
列入【“ab”，“cd”】
在代码10行，  value【0】 = 11
在代码10hang  value【1】 = 1100

然后将他们进行比较，可以得出答案
*/
