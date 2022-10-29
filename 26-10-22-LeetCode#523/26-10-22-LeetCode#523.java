//LeetCode#523 Continious SubArray Sum
class Solution {
	public boolean checkSubarraySum(int[] nums, int k) {
        //The logic behind it is finding consecutive values from n to m that sums up to a multiple of k
        //Using prefix sums helps with getting consecutive values' sums
        //so we need (a + b + ... + z) % k == 0
        //Using prefix sums we have (prefix(z) - prefix(a)) % k == 0
        //Upon arithmetic distribution we get the condition that needs to be satisfied
        //prefix(z) % k == prefix(a) % k
        //So if we stumble upon a mod that we already found before it means that there is indeed such subarray sum
        //But there is only one last condition to take care of which is that the distance between the two value should be >2
        //This can be done easily if we store the prefix sums with the values needed to get to it
        //Hence the use of a hashmap
        
        //Map storing the prefix sums along with the number of values it required to get to it
		Map<Integer, Integer> map = new HashMap<>();
        
        //Default prefix sum of 0 elements
        int sum = 0;
        
        //Since arrays are 0-index based putting 0 would result in a logical error
        //While calculating the distance of it took to get to the mod -0 would have no sense hence not considering the first value
        //In some cases could lead to a wrong answer since upon calculation the distance would be <2
        //-(-1) => +1 would make sense, by making the implementation consider the fist value
        map.put(sum, -1);

        //Looping through the array to find the prefix sums and if we encountered their modulo before
        for (int i = 0; i < nums.length; i ++) {
            
            //Increase the prefix sum with the element
			sum += nums[i]; 
            
            //Storing its modulo
            sum = sum % k;
            
            //If we encountered this mod before
			if(map.containsKey(sum)){
               //And the distance to the last instance of this mod is greater than 2
              if(i -map.get(sum) >= 2)
               return true;
            
            //Else store this mod to take it into consideration if we found it again
            }else map.put(sum, i);
		}

        //At this point the loop would have gone through all of the elements already and no valid answers were found
		return false;
	}
}