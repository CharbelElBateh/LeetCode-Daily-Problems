49.Group Anagrams
===

Given an array of strings `strs`, group __the anagrams__ together. You can return the answer in __any order__.

An __Anagram__ is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

__Example 1:__
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```
__Example 2:__
```
Input: strs = [""]
Output: [[""]]
```
__Example 3:__
```
Input: strs = ["a"]
Output: [["a"]]
```

__Constraints:__

+ `1 <= strs.length <= 10^4`
+ `0 <= strs[i].length <= 100`
+ `strs[i]` consists of lowercase English letters.
