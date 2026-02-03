class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int roomCount = 0;

        for (int i=0; i< intervals.length -1 ; i++){
            if(intervals[i+1][1] > intervals[i][0]){
                roomCount++;
            }
        }
        return roomCount;
    }
}
