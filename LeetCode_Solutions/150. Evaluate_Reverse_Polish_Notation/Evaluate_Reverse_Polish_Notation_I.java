class Solution {
   public int evalRPN(String[] a) {
  Stack<Integer> stack = new Stack<Integer>();

  for (int i = 0; i < a.length; i++) {
    switch (a[i]) {
      case "+":
        stack.push(stack.pop() + stack.pop());
        break;

      case "-":
        stack.push(-stack.pop() + stack.pop());
        break;

      case "*":
        stack.push(stack.pop() * stack.pop());
        break;

      case "/":
        int n1 = stack.pop(), n2 = stack.pop();
        stack.push(n2 / n1);
        break;

      default:
        stack.push(Integer.parseInt(a[i]));
    }
  }

  return stack.pop();
}
}

/*
题意： 在一个数组内的字符，能进行+-/*的运算，找出最终答案

思路： 一开始看不懂题目，其实就是当遇到+-/*时，把他前两个数字进行运算
1. 利用stack进行运算
2. 遇到不同符号，进行对应的运算
3. 弹出最后一个值，那就是我们所要找到的结果

Time： O(n)     Space: O(1)

*/
