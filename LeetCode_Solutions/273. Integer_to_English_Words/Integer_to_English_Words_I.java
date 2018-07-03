class Solution {

    public String numberToWords(int num) {
        String s = format(num);
        // handle leading space
        if (s.charAt(0) == ' ') {
            return s.substring(1);
        }
        return s;
    }

    public String format(int num) {
        if (num == 0) return "Zero";
        StringBuffer sb = new StringBuffer();
        int bc = num / 1000000000;
        if (bc >= 1) {
            sb.append(format(bc));
            sb.append(" Billion");
            num %= 1000000000;
        }
        bc = num / 1000000;
        if (bc >= 1) {
            sb.append(format(bc));
            sb.append(" Million");
            num %= 1000000;
        }
        bc = num / 1000;
        if (bc >= 1) {
            sb.append(format(bc));
            sb.append(" Thousand");
            num %= 1000;
        }
        bc = num / 100;
        if (bc >= 1) {
            sb.append(format(bc));
            sb.append(" Hundred");
            num %= 100;
        }
        // 20-90
        if (num >= 20) {
            bc = num / 10;
            switch(bc) {
                case 2: sb.append(" Twenty"); break;
                case 3: sb.append(" Thirty"); break;
                case 4: sb.append(" Forty"); break;
                case 5: sb.append(" Fifty"); break;
                case 6: sb.append(" Sixty"); break;
                case 7: sb.append(" Seventy"); break;
                case 8: sb.append(" Eighty"); break;
                case 9: sb.append(" Ninety"); break;
            }
            num %= 10;
        }
        // 1-19
        if (num > 0) {
            switch(num) {
                case 1: sb.append(" One"); break;
                case 2: sb.append(" Two"); break;
                case 3: sb.append(" Three"); break;
                case 4: sb.append(" Four"); break;
                case 5: sb.append(" Five"); break;
                case 6: sb.append(" Six"); break;
                case 7: sb.append(" Seven"); break;
                case 8: sb.append(" Eight"); break;
                case 9: sb.append(" Nine"); break;
                case 10: sb.append(" Ten"); break;
                case 11: sb.append(" Eleven"); break;
                case 12: sb.append(" Twelve"); break;
                case 13: sb.append(" Thirteen"); break;
                case 14: sb.append(" Fourteen"); break;
                case 15: sb.append(" Fifteen"); break;
                case 16: sb.append(" Sixteen"); break;
                case 17: sb.append(" Seventeen"); break;
                case 18: sb.append(" Eighteen"); break;
                case 19: sb.append(" Nineteen"); break;
            }
        }
        return sb.toString();
    }
}

/*
Time: O(n)   Space: O(1);
*/
