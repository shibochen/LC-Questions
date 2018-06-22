class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                List<Integer> part1 = diffWaysToCompute(input.substring(0, i));
                List<Integer> part2 = diffWaysToCompute(input.substring(i + 1));
                for (Integer p1 : part1) {
                    for (Integer p2 : part2) {
                        if (c == '-') {
                            result.add(p1 - p2);
                        } else if (c == '+') {
                            result.add(p1 + p2);
                        } else if (c == '*') {
                            result.add(p1 * p2);
                        }
                    }
                }
            }
        }

        if (result.size() == 0) result.add(Integer.valueOf(input));

        return result;
    }
}
