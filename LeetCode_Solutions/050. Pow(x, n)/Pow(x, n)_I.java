class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0) result *= x;
            x *= x;
        }
        return n < 0 ?  1 / result : result;
    }
}

/*
让i初始化为n，然后看i是否是2的倍数，是的话x乘以自己，否则res乘以x，i每次循环缩小一半，
直到为0停止循环。最后看n的正负，如果为负，返回其倒数
*/
