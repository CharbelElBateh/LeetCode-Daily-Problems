//LeetCode#645 Set Mismatch
class Solution {
    
    //Helper method to swap two values inside an array knowing their indexes
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int i = 0;
        
        //Sorting the array such that nums[i] = i + 1
        while(i < len){
            int idx = nums[i] - 1;
            
            if(nums[i] != nums[idx])
                swap(i, idx, nums);
            else
                i++;
        }
        
        //Since the array should be sorted s.t nums[i] = i + 1,
        //If this condition is not met then it is the error
        for(int a = 0; a < len; a++){
            if(nums[a] != a + 1)
                return new int[]{nums[a], a+1};
        }
        
        //Dummy value output
        return new int[]{0,0};
    }
}