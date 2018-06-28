class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int pos = bucket.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (bucket[pos] != null) {
                result.addAll(bucket[pos]);
            }
        }
        return result;
    }
}

/*
使用桶排序，在建立好数字和其出现次数的映射后，我们按照其出现次数将数字放到对应的位置中去，
这样我们从桶的后面向前面遍历，最先得到的就是出现次数最多的数字，我们找到k个后返回即可

The keySet() method is used to get a Set view of the keys contained in this map.  //return is an array

http://www.pythontutor.com/visualize.html#code=import%20java.util.ArrayList%3B%0Aimport%20java.util.HashMap%3B%0Aimport%20java.util.List%3B%0Aimport%20java.util.Map%3B%0A%0Apublic%20class%20topk%20%7B%0A%20%20%20%20public%20static%20List%3CInteger%3E%20topKFrequent%28int%5B%5D%20nums,%20int%20k%29%20%7B%0A%20%20%20%20%20%20%20%20List%3CInteger%3E%5B%5D%20bucket%20%3D%20new%20List%5Bnums.length%20%2B%201%5D%3B%0A%20%20%20%20%20%20%20%20Map%3CInteger,%20Integer%3E%20frequencyMap%20%3D%20new%20HashMap%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20for%20%28int%20n%20%3A%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20frequencyMap.put%28n,%20frequencyMap.getOrDefault%28n,%200%29%20%2B%201%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20for%20%28int%20key%20%3A%20frequencyMap.keySet%28%29%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20int%20frequency%20%3D%20frequencyMap.get%28key%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28bucket%5Bfrequency%5D%20%3D%3D%20null%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20bucket%5Bfrequency%5D%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20bucket%5Bfrequency%5D.add%28key%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20List%3CInteger%3E%20result%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20pos%20%3D%20bucket.length%20-%201%3B%20pos%20%3E%3D%200%20%26%26%20result.size%28%29%20%3C%20k%3B%20pos--%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28bucket%5Bpos%5D%20!%3D%20null%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20result.addAll%28bucket%5Bpos%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20result%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B1,1,2,2,3%7D%3B%0A%20%20%20%20%20%20%20%20int%20k%20%3D%202%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20System.out.println%28topKFrequent%28nums,%20k%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
