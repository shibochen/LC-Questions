class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                //It removes the item from the list which
                //is present at the specified index.
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

/*
[1,2,3] ---> [1,3,2]
第一次跑完输出[1,2,3]后，然后执行line15， 结果变成[1,2],
再执行line 15 变成 [1]，此时i = 1，然后跳到2, nums[2] = 3，
结果变成[1,3]，然后i从零开始， 结果出来[1,3,2]
后面过程跟以上类似
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
Time: O(n! * n)   Space: O(n)
*/

/*
http://www.pythontutor.com/visualize.html#code=import%20java.util.ArrayList%3B%0Aimport%20java.util.List%3B%0A%0Apublic%20class%20permutation%20%7B%0A%20%20%20%20public%20static%20List%3CList%3CInteger%3E%3E%20permute%28int%5B%5D%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20List%3CList%3CInteger%3E%3E%20list%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20new%20ArrayList%3C%3E%28%29,%20nums%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20return%20list%3B%0A%20%20%20%20%20%20%20%20%7D%0A%0A%20%20%20%20%20%20%20%20private%20static%20void%20backtrack%28List%3CList%3CInteger%3E%3E%20list,%20List%3CInteger%3E%20tempList,%20int%20%5B%5D%20nums%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20if%28tempList.size%28%29%20%3D%3D%20nums.length%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20list.add%28new%20ArrayList%3C%3E%28tempList%29%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%7D%20else%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20for%28int%20i%20%3D%200%3B%20i%20%3C%20nums.length%3B%20i%2B%2B%29%7B%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%28tempList.contains%28nums%5Bi%5D%29%29%20continue%3B%20//%20element%20already%20exists,%20skip%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20tempList.add%28nums%5Bi%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20tempList,%20nums%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20tempList.remove%28tempList.size%28%29%20-%201%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%20%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B1,2,3%7D%3B%0A%20%20%20%20%20%20%20%20System.out.println%28permute%28nums%29%29%3B%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
