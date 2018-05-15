class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

/*
规律：
1    Win
2    Win
3    Win
4    Lost
5    Win
6    Win
7    Win
8    Lost
9    Win
10   Win
由此我们可以发现规律，只要是4的倍数个，我们一定会输，所以对4取余即可

Time:O(1)   Space: O(1)
*/
