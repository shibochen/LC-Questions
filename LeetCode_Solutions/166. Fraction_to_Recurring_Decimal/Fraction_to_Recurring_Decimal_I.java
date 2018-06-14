class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();

        res.append((numerator > 0) ^ (denominator > 0) ? "-" : "");  //^相同为true，不同取反 （相同为0，不同为本身）
        long num = Math.abs((long) numerator);  //防止overflow，所以扩充
        long den = Math.abs((long) denominator); //防止overflow，所以扩充

        //integral part
        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        //fractional part
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }
}
/*
hashmap来存数每个小数位上的数字为了节省搜索时间
由于我们要算出小数每一位，采取的方法是每次把余数乘10，再除以除数，得到的商即为小数的下一位数字。
等到新算出来的数字在之前出现过，则在循环开始出加左括号，结束处加右括号

The StringBuilder insert() method inserts the given string with this string at the given position.
比如
StringBuilder sb=new StringBuilder("Hello ");
sb.insert(1,"Java");//now original string is changed
System.out.println(sb);//prints HJavaello
*/
