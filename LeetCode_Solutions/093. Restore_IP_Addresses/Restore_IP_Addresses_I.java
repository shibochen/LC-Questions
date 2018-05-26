class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        helper(s, 0 , "", list);
        return list;
    }
    private void helper(String s, int n, String out, List<String> list){
        if(n == 4){
            if(s.isEmpty()) list.add(out);
            return;
        }
        for(int i = 1; i < 4; i++){
            if(s.length() < i) break;
            int val = Integer.parseInt(s.substring(0, i));
            if((val >= 256) || i != String.valueOf(val).length()) continue;
            helper(s.substring(i), n + 1, out + s.substring(0, i) + (n == 3 ? "" :"."), list);
        }
    }
}
