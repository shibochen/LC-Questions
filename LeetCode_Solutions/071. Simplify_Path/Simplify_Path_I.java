class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        //这里主要是把该路径名加进去，排除"" .  ..
        for(String s : paths){
          // 7 & 8 不能合并写，不然出错
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!s.equals(".") && !s.isEmpty()){
                stack.push(s);
            }
        }
        String result = "";
        //输出返回值
        while(!stack.isEmpty()){
            result = "/" + stack.pop() + result;
        }
        //处理特殊情况
        return result.isEmpty() ? "/" : result;
    }
}

/*
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

路径用split分了以后，只有四个结果： "" .  ..  dsa
. 意思当前位置
.. 跳回上一个位置

特别case：
path = "/../"， => "/"
path = "/home//foo/" => "/home/foo"

Time: O(n)  Space: O(n)
*/
