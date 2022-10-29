//LeetCode#1239 Maximum Length of a Concatenated String with Unique Characters
class Solution {
    //This is a dynamic programming approach by backtracking
    
    //placeholder for the maximum length needed
    int max = 0;

    public int maxLength(List<String> arr) {
        //Loop through the elements of the list and update the maximum length if it has unique characters
        updateMaxLength(arr, 0, "");
        //Output
        return max;
    }

    //Helper Method to calculate maxlength after finding it is a maximum
    private void updateMaxLength(List<String> arr, int index, String s){
        ////if it has only unique characters find if it is a maximum
        if(hasOnlyUnique(s)) max = Math.max(max, s.length());

        //if it does not have unique characters or we got to the end of the list do nothing
        if(!hasOnlyUnique(s) || index == arr.length()) return;

        //Do the backtracking to find other combinations starting from a different new index
        for(int i = index; i < arr.size(); i++){
            updateMaxLength(arr, i + 1, s+arr.get(i));
        }
    }

    //Helper method to find if the string has only unique characters
    private boolean hasOnlyUnique(String s) {
        //Array storing all the characters from the string in form of distance to 'a'
        int[] characters = new int[26];
        for(char c: s.toCharArray()){
            //if the character was encountered more than once it has non unique characters
            if(characters[c- 'a']++ >0) return false;
        }
        //Getting here means that the string has only unique characters
        return true;
    }
}
