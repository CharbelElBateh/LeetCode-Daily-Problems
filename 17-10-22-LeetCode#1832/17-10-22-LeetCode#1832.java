//LeetCode #1832 Check if the sentence is Pangram
class Solution {
    public boolean checkIfPangram(String sentence) {
        //This approach is based on taking only unique characters
        //And counting their number
        //Global Time Complexity: O(n);
        //Global Space Complexity: O(1);
        
        //String should contain at least all the alphabet
        if(sentence.length() < 26) return false;
        
        //Strings are immutable, hence the need of a StringBuilder
        StringBuilder sb = new StringBuilder();
        
        //Looping through each character of the String
        //And adding it only if it is not present
        for(int i=0; i<sentence.length(); i++){
            if(sb.indexOf( "" + sentence.charAt(i) ) == -1){
                sb.append(sentence.charAt(i));
            }
        }
        
        //The length of the string should be the length of the alphabet
        return (sb.toString().length() == 26)? true: false;
    }
}