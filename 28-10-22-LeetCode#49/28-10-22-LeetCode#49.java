//LeetCode#49 Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //This can be done by checking to which character group belongs each string of strs first
        //Then depending on that check if we already have that group and add it to it
        //Or if we need to create a new group for it
        
        //Creating the expected output
        List<List<String>> output = new ArrayList<>();
        
        //Hashmap that will store the group of characters as keys and a list of strings that belongs to it found in strs
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            //Use of a helper method that will get me the group of characters that string belongs to
            String characters = getCharacters(strs[i]);
            //If we never saw this group before create a placeholder for it
            map.putIfAbsent(characters, new ArrayList<String>());
            //Add the current string to the corresponding group
            map.get(characters).add(strs[i]);
        }
        
        //Transfer all the sorted-by-group string as list in the output
        output.addAll(map.values());
        
        return output;
    }
    
    private String getCharacters(String s){
        //Strings are immutable hence the use of StringBuilder
        StringBuilder sb = new StringBuilder();
        //There are 26 letters in the english alphabet and if the character is present its value will be >0
        int[] characters = new int[26];
        
        //Looping through the characters of the input String
        for(char c : s.toCharArray()){
            // c -'a' will actually return the distance between the current character and a
            //Later the characater that was stored can be retrived by adding 'a' to the index
            characters[c - 'a']++;
        }
        
        //26 is the size of characters[]
        for(int i = 0; i<26 ; i++){
            //If the character is present in the string append it along side its frequency to deal with edge cases
            if(characters[i] != 0) sb.append((char) i + 'a').append(characters[i]);
        }
        
        return sb.toString();
    }
}