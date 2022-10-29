class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        //Pairing the plant time and grow time of each plant i in a 2D array
        int[][] pairs = new int[plantTime.length][2];
        
        for (int i = 0; i < plantTime.length; i++) {
            //Plant time of plant i
            pairs[i][0] = plantTime[i];
            //Grow time of plant i
            pairs[i][1] = growTime[i];
        }
        
        //Sorting them in a descending order of grow time
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        
        //Total planting days
        int plantingDays = 0;
        //Total optimal number of days to conform to the requirements
        int totalDays = 0;
        
        //Go through each plants plant and grow time
        for (int[] pair : pairs) {
            //If the days of planting and growing added to the total days are bigger than already computed number of days update it
            totalDays = Math.max(totalDays, plantingDays + pair[0] + pair[1]);
            //Updating the total number of days
            plantingDays += pair[0];
        }
        
        //Output
        return totalDays;
    }
}