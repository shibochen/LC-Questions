class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            pre[i] = -1;
            for (int j = i - 1; j >=0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1;
                        pre[i] = j;
                    }
                }
            }
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        while (index != -1) {
            result.add(nums[index]);
            index = pre[index];
        }
        return result;
    }
}

/*
http://www.pythontutor.com/visualize.html#code=import%20java.util.*%3B%0Apublic%20class%20YourClassNameHere%20%7B%0A%20%20public%20static%20List%3CInteger%3E%20largestDivisibleSubset%28int%5B%5D%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20int%20n%20%3D%20nums.length%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20count%20%3D%20new%20int%5Bn%5D%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20pre%20%3D%20new%20int%5Bn%5D%3B%0A%20%20%20%20%20%20%20%20Arrays.sort%28nums%29%3B%0A%20%20%20%20%20%20%20%20int%20max%20%3D%200,%20index%20%3D%20-1%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20n%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20count%5Bi%5D%20%3D%201%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20pre%5Bi%5D%20%3D%20-1%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20j%20%3D%20i%20-%201%3B%20j%20%3E%3D0%3B%20j--%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%20%28nums%5Bi%5D%20%25%20nums%5Bj%5D%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%20%281%20%2B%20count%5Bj%5D%20%3E%20count%5Bi%5D%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20count%5Bi%5D%20%3D%20count%5Bj%5D%20%2B%201%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pre%5Bi%5D%20%3D%20j%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28count%5Bi%5D%20%3E%20max%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20max%20%3D%20count%5Bi%5D%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20index%20%3D%20i%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20List%3CInteger%3E%20result%20%3D%20new%20ArrayList%3C%3E%28%29%3B%0A%20%20%20%20%20%20%20%20while%20%28index%20!%3D%20-1%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20result.add%28nums%5Bindex%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20index%20%3D%20pre%5Bindex%5D%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20result%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B1,2,4,8%7D%3B%0A%20%20%20%20%20%20%20%20System.out.println%28largestDivisibleSubset%28nums%29%29%3B%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
