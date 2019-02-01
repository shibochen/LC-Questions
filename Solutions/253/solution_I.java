class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int result = 0;
        int end = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (start[i] < end[end]) {
                result++;
            } else {
                end++;
            }
        }
        return result;
    }
}

O(nlogn)
O(n)
    
1. create two new array
2. put start into one array and put end into another array
3. compare them and update result and end based on conditions
4. return result