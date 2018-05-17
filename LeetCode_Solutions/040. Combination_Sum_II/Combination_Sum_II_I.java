class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
        if(remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i - 1]) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

/*
http://www.pythontutor.com/visualize.html#code=import%20java.util.ArrayList%3B%0Aimport%20java.util.Arrays%3B%0Aimport%20java.util.List%3B%0A%0Apublic%20class%20combosum2%20%7B%0A%20%20%20%20%20public%20static%20List%3CList%3CInteger%3E%3E%20combinationSum2%28int%5B%5D%20candidates,%20int%20target%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20List%3CList%3CInteger%3E%3E%20list%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20Arrays.sort%28candidates%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20new%20ArrayList%3C%3E%28%29,%20candidates,%20target,%200%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20list%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20private%20static%20void%20backtrack%28List%3CList%3CInteger%3E%3E%20list,%20List%3CInteger%3E%20tempList,%20int%5B%5D%20nums,%20int%20remain,%20int%20start%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%28remain%20%3C%200%29%20return%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20else%20if%20%28remain%20%3D%3D%200%29%20list.add%28new%20ArrayList%3C%3E%28tempList%29%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20else%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20for%28int%20i%20%3D%20start%3B%20i%20%3C%20nums.length%3B%20i%2B%2B%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%28i%20%3E%20start%20%26%26%20nums%5Bi%5D%20%3D%3D%20nums%5Bi%20-%201%5D%29%20continue%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20tempList.add%28nums%5Bi%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20tempList,%20nums,%20remain%20-%20nums%5Bi%5D,%20i%20%2B%201%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20tempList.remove%28tempList.size%28%29%20-%201%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B2,5,2,1,2%7D%3B%0A%20%20%20%20%20%20%20%20int%20target%20%3D%205%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20System.out.println%28combinationSum2%28nums,%20target%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
