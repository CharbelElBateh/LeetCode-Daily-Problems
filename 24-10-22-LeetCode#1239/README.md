1239.Maximum Length of a Concatenated String with Unique Characters
===
You are given an array of strings `arr`. A string `s` is formed by the __concatenation__ of a __subsequence__ of `arr` that has __unique characters__.

_Return the __maximum__ possible length of `s`._

A __subsequence__ is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

__Example 1:__
```
Input: arr = ["un","iq","ue"]
Output: 4
Explanation: All the valid concatenations are:
- ""
- "un"
- "iq"
- "ue"
- "uniq" ("un" + "iq")
- "ique" ("iq" + "ue")
Maximum length is 4.
```
__Example 2:__
```
Input: arr = ["cha","r","act","ers"]
Output: 6
Explanation: Possible longest valid concatenations are "chaers" ("cha" + "ers") and "acters" ("act" + "ers").
```
__Example 3:__
```
Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
Output: 26
Explanation: The only string in arr has all 26 characters.
```

__Constraints:__

+ 1 <= arr.length <= 16`
+ 1 <= arr[i].length <= 26`
+ `arr[i]` contains only lowercase English letters.
