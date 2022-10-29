//LeetCode#76 Minimum Window Substring
class Solution {
    public String minWindow(String s, String t) {
        //This solution was coded using two pointers method
        //Global Time Complexity: O(m+n)
        //Global Space Complexity: O(1)
        
        //Edge cases
        if(s.compareTo(t) == 0) return s;
        if(t == "" || s == "") return "";
        if(t == null || s == null) return "";
        
        //Storing the frequencies of characters in an array
        //We could have used a HashMap but it is easier to store them in an array due to having both Upper and Lower case characters
        int[] freq = new int[128];
        
        //Assigning characters to their place in the array
        for(char c : t.toCharArray())
            freq[c]++;
        
        //i: small pointer that will be moved last when finding a valid substring
        //j: big pointer that will be moved first until finding a valid substring
        //minLength: length of the smallest found substring after comparaison
        //counter: number of chars to find in s determined by t
        int i = 0, j = 0, minStart = 0, minLength = Integer.MAX_VALUE, counter = t.length();
        
        while(j<s.length()){
            
            char currentChar = s.charAt(j);
            
            //If the current character is found in t -> reduce the characters left to search for
            if(freq[currentChar] > 0) counter--;
            
            //Reducing the frequency of the current character to take into consideration duplicates
            //If the frequency is already 0, we do not have to worry since we only consider the case where it is greater
            freq[currentChar]--;
            
            //Rncreasing the big counter
            j++;
            
            //Runs when finding a substring containing all the characters from t
            while(counter == 0){
                
                //Checking wether the substring we got is in fact the smallest substring
                if(minLength > j - i){
                    //Update the minimum length
                    minLength = j - i;
                    //And where it can be found
                    minStart = i;
                }
                
                //Now we need to check another window since we did not reach the end of the string yet by increasing the small pointer and adding the last character back to the needed character for a valid substring
                
                //Adding the character we are shifting from back:
                //The last character MUST have been present in t, else it would not have been the minimum substring
                freq[s.charAt(i)]++;
                //Taking into consideration the probability of the added character having a duplicate in t 
                if(freq[s.charAt(i)] > 0) counter++;
                //Increasing the small pointer
                i++;
            }
        }
        
        //Did we find a valid substring with a minimum length? If yes, return the substring with the minimum starting index. If not, an empty string
        
        return (minLength == Integer.MAX_VALUE)? "" : s.substring(minStart, minStart+minLength);
    }
}