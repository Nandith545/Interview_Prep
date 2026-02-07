class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //set the minimum speed
        int minSpeed = 1;

        //Find the max speed from the pile
        int maxSpeed = 0;
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }

        //Next part will just be a binary search
        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;

            if(canEatInTime(piles, h, mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    private static boolean canEatInTime(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile: piles){
            hours += (int) Math.ceil((double)pile/speed);
        }
        return hours <= h;
    }
}
