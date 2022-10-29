//LeetCode#1662 Check If Two String Arrays are Equivalent
//This is a one-liner with simple solution
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //Using built-in methods to join the string in each array and compare them
        return String.join("", word1).equals(String.join("", word2));
    }
}