//LeetCode#219 Contains Duplicate II
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //k cannot be 0 since the indices are distinct
        if(k == 0) return false;
        
        //Map that stores the value of nums[i] and i
        Map<Integer, Integer> map = new HashMap<>();
        
        //Looping through the array to populate the map and stopping whenever we find a match to the conditions
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(i -map.get(nums[i]))<=k){
                return true;
            }
            map.put(nums[i], i);
        }
        
        //output if nothing was found
        return false;
    }
}
