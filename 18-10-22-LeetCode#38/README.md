38.Count And Say
===

The __count-and-say__ sequence is a sequence of digit strings defined by the recursive formula:

+ `countAndSay(1) = "1"`
+ `countAndSay(n)` is the way you would "say" the digit string from `countAndSay(n-1)`, which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the __minimal__ number of substrings such that each substring contains exactly __one__ unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string `"3322251"`:

![countandsay](https://user-images.githubusercontent.com/99130418/198826076-aaeb0ad5-4fe8-43f2-ab6c-109d70b84974.jpg)

Given a positive integer `n`, return the `n th` term of the __count-and-say__ sequence.

__Example 1:__

```
Input: n = 1
Output: "1"
Explanation: This is the base case.
```

__Example 2:__

```
Input: n = 4

Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 ```

__Constraints:__

+ `1 <= n <= 30`
