class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), n, k, 1);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int n, int k, int start){
        if(k == 0){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = start; i <= n; i++){
            tempList.add(i);
            backtrack(list, tempList, n, k - 1, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

/*
http://www.pythontutor.com/visualize.html#code=import%20java.util.ArrayList%3B%0Aimport%20java.util.List%3B%0A%0Apublic%20class%20combon%20%7B%0A%20%20%20%20public%20static%20List%3CList%3CInteger%3E%3E%20combine%28int%20n,%20int%20k%29%20%7B%0A%20%20%20%20%20%20%20%20List%3CList%3CInteger%3E%3E%20list%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20backtrack%28list,%20new%20ArrayList%3C%3E%28%29,%20n,%20k,%201%29%3B%0A%20%20%20%20%20%20%20%20return%20list%3B%0A%20%20%20%20%7D%0A%20%20%20%20private%20static%20void%20backtrack%28List%3CList%3CInteger%3E%3E%20list,%20List%3CInteger%3E%20tempList,%20int%20n,%20int%20k,%20int%20start%29%7B%0A%20%20%20%20%20%20%20%20if%28k%20%3D%3D%200%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20list.add%28new%20ArrayList%3C%3E%28tempList%29%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%3B%0A%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20for%28int%20i%20%3D%20start%3B%20i%20%3C%3D%20n%3B%20i%2B%2B%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20tempList.add%28i%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20backtrack%28list,%20tempList,%20n,%20k%20-%201,%20i%20%2B%201%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20tempList.remove%28tempList.size%28%29%20-%201%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20System.out.println%28combine%284,2%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
