class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] visited){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
                tempList.add(nums[i]);
                visited[i] = true;
                backtrack(list, tempList, nums, visited);
                visited[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

/*
Similar to LC 46
使用排列式深度优先搜索算法
和没有重复元素的 Permutation 一题相比，只加了两句话：
Arrays.sort(nums) // 排序这样所有重复的数
if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) { continue; } // 跳过会造成重复的情况

*/
