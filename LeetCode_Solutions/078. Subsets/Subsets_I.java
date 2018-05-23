class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

/*
backtrack
For example:  input:  [1,2,3]
              output: [[],[1],[1,2],[1,2,3],[2],[2,3],[3]]

http://www.pythontutor.com/visualize.html#code=import%20java.util.ArrayList%3B%0Aimport%20java.util.Arrays%3B%0Aimport%20java.util.List%3B%0A%0Apublic%20class%20subset%20%7B%0A%20%20%20%20public%20static%20List%3CList%3CInteger%3E%3E%20subsets%28int%5B%5D%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20List%3CList%3CInteger%3E%3E%20list%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20Arrays.sort%28nums%29%3B%0A%20%20%20%20%20%20%20%20backtrack%28list,%20new%20ArrayList%3C%3E%28%29,%20nums,%200%29%3B%0A%20%20%20%20%20%20%20%20return%20list%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20private%20static%20void%20backtrack%28List%3CList%3CInteger%3E%3E%20list%20,%20List%3CInteger%3E%20tempList,%20int%20%5B%5D%20nums,%20int%20start%29%7B%0A%20%20%20%20%20%20%20%20list.add%28new%20ArrayList%3C%3E%28tempList%29%29%3B%0A%20%20%20%20%20%20%20%20for%28int%20i%20%3D%20start%3B%20i%20%3C%20nums.length%3B%20i%2B%2B%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20tempList.add%28nums%5Bi%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20tempList,%20nums,%20i%20%2B%201%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20tempList.remove%28tempList.size%28%29%20-%201%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B1,2,3%7D%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20System.out.println%28subsets%28nums%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
