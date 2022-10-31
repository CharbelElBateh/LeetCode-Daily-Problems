1662.Check if Two String Arrays are Equivalent
===

Given two string arrays `word1` and `word2`, return `true` if the two arrays __represent__ the same string, and __false__ otherwise.

A string is __represented__ by an array if the array elements concatenated __in order__ forms the string.

__Example 1:__

```
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
```

__Example 2:__

```
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
```

__Example 3:__

```
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
```

__Constraints:__

+ `1 <= word1.length, word2.length <= 103`
+ `1 <= word1[i].length, word2[i].length <= 103`
+ `1 <= sum(word1[i].length), sum(word2[i].length) <= 103`
+ `word1[i]` and `word2[i]` consist of lowercase letters.