class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) return intervals;
        List<Interval> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i++));
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i++).end);
        }
        result.add(newInterval);
        while (i < intervals.size()) {
            result.add(intervals.get(i++));
        }
        return result;
    }
}

1. first while add non-overlap interval
2. second while update newInterval
3. third while add rest of non-overlap interval


O(n)
O(n)