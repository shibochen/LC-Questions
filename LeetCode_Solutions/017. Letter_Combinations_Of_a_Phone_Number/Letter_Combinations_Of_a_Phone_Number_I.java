class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.isEmpty()) return result;
        String[] map = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        for(int i = 0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
               //remove element
                String t = result.remove();
                //readd element to list
                for(char c : map[x].toCharArray())
                    result.add(t + c);
            }
        }
        return result;
    }
}

/*
利用FIFO queue 原理
这里必须用Linkedlist，它构建Queue， arraylist 不行 没有 peek（）和 remove（）
*/

/*
http://www.pythontutor.com/visualize.html#code=import%20java.util.LinkedList%3B%0Aimport%20java.util.List%3B%0A%0Apublic%20class%20phonenumber%20%7B%0A%20%20%20%20public%20%20static%20List%3CString%3E%20letterCombinations%28String%20digits%29%20%7B%0A%20%20%20%20%20%20%20%20LinkedList%3CString%3E%20ans%20%3D%20new%20LinkedList%3CString%3E%28%29%3B%0A%20%20%20%20%20%20%20%20if%28digits.isEmpty%28%29%29%20return%20ans%3B%0A%20%20%20%20%20%20%20%20String%5B%5D%20mapping%20%3D%20new%20String%5B%5D%20%7B%220%22,%20%221%22,%20%22abc%22,%20%22def%22,%20%22ghi%22,%20%22jkl%22,%20%22mno%22,%20%22pqrs%22,%20%22tuv%22,%20%22wxyz%22%7D%3B%0A%20%20%20%20%20%20%20%20ans.add%28%22%22%29%3B%0A%20%20%20%20%20%20%20%20for%28int%20i%20%3D0%3B%20i%3Cdigits.length%28%29%3Bi%2B%2B%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20int%20x%20%3D%20Character.getNumericValue%28digits.charAt%28i%29%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20while%28ans.peek%28%29.length%28%29%3D%3Di%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20String%20t%20%3D%20ans.remove%28%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20for%28char%20s%20%3A%20mapping%5Bx%5D.toCharArray%28%29%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20ans.add%28t%2Bs%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20ans%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20String%20digits%20%3D%20%2223%22%3B%0A%20%20%20%20%20%20%20%20System.out.println%28letterCombinations%28digits%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
