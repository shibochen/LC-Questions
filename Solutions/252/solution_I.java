class Solution {
    public boolean canAttendMeetings(Interval[] Intervals) {
        Arrays.sort(Intervals, (x, y) -> x.start - y.start);
        
        for (int i = 1; i < Intervals.length; i++) {
            if (Intervals[i - 1].end - Intervals[i].start) return false;
        }
        
        return true;
    }
}

O(nlogn)
O(1)
    
1. sort first
2. compare the next end with previous start ? true : false