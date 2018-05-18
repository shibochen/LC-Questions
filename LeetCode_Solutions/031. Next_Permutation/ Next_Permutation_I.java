class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //找到一个值，他的后一位比他大
        while(i >= 0 && nums[i + 1] <= nums[i]){
            i--;
        }
        //从右往左，找到一个值（j）比 i 大，然后进行互换
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //交换完后，把i后面的所有数字进行从小到大排列
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start){
        int i = start, j = nums.length - 1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
/*
一开始完全不懂的题目到底是什么意思，还是看别人解题思路才懂

比如：
input: 1 2 7 5 4 1
output: 1 4 1 2 5 7

从右往左找，找到一个值，他的后一位比他大， 在上面的例子里 7 > 2 ， 2就是我们想要找到的值
然后在重新右往左找，找到一个值比 2 大， 上面例子里 4 > 2， 所以就进行交换 变成 1 4 7 5 2 1
最后将 4 后面的所有数字进行从小到大的排列就可以了
*/
