class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] nums = new int[10];  //0- 9  一共10个数
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (nums[secret.charAt(i) - '0']++ < 0) cows++;
                if (nums[guess.charAt(i)- '0']-- > 0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}


/*
题意为给定两串数字，其中的一串数字可以看作为密码，另一串可看作为待猜测的数字，
将猜对了的数字（位置和数字都相同）个数记为：个数＋A，将位置不对而包含在密码中的数字个数记为：个数＋B

思路： 首先直接遍历两个字符串secret和guess找到bull的个数，具体代码第6-7
然后再创建新数组，把cows出现在secret和guess里的个数+1
Input: secret = "1807", guess = "7810"
Output: "1A3B"
Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
nums[secret.charAt(i) - '0']++ < 0   这里意思是  nums[secret.charAt(i) - '0'] < 0    nums[secret.charAt(i) - '0']++;
*/
