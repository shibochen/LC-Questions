class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0, high = arr.length - k - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.abs(x - arr[mid]) > Math.abs(x - arr[mid + k])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(arr[low + i]);
        }
        return list;
    }
}
